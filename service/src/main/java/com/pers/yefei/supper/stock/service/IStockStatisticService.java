package com.pers.yefei.supper.stock.service;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;

import javax.script.ScriptException;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/26 01:26
 * @desc: 股票得分采集服务
 */
public interface IStockStatisticService {

    List<TblStockScoreChange> queryStockScoreChangeByDate(Date date);
}
