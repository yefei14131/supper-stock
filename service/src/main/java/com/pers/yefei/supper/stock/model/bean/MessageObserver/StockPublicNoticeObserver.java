package com.pers.yefei.supper.stock.model.bean.MessageObserver;

/**
 * @author yefei
 * @date: 2019/12/15
 */

import com.pers.yefei.supper.stock.model.bean.StockPublicNoticeInfo;
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
public class StockPublicNoticeObserver extends MessageBaseObserver {

    protected String keywords;
    protected Date date;
    protected List<StockPublicNoticeInfo> stockPublicNoticeInfoList = new ArrayList<>();

    public StockPublicNoticeObserver (){
        this.title = "股票公告推送";
    }

    public StockPublicNoticeObserver(TblStockPublicNoticeObserver tblStockPublicNoticeObserver) {
        this.keywords = tblStockPublicNoticeObserver.getKeywords();
        this.memo = tblStockPublicNoticeObserver.getMemo();
        this.title = "股票公告推送";
    }


    public void addStockPublicNoticeList(List<TblStockPublicNotice> tblStockPublicNotices){
        tblStockPublicNotices.forEach(tblStockPublicNotice-> {
            stockPublicNoticeInfoList.add(new StockPublicNoticeInfo(tblStockPublicNotice));
        });
    }

}
