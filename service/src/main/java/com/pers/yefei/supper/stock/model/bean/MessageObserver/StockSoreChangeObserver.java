package com.pers.yefei.supper.stock.model.bean.MessageObserver;

import com.pers.yefei.supper.stock.model.bean.StockScoreChangeSummary;
import lombok.Data;

import java.util.Date;

/**
 * @author yefei
 * @date: 2019/12/16
 */
@Data
public class StockSoreChangeObserver extends MessageBaseObserver {

    protected StockScoreChangeSummary stockScoreChangeSummary;

    protected Date date;

    public void fromStockScoreChangeSummary(StockScoreChangeSummary stockScoreChangeSummary) {
        this.stockScoreChangeSummary = stockScoreChangeSummary;
        this.title = "股票评分变化推送";
        this.date = stockScoreChangeSummary.getDate();
    }
}
