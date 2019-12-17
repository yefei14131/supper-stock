package com.pers.yefei.supper.stock.model.bean;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author yefei
 * @date: 2019/12/16
 */
@Data
public class StockScoreChangeInfo extends StockBaseInfo {

    private Date date;
    private String changeField;
    private int changeValue;
    private int prevValue;
    private int currentValue;

    public void from(TblStockScoreChange tblStockScoreChange){
        this.date = tblStockScoreChange.getDate();
        this.changeValue = tblStockScoreChange.getChangeValue();
        this.prevValue = tblStockScoreChange.getPreValue();
        this.currentValue = tblStockScoreChange.getTodayValue();
        this.changeField = this.getFieldName(tblStockScoreChange.getFieldName());
        this.stockCode = tblStockScoreChange.getStockCode();
        this.stockName = tblStockScoreChange.getStockName();
    }

    private static final HashMap<String, String> fieldMap = new HashMap<>();

    static {
        fieldMap.put("organizationHoldScore", "机构持仓");
    }

    private String getFieldName(String field) {
        return fieldMap.containsKey(field) ? fieldMap.get(field) : "";
    }
}
