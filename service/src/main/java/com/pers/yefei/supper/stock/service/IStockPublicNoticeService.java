package com.pers.yefei.supper.stock.service;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNotice;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNoticeObserver;

import java.util.Date;
import java.util.List;

/**
 * @author yefei
 * @date: 2019/12/15
 */
public interface IStockPublicNoticeService {
    void savePublicNotice(List<TblStockPublicNotice> stockPublicNoticeList);

    List<TblStockPublicNoticeObserver> queryStockPublicNoticeObserver();

    List<TblStockPublicNotice> queryStockPublicNotice(String keywords, Date date);
}
