package com.pers.yefei.supper.stock.service.impl;

import com.pers.yefei.supper.stock.dao.IStockInfoDao;
import com.pers.yefei.supper.stock.dao.IStockPublicNoticeDao;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNotice;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNoticeObserver;
import com.pers.yefei.supper.stock.service.IStockPublicNoticeService;
import com.pers.yefei.supper.stock.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author yefei
 * @date: 2019/12/15
 */
@Slf4j
@Component
public class StockPublicNoticeServiceImpl implements IStockPublicNoticeService {

    @Autowired
    private IStockInfoDao stockInfoDao;

    @Autowired
    private IStockPublicNoticeDao stockPublicNoticeDao;

    @Override
    public void savePublicNotice(List<TblStockPublicNotice> stockPublicNoticeList) {

        stockPublicNoticeList.stream().forEach(stockPublicNotice->{
            try {
                stockPublicNoticeDao.insertStockPublicNotice(stockPublicNotice);

            } catch (DuplicateKeyException e) {
                // ignore
            } catch (Exception e) {
                log.error("保存公告异常", e);
            }
        });
    }

    @Override
    public List<TblStockPublicNoticeObserver> queryStockPublicNoticeObserver() {

        return stockPublicNoticeDao.queryStockPublicNoticeObserver();
    }

    @Override
    public List<TblStockPublicNotice> queryStockPublicNoticeByDate(String keywords, Date date) {
        return stockPublicNoticeDao.queryTblStockPublicNoticeByDate(keywords, DateUtils.getZeroDate(date));
    }


    @Override
    public List<TblStockPublicNotice> queryStockPublicNoticeByLessTime(String keywords, Date lessTime) {
        return stockPublicNoticeDao.queryTblStockPublicNoticeByLessTime(keywords, lessTime);
    }


}
