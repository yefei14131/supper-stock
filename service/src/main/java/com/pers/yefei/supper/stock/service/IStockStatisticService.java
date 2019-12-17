package com.pers.yefei.supper.stock.service;

import com.pers.yefei.supper.stock.model.bean.StockScoreChangeInfo;
import com.pers.yefei.supper.stock.model.bean.StockScoreChangeSummary;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockTrans;

import javax.script.ScriptException;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/26 01:26
 * @desc: 股票得分采集服务
 */
public interface IStockStatisticService {

    List<TblStockScoreChange> queryStockScoreChangeByDate(Date date);

    StockScoreChangeSummary queryStockScoreChangeInfoByDate(Date date);

    /**
     * 计算当日采集进度
     * @return
     */
    HashMap collectProgress();

    List<TblStockTrans> queryStockTransByDay(Date date);


    boolean isHolidays(Date date);
}
