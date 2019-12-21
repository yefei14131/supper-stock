package com.pers.yefei.supper.stock.model.bean.MessageObserver;

/**
 * @author yefei
 * @date: 2019/12/15
 */

import com.pers.yefei.supper.stock.model.bean.StockScorePushInfo;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 股票订阅者信息
 */
@Data
public class StockScoreInfoObserver extends MessageBaseObserver {

    protected Date date;
    protected List<StockScorePushInfo> stockScorePushInfoList = new ArrayList<>();

    public StockScoreInfoObserver(){
        this.title = "订阅股票每日推送";
    }


}
