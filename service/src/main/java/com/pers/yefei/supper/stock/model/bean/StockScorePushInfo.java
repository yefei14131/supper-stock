package com.pers.yefei.supper.stock.model.bean;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import lombok.Data;

import java.util.Date;
import java.util.HashMap;

/**
 * @author yefei
 * @date: 2019/12/16
 */
@Data
public class StockScorePushInfo {

    private String pushReason;
    private TblStockScore tblStockScore;
    private TblStockScoreChange tblStockScoreChange;
}
