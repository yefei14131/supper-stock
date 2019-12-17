package com.pers.yefei.supper.stock.model.bean;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author yefei
 * @date: 2019/12/16
 */
@Data
public class StockScoreChangeSummary {
    protected Date date;
    protected List<StockScoreChangeInfo> increaseList = new ArrayList<>();
    protected List<StockScoreChangeInfo> reduceList = new ArrayList<>();
}
