package com.pers.yefei.supper.stock.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNotice;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNoticeObserver;

import java.util.Date;
import java.util.List;

/**
 * @author yefei
 * @date: 2019/12/15
 */
public interface IStockPublicNoticeDao {

    void insertStockPublicNotice(TblStockPublicNotice tblStockPublicNotice);

    List<TblStockPublicNotice> queryTblStockPublicNoticeByDate(String keywords, Date date);

    List<TblStockPublicNotice> queryTblStockPublicNoticeByLessTime(String keywords, Date lessTime);

    // 以下是 公告订阅信息
    List<TblStockPublicNoticeObserver> queryStockPublicNoticeObserver();
}
