package com.pers.yefei.supper.stock.third.message.DingTalk;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest;
import com.dingtalk.api.response.OapiRobotSendResponse;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockPublicNoticeObserver;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockSoreChangeObserver;
import com.pers.yefei.supper.stock.model.bean.StockScoreChangeInfo;
import com.taobao.api.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.List;

/**
 * @author yefei
 * @date: 2019/12/15
 */
@Component
@Slf4j
public class DingTalkMessageSender {
    private static final String urlTemplate = "https://oapi.dingtalk.com/robot/send?access_token={0}&timestamp={1}&sign={2}";

    private String genUrl(String token){
        Long timestamp = System.currentTimeMillis();
        String sign = DingTalkSign.genSign(token, timestamp);
        String url = MessageFormat.format(urlTemplate, new Object[]{token, timestamp.toString(), sign});
        log.info("请求钉钉url：{}\n{}", timestamp, url );
        return url;
    }

    public void sendStockPublicNotice(StockPublicNoticeObserver stockPublicNoticeObserver) {
        try {
            String url = genUrl(stockPublicNoticeObserver.getThirdToken());
            DingTalkClient client = new DefaultDingTalkClient(url);
            OapiRobotSendRequest request = new OapiRobotSendRequest();

            request.setMsgtype("markdown");
            OapiRobotSendRequest.Markdown markdown = new OapiRobotSendRequest.Markdown();
            String title = stockPublicNoticeObserver.getTitle();
            markdown.setTitle(title);

            StringBuilder contentBuilder = new StringBuilder();
            contentBuilder.append( MessageFormat.format("### {0} {1}\n", new String[]{DateFormatUtils.format(stockPublicNoticeObserver.getDate(), "yyyy-MM-dd"), title}));
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
                }));
            });
            markdown.setText(contentBuilder.toString());
            request.setMarkdown(markdown);
            log.info("to DingTalk message:\n{}", contentBuilder.toString());
            OapiRobotSendResponse response = client.execute(request);

            log.info("向钉钉发送公告消息,response: \n{}, {}", response.getErrcode(), response.getErrmsg());
        } catch (ApiException e) {
            log.error("向钉钉发送公告消息失败", e);
        }
    }


    public void sendStockScoreChange(StockSoreChangeObserver stockSoreChangeObserver) {
        sendStockScoreChange(stockSoreChangeObserver, stockSoreChangeObserver.getStockScoreChangeSummary().getReduceList(), "减少");
        sendStockScoreChange(stockSoreChangeObserver, stockSoreChangeObserver.getStockScoreChangeSummary().getIncreaseList(), "增加");
    }

    private void sendStockScoreChange(StockSoreChangeObserver stockSoreChangeObserver, List<StockScoreChangeInfo> stockScoreChangeInfoList, String keyword) {
        try {

            String url = genUrl(stockSoreChangeObserver.getThirdToken());
            DingTalkClient client = new DefaultDingTalkClient(url);
            OapiRobotSendRequest request = new OapiRobotSendRequest();

            request.setMsgtype("markdown");
            OapiRobotSendRequest.Markdown markdown = new OapiRobotSendRequest.Markdown();
            String title = stockSoreChangeObserver.getTitle();
            markdown.setTitle(title);

            StringBuilder contentBuilder = new StringBuilder();
            contentBuilder.append( MessageFormat.format("### {0} {1}\n", new String[]{DateFormatUtils.format(stockSoreChangeObserver.getDate(), "yyyy-MM-dd"), title}));
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
                        }));
            });
            markdown.setText(contentBuilder.toString());
            request.setMarkdown(markdown);
            log.info("to DingTalk message:\n{}", contentBuilder.toString());
            OapiRobotSendResponse response = client.execute(request);

            log.info("向钉钉发送股票评分变化消息,response: \n{}, {}", response.getErrcode(), response.getErrmsg());
        } catch (ApiException e) {
            log.error("向钉钉发送股票评分变化消息失败", e);
        }

    }






















    public void sendTestMessage(StockPublicNoticeObserver stockPublicNoticeObserver) {
        try {
            Long timestamp = System.currentTimeMillis();
            String sign = DingTalkSign.genSign(stockPublicNoticeObserver.getThirdToken(), timestamp);
            String url = MessageFormat.format(urlTemplate, new Object[]{stockPublicNoticeObserver.getThirdToken(), timestamp.toString(), sign});

            log.info("请求钉钉url：{}\n{}", timestamp, url );
            DingTalkClient client = new DefaultDingTalkClient(url);
            OapiRobotSendRequest request = new OapiRobotSendRequest();
//            request.setMsgtype("text");
//            OapiRobotSendRequest.Text text = new OapiRobotSendRequest.Text();
//            text.setContent("测试文本消息");
//            request.setText(text);
//            OapiRobotSendRequest.At at = new OapiRobotSendRequest.At();
//            at.setAtMobiles(Arrays.asList("132xxxxxxxx"));
//            request.setAt(at);
//
//            request.setMsgtype("link");
//            OapiRobotSendRequest.Link link = new OapiRobotSendRequest.Link();
//            link.setMessageUrl("https://www.dingtalk.com/");
//            link.setPicUrl("");
//            link.setTitle("时代的火车向前开");
//            link.setText("这个即将发布的新版本，创始人xx称它为“红树林”。\n" +
//                    "而在此之前，每当面临重大升级，产品经理们都会取一个应景的代号，这一次，为什么是“红树林");
//            request.setLink(link);

            request.setMsgtype("markdown");
            OapiRobotSendRequest.Markdown markdown = new OapiRobotSendRequest.Markdown();
            markdown.setTitle("杭州天气");
            markdown.setText("#### 杭州天气 @156xxxx8827\n" +
                    "> 9度，西北风1级，空气良89，相对温度73%\n\n" +
                    "> ![screenshot](https://gw.alicdn.com/tfs/TB1ut3xxbsrBKNjSZFpXXcXhFXa-846-786.png)\n"  +
                    "> ###### 10点20分发布 [天气](http://www.thinkpage.cn/) \n");
            request.setMarkdown(markdown);

            OapiRobotSendResponse response = client.execute(request);

            log.info("向钉钉发送公告消息,response: \n{}, {}", response.getErrcode(), response.getErrmsg());
        } catch (ApiException e) {
            log.error("向钉钉发送公告消息失败", e);
        }
    }
}
