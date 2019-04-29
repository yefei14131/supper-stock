package com.pers.yefei.supper.stock.enums;

/**
 * @author: yefei
 * @date: 2019/4/29 22:08
 */
public enum StockTransType {

    BUY(1), SELL(2);

    private int type;

    StockTransType(int type){
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
