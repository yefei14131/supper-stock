package com.pers.yefei.supper.stock.third.message.DingTalk;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest;
import com.dingtalk.api.response.OapiRobotSendResponse;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.MessageBaseObserver;
import com.pers.yefei.supper.stock.model.bean.PushConfig.DingTalkPushConfigData;
import com.taobao.api.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.Date;
import java.util.function.Consumer;

/**
 * @author yefei
 * @date: 2019/12/21
 */
@Component
@Slf4j
public class DingTalkHelper {
    private static final String urlTemplate = "https://oapi.dingtalk.com/robot/send?access_token={0}&timestamp={1}&sign={2}";

    /**
     * 发送markdown消息
     * @param messageObserver
     * @param contentBuilderAction
     */
    public void sendMarkdownMessage(MessageBaseObserver messageObserver, Consumer<StringBuilder> contentBuilderAction) {
        try {
            String url = genUrl(messageObserver);
            DingTalkClient client = new DefaultDingTalkClient(url);
            OapiRobotSendRequest request = new OapiRobotSendRequest();

            request.setMsgtype("markdown");
            OapiRobotSendRequest.Markdown markdown = new OapiRobotSendRequest.Markdown();
            String title = messageObserver.getTitle();
            markdown.setTitle(title);

            StringBuilder contentBuilder = new StringBuilder();
            contentBuilderAction.accept(contentBuilder);
            contentBuilder.append( MessageFormat.format("> ###### {0}", new String[]{DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss")}));

            markdown.setText(contentBuilder.toString());
            request.setMarkdown(markdown);
            log.info("to DingTalk message:\n{}", contentBuilder.toString());
            OapiRobotSendResponse response = client.execute(request);

            log.info("向钉钉发送markdown消息,response: \n{}, {}", response.getErrcode(), response.getErrmsg());
        } catch (ApiException e) {
            log.error("向钉钉发送markdown消息失败", e);
        }
    }

    /**
     * 生成url， 包括签名
     * @param messageObserver
     * @return
     */
    private String genUrl(MessageBaseObserver messageObserver){
        DingTalkPushConfigData pushConfigData = (DingTalkPushConfigData) messageObserver.getPushConfig().getPushConfigData();
        Long timestamp = System.currentTimeMillis();
        String sign = DingTalkSign.genSign(pushConfigData.getToken(), pushConfigData.getSecret(), timestamp);
        String url = MessageFormat.format(urlTemplate, new Object[]{pushConfigData.getToken(), timestamp.toString(), sign});
        log.info("{} 请求钉钉url：\n{}", timestamp, url );
        return url;
    }
}
