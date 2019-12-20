package com.pers.yefei.supper.stock.dao.impl;

import com.pers.yefei.supper.stock.dao.IStockInfoDao;
import com.pers.yefei.supper.stock.dao.IStockPublicNoticeDao;
import com.pers.yefei.supper.stock.model.gen.dao.StockMapper;
import com.pers.yefei.supper.stock.model.gen.dao.TblStockInfoMapper;
import com.pers.yefei.supper.stock.model.gen.dao.TblStockPublicNoticeMapper;
import com.pers.yefei.supper.stock.model.gen.dao.TblStockPublicNoticeObserverMapper;
import com.pers.yefei.supper.stock.model.gen.pojo.*;
import com.pers.yefei.supper.stock.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: yefei
 * @date: 2018/10/4 22:03
 */
@Repository
public class StockPublicNoticeDaoImpl implements IStockPublicNoticeDao {

    @Autowired
    private TblStockPublicNoticeMapper stockPublicNoticeMapper;

    @Autowired
    private TblStockPublicNoticeObserverMapper stockPublicNoticeObserverMapper;

    private List<TblStockPublicNotice> empty = new ArrayList<>();

    @Override
    public void insertStockPublicNotice(TblStockPublicNotice tblStockPublicNotice) {
        stockPublicNoticeMapper.insertSelective(tblStockPublicNotice);
    }


    @Override
    public List<TblStockPublicNotice> queryTblStockPublicNoticeByDate(String keywords, Date date) {
        if (StringUtils.isEmpty(keywords)) {
            return empty;
        }
        TblStockPublicNoticeExample example = new TblStockPublicNoticeExample();
        example.createCriteria().andNoticeDateEqualTo(date).andKeywordsLike(MessageFormat.format("%{0}%", keywords));
        return stockPublicNoticeMapper.selectByExample(example);
    }

    @Override
    public List<TblStockPublicNotice> queryTblStockPublicNoticeByLessTime(String keywords, Date lessTime) {
        if (StringUtils.isEmpty(keywords)) {
            return empty;
        }
        TblStockPublicNoticeExample example = new TblStockPublicNoticeExample();
        example.createCriteria().andUpdateTimeGreaterThan(lessTime).andKeywordsLike(MessageFormat.format("%{0}%", keywords));
        return stockPublicNoticeMapper.selectByExample(example);
    }


    // 以下是 公告订阅信息
    @Override
    public List<TblStockPublicNoticeObserver> queryStockPublicNoticeObserver() {
        TblStockPublicNoticeObserverExample example = new TblStockPublicNoticeObserverExample();
        example.createCriteria().andIsActiveEqualTo(true);
        return stockPublicNoticeObserverMapper.selectByExample(example);
    }

}
