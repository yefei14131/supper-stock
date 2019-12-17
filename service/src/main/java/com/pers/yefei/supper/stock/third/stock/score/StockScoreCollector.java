package com.pers.yefei.supper.stock.third.stock.score;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.third.stock.score.goal.GoGoalStockScoreCollector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yefei
 * @date: 2019/12/16
 */
@Component
public class StockScoreCollector {

    @Autowired
    private GoGoalStockScoreCollector goGoalStockScoreCollector;

    public TblStockScore fetchStockScore(String stockCode) {


        return goGoalStockScoreCollector.fetchStockScore(stockCode);
    }

    public void fetchStockScore(TblStockScore stockScore) {
        goGoalStockScoreCollector.fetchStockScore(stockScore);
    }

}
