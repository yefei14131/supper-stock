package com.pers.yefei.supper.stock.third.message;

import com.pers.yefei.supper.stock.enums.MessagePushTypeEnum;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockPublicNoticeObserver;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockScoreInfoObserver;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockSoreChangeObserver;
import com.pers.yefei.supper.stock.third.message.DingTalk.DingTalkMessageSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yefei
 * @date: 2019/12/15
 */
@Component
@Slf4j
public class MessageSender {

    @Autowired
    private DingTalkMessageSender dingTalkMessageSender;

    public void sendStockPublicNotice(StockPublicNoticeObserver stockPublicNoticeObserver){

        if (MessagePushTypeEnum.DingTalk.equals(stockPublicNoticeObserver.getPushConfig().getMessagePushType())){
            dingTalkMessageSender.sendStockPublicNotice(stockPublicNoticeObserver);
        } else {
            log.error("无法识别的消息推送类别： {}", stockPublicNoticeObserver.getPushConfig().getMessagePushType());
        }

    }


    public void sendStockScoreChange(StockSoreChangeObserver stockSoreChangeObserver) {
        log.info("需要推送的评分变化情况，增加：{}, 减少：{}", stockSoreChangeObserver.getStockScoreChangeSummary().getIncreaseList().size()
        , stockSoreChangeObserver.getStockScoreChangeSummary().getReduceList().size());

        if (MessagePushTypeEnum.DingTalk.equals(stockSoreChangeObserver.getPushConfig().getMessagePushType())){
            dingTalkMessageSender.sendStockScoreChange(stockSoreChangeObserver);
        } else {
            log.error("无法识别的消息推送类别： {}", stockSoreChangeObserver.getPushConfig().getMessagePushType());

        }
    }

    public void sendStockScore(StockScoreInfoObserver stockSoreObserver) {

        if (MessagePushTypeEnum.DingTalk.equals(stockSoreObserver.getPushConfig().getMessagePushType())){
            dingTalkMessageSender.sendStockScore(stockSoreObserver);
        } else {
            log.error("无法识别的消息推送类别： {}", stockSoreObserver.getPushConfig().getMessagePushType());

        }
    }
}
