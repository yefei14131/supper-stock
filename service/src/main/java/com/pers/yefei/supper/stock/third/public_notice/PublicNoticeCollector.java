package com.pers.yefei.supper.stock.third.public_notice;

import com.pers.yefei.supper.stock.model.bean.EastMoneyPublicNoticeInfo;
import com.pers.yefei.supper.stock.third.public_notice.east_money.PublicNoticeEasyMoneyCollector;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author yefei
 * @date: 2019/12/16
 */
@Slf4j
@Component
public class PublicNoticeCollector {

    @Autowired
    private PublicNoticeEasyMoneyCollector publicNoticeEasyMoneyCollector;

    public EastMoneyPublicNoticeInfo fetchPrevDayNotice(int pageSize, int page, Date noticeDate) {
        return publicNoticeEasyMoneyCollector.fetchPrevDayNotice(pageSize, page, noticeDate);
    }

}
