package com.pers.yefei.supper.stock.third.stock.info;

import com.pers.yefei.supper.stock.model.bean.EastMoneyNewStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.third.stock.info.east_money.EastMoneyNewStockCollector;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author yefei
 * @date: 2019/12/16
 */
@Component
@Slf4j
public class NewStockCollector {

    @Autowired
    private EastMoneyNewStockCollector eastMoneyNewStockCollector;

    public EastMoneyNewStockInfo fetchNewStock(int pageSize, int page){
        return eastMoneyNewStockCollector.fetchNewStock(pageSize, page);
    }

    public List<TblStockInfo> fetchNewStockByDay(Date date){
        return eastMoneyNewStockCollector.fetchNewStockByDay(date);
    }

}
