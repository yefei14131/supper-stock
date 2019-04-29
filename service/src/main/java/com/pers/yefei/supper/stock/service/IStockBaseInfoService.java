package com.pers.yefei.supper.stock.service;

import com.pers.yefei.supper.stock.model.bean.SinaStock;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockTrans;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/27 01:12
 * @desc: 股票基础数据服务，抓取网络数据
 */
public interface IStockBaseInfoService {

    SinaStock fetchStockInfo(String stockCode) throws IOException;

    String fetchSHCompositeStockPrice();

    HashMap<String, SinaStock> batchFetchStockInfo(List<String> stockCodeList);
}
