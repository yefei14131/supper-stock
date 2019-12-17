package com.pers.yefei.supper.stock.third.message;

import com.pers.yefei.supper.stock.enums.MessagePushTypeEnum;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockPublicNoticeObserver;
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
        stockPublicNoticeObserver.getMessagePushType();

        if (MessagePushTypeEnum.valueOf(stockPublicNoticeObserver.getMessagePushType()).equals(MessagePushTypeEnum.DingTalk)){
            dingTalkMessageSender.sendStockPublicNotice(stockPublicNoticeObserver);
        } else {
            log.error("无法识别的消息推送类别： {}", stockPublicNoticeObserver.getMessagePushType());
        }

    }


    public void sendStockScoreChange(StockSoreChangeObserver stockSoreChangeObserver) {
        stockSoreChangeObserver.getMessagePushType();

        if (MessagePushTypeEnum.valueOf(stockSoreChangeObserver.getMessagePushType()).equals(MessagePushTypeEnum.DingTalk)) {
            dingTalkMessageSender.sendStockScoreChange(stockSoreChangeObserver);
        } else {
            log.error("无法识别的消息推送类别： {}", stockSoreChangeObserver.getMessagePushType());

        }
    }
}
