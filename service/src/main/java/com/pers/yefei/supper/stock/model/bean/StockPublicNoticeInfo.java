package com.pers.yefei.supper.stock.model.bean;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNotice;
import lombok.Data;

import java.util.Date;

/**
 * @author yefei
 * @date: 2019/12/15
 */
@Data
public class StockPublicNoticeInfo extends StockBaseInfo {

    private String noticeCode;

    private String title;

    private Date noticeDate;

    private Date publicTime;

    private String keywords;

    private String url;


    public StockPublicNoticeInfo(TblStockPublicNotice tblStockPublicNotice){
        this.stockCode = tblStockPublicNotice.getStockCode();
        this.stockName = tblStockPublicNotice.getStockName();
        this.noticeCode = tblStockPublicNotice.getNoticeCode();
        this.title = tblStockPublicNotice.getTitle();
        this.noticeDate = tblStockPublicNotice.getNoticeDate();
        this.publicTime = tblStockPublicNotice.getPublicTime();
        this.keywords = tblStockPublicNotice.getKeywords();
        this.url = tblStockPublicNotice.getUrl();
    }

}
