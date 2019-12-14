package com.pers.yefei.supper.stock.model.bean;

import lombok.Data;

/**
 * @author: yefei
 * @date: 2019/4/29 20:58
 */
@Data
public class SinaStock {
    private String stockCode;
    private String stockName;
    private String todayOpenPrice;
    private String priceChange;
    private String currentPrice;
    private String priceChangeRate;
    private String dealQuantity;
    private String dealAmount;
}
