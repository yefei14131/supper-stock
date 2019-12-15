package com.pers.yefei.supper.stock.model.bean;

/**
 * @author yefei
 * @date: 2019/12/15
 */

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNotice;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNoticeObserver;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 公告订阅者信息
 */
@Data
public class StockPublicNoticeObserver extends TblStockPublicNoticeObserver {

    private String keywords;
    private String thirdToken;
    private String memo;
    private String messagePushType;
    private Date date;
    private List<StockPublicNoticeInfo> stockPublicNoticeInfoList = new ArrayList<>();

    public StockPublicNoticeObserver (){}
    public StockPublicNoticeObserver(TblStockPublicNoticeObserver tblStockPublicNoticeObserver) {
        this.keywords = tblStockPublicNoticeObserver.getKeywords();
        this.thirdToken = tblStockPublicNoticeObserver.getThirdToken();
        this.memo = tblStockPublicNoticeObserver.getMemo();
        this.messagePushType = tblStockPublicNoticeObserver.getMessagePushType();
    }


    public void addStockPublicNoticeList(List<TblStockPublicNotice> tblStockPublicNotices){
        tblStockPublicNotices.forEach(tblStockPublicNotice-> {
            stockPublicNoticeInfoList.add(new StockPublicNoticeInfo(tblStockPublicNotice));
        });

    }

}
