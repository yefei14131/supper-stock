package com.pers.yefei.supper.stock.service.impl;

import com.pers.yefei.supper.stock.constant.SystemConstant;
import com.pers.yefei.supper.stock.dao.IStockInfoDao;
import com.pers.yefei.supper.stock.dao.IStockScoreChangeDao;
import com.pers.yefei.supper.stock.dao.IStockScoreDao;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockScoreInfoObserver;
import com.pers.yefei.supper.stock.model.bean.StockScorePushInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockObserver;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import com.pers.yefei.supper.stock.service.IPushConfigService;
import com.pers.yefei.supper.stock.service.IStockScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/26 01:28
 */
@Service
@Slf4j
public class StockScoreServiceImpl implements IStockScoreService {

    @Autowired
    private IStockInfoDao stockInfoDao;

    @Autowired
    private IStockScoreDao stockScoreDao;

    @Autowired
    private IStockScoreChangeDao stockScoreChangeDao;

    @Autowired
    private IPushConfigService pushConfigService;

    /**
     * 查询股票基本信息的订阅者，并查询评分和详细信息
     * @param date
     * @return
     */
    @Override
    public List<StockScoreInfoObserver> queryStockObserversFromDB(Date date) {
        HashMap<Integer, StockScoreInfoObserver> stockInfoObserverMap = new HashMap<>();

        // 从数据库查询关注的股票
        List<TblStockObserver> tblStockObservers = stockInfoDao.queryStockObserver();
        tblStockObservers.forEach(tblStockObserver -> {
            try {
                StockScoreInfoObserver stockScoreInfoObserver;
                // 按推送配置id分组
                if (!stockInfoObserverMap.containsKey(tblStockObserver.getPushConfigID())) {
                    stockScoreInfoObserver = new StockScoreInfoObserver();
                    stockScoreInfoObserver.setDate(date);

                    // 查询推送配置
                    stockScoreInfoObserver.setPushConfig(pushConfigService.getPushConfig(tblStockObserver.getPushConfigID()));

                    stockInfoObserverMap.put(tblStockObserver.getPushConfigID(), stockScoreInfoObserver);

                } else {
                    stockScoreInfoObserver = stockInfoObserverMap.get(tblStockObserver.getPushConfigID());
                }

                // 生成推送信息
                StockScorePushInfo stockScorePushInfo = genStockScorePushInfo(tblStockObserver.getStockCode(), date);
                if (stockScorePushInfo != null) {
                    stockScorePushInfo.setPushReason(tblStockObserver.getAddReason());
                    stockScoreInfoObserver.getStockScorePushInfoList().add(stockScorePushInfo);
                }

            } catch (Exception e) {
                log.error("", e);
            }
        });

        List<StockScoreInfoObserver> stockScoreInfoObservers = new ArrayList<>();
        stockScoreInfoObservers.addAll(stockInfoObserverMap.values());
        return stockScoreInfoObservers ;
    }



    /**
     * 根据行业关键字，查询评分及相关信息
     * @param industryKeywords
     * @param date
     * @return
     */
    public List<StockScoreInfoObserver> queryStockObservers(String industryKeywords, Date date) {
        HashMap<String, StockScoreInfoObserver> stockInfoObserverMap = new HashMap<>();

        // 根据日期、关键字 查询评分等信息
        List<TblStockScore> tblStockScores = stockScoreDao.queryStockScore(industryKeywords, date);
        tblStockScores.forEach( tblStockScore -> {
            StockScoreInfoObserver stockScoreInfoObserver;

            // 按行业分组
            if ( !stockInfoObserverMap.containsKey(tblStockScore.getIndustryDetail())) {
                stockScoreInfoObserver = new StockScoreInfoObserver();
                stockScoreInfoObserver.setDate(date);

                stockScoreInfoObserver.setPushConfig(pushConfigService.getPushConfig(SystemConstant.Default_PushConfigID));
                stockInfoObserverMap.put(tblStockScore.getIndustryDetail(), stockScoreInfoObserver);
            } else {
                stockScoreInfoObserver = stockInfoObserverMap.get(tblStockScore.getIndustryDetail());
            }
            stockScoreInfoObserver.setTitle("行业龙头："+ tblStockScore.getIndustryDetail() );

            stockScoreInfoObserver.getStockScorePushInfoList().add(genStockScorePushInfo(tblStockScore));
        });

        List<StockScoreInfoObserver> stockScoreInfoObservers = new ArrayList<>();
        stockScoreInfoObservers.addAll(stockInfoObserverMap.values());
        return stockScoreInfoObservers ;
    }


    private StockScorePushInfo genStockScorePushInfo(String stockCode, Date date) {
        TblStockScore stockScore = stockScoreDao.getStockScore(stockCode, date);
        return genStockScorePushInfo(stockScore);
    }

    private StockScorePushInfo genStockScorePushInfo(TblStockScore stockScore) {
        if (stockScore == null) {
            return null;
        }
        TblStockScoreChange stockScoreChange = stockScoreChangeDao.getStockScoreChangeByDate(stockScore.getStockCode(), stockScore.getDate());
        StockScorePushInfo stockScorePushInfo = new StockScorePushInfo();
        stockScorePushInfo.setTblStockScore(stockScore);
        stockScorePushInfo.setTblStockScoreChange(stockScoreChange);
        return stockScorePushInfo;
    }
}
