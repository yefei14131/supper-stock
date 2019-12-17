package com.pers.yefei.supper.stock.third.stock.info;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.third.stock.info.east_money.EastMoneyStockInfoCollector;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yefei
 * @date: 2019/12/16
 */
@Component
@Slf4j
public class StockInfoCollector {

    @Autowired
    private EastMoneyStockInfoCollector eastMoneyStockInfoCollector;

    public void fetchStockInfo(TblStockScore stockScore) {
        eastMoneyStockInfoCollector.fetchStockInfo(stockScore);
    }

    public void fetchStockInfo(TblStockInfo stockInfo) {
        eastMoneyStockInfoCollector.fetchStockInfo(stockInfo);
    }

    public String fetchSHCompositeStockPrice(){
        return eastMoneyStockInfoCollector.fetchSHCompositeStockPrice();
    }

}
