package com.pers.yefei.supper.stock.third.message.DingTalk;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest;
import com.dingtalk.api.response.OapiRobotSendResponse;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.MessageBaseObserver;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockPublicNoticeObserver;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockSoreChangeObserver;
import com.pers.yefei.supper.stock.model.bean.PushConfig.DingTalkPushConfigData;
import com.pers.yefei.supper.stock.model.bean.StockScoreChangeInfo;
import com.taobao.api.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author yefei
 * @date: 2019/12/15
 */
@Component
@Slf4j
public class DingTalkMessageSender {
    private static final String urlTemplate = "https://oapi.dingtalk.com/robot/send?access_token={0}&timestamp={1}&sign={2}";

    /**
     * 推送公告消息
     * @param stockPublicNoticeObserver
     */
    public void sendStockPublicNotice(StockPublicNoticeObserver stockPublicNoticeObserver) {
        sendMarkdownMessage(stockPublicNoticeObserver, contentBuilder -> {
            contentBuilder.append( MessageFormat.format("### {0} {1}\n", new String[]{DateFormatUtils.format(stockPublicNoticeObserver.getDate(), "yyyy-MM-dd"), stockPublicNoticeObserver.getTitle()}));
            contentBuilder.append( MessageFormat.format("#### 关键字：{0}\n", new String[]{stockPublicNoticeObserver.getKeywords()}));
            contentBuilder.append( MessageFormat.format("> #### 共计 {0} 条相关公告\n***\n", new String[]{String.valueOf(stockPublicNoticeObserver.getStockPublicNoticeInfoList().size())}));

            stockPublicNoticeObserver.getStockPublicNoticeInfoList().forEach(stockPublicNoticeInf->{
                contentBuilder.append( MessageFormat.format("> #### {0}, {1}, 总市值:{2}亿, {3}, 评分:{4},评分行业排名:{5}\n\n> ##### [{6}]({7})\n***\n",
                    new String[]{
                        stockPublicNoticeInf.getStockCode(),
                        stockPublicNoticeInf.getStockName(),
                        String.valueOf(stockPublicNoticeInf.getTotalValue()),
                        stockPublicNoticeInf.getIndustryName(),
                        String.valueOf(stockPublicNoticeInf.getTotalScore()),
                        String.valueOf(stockPublicNoticeInf.getIndustryRank()),
                        stockPublicNoticeInf.getTitle(),
                        stockPublicNoticeInf.getUrl()
                    })
                );
            });
        });
    }

    /**
     * 推送评分变化消息
     * @param stockSoreChangeObserver
     */
    public void sendStockScoreChange(StockSoreChangeObserver stockSoreChangeObserver) {
        sendStockScoreChange(stockSoreChangeObserver, stockSoreChangeObserver.getStockScoreChangeSummary().getReduceList(), "减少");
        sendStockScoreChange(stockSoreChangeObserver, stockSoreChangeObserver.getStockScoreChangeSummary().getIncreaseList(), "增加");
    }

    private void sendStockScoreChange(StockSoreChangeObserver stockSoreChangeObserver, List<StockScoreChangeInfo> stockScoreChangeInfoList, String keyword) {
        sendMarkdownMessage(stockSoreChangeObserver, contentBuilder -> {

            contentBuilder.append( MessageFormat.format("### {0} {1}\n", new String[]{DateFormatUtils.format(stockSoreChangeObserver.getDate(), "yyyy-MM-dd"), stockSoreChangeObserver.getTitle()}));
            contentBuilder.append( MessageFormat.format("#### 评分{0} 共计 {1} 只\n", new String[]{keyword, String.valueOf(stockScoreChangeInfoList.size())}));

            stockScoreChangeInfoList.forEach(stockScoreChangeInfo->{
                contentBuilder.append( MessageFormat.format("> #### {0}, {1}, 总市值:{2}亿, {3}, 评分:{4},评分行业排名:{5}\n\n> ##### {6}变化: {7}, 当前值: {8}\n***\n",
                    new String[]{
                        stockScoreChangeInfo.getStockCode(),
                        stockScoreChangeInfo.getStockName(),
                        String.valueOf(stockScoreChangeInfo.getTotalValue()),
                        stockScoreChangeInfo.getIndustryName(),
                        String.valueOf(stockScoreChangeInfo.getTotalScore()),
                        String.valueOf(stockScoreChangeInfo.getIndustryRank()),
                        stockScoreChangeInfo.getChangeField(),
                        String.valueOf(stockScoreChangeInfo.getChangeValue()),
                        String.valueOf(stockScoreChangeInfo.getCurrentValue())
                    })
                );
            });
        } );
    }

    /**
     * 发送markdown消息
     * @param messageObserver
     * @param contentBuilderAction
     */
    private void sendMarkdownMessage(MessageBaseObserver messageObserver, Consumer<StringBuilder> contentBuilderAction) {
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
