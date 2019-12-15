package com.pers.yefei.supper.stock.model.bean;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pers.yefei.supper.stock.exception.EastMoneyDataParseException;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author yefei
 * @date: 2019/12/14
 */
@Slf4j
@Data
public class EastMoneyStockInfo {

    private int  price;         // f43     当前价格
    private int  maxPrice;      // f44     最高
    private int  minPrice;      // f45     最低
    private int  openPrice;     // f46     今开
    private int  dealQuantity;  // f47     成交手数
    private long  dealAmount;    // f48     成交金额
    private String  stockCode;  // f57     股票代码
    private String  stockName;  // f58     股票名称
    private double  totalValue;    // f116    总市值
    private double  flowValue;     // f117    流通市值
    private long  mainInflowAmount;  // f135    主力流入
    private long  mainOutflowAmount; // f136    主力流出
    private long  netInflow;         // f137    主力净流向
    private int  priceNetAssetRatio;    // f164    动态市盈率
    private int  priceProfitAssetRatio; // f167    市净率
    private int  turnoverRatio;     // f168    换手率
    private int  priceChange;       // f169    涨跌
    private int  priceChangeRatio;  // f170    涨跌幅

    static HashMap<String, String> fieldMapping;
    static String allField;
    static {

        String mapping = "{\n" +
                "    \"f43\":\"price\",\n" +
                "    \"f44\":\"maxPrice\",\n" +
                "    \"f45\":\"minPrice\",\n" +
                "    \"f46\":\"openPrice\",\n" +
                "    \"f47\":\"dealQuantity\",\n" +
                "    \"f48\":\"dealAmount\",\n" +
                "    \"f57\":\"stockCode\",\n" +
                "    \"f58\":\"stockName\",\n" +
                "    \"f116\":\"totalValue\",\n" +
                "    \"f117\":\"flowValue\",\n" +
                "    \"f135\":\"mainInflowAmount\",\n" +
                "    \"f136\":\"mainOutflowAmount\",\n" +
                "    \"f137\":\"netInflow\",\n" +
                "    \"f164\":\"priceNetAssetRatio\",\n" +
                "    \"f167\":\"priceProfitAssetRatio\",\n" +
                "    \"f168\":\"turnoverRatio\",\n" +
                "    \"f169\":\"priceChange\",\n" +
                "    \"f170\":\"priceChangeRatio\"\n" +
                "}";

        try {
            fieldMapping = new ObjectMapper().readValue(mapping, HashMap.class);
            StringBuffer fieldBuffer = new StringBuffer();
            Iterator<String> iterator = fieldMapping.keySet().iterator();

            while (iterator.hasNext()) {
                fieldBuffer.append(",");
                fieldBuffer.append(iterator.next());
            }

            allField = fieldBuffer.toString().replaceFirst(",", "");

        } catch (IOException e) {
            log.error("初始化东方财富字段映射关系异常" , e);
        }
    }

    public static EastMoneyStockInfo from(String eastMoneyData, String callbackFunc) {

        if (eastMoneyData.matches(".+?\"data:\"null.+?")) {
            throw new EastMoneyDataParseException(eastMoneyData);
        }
        try {
            eastMoneyData = eastMoneyData.replaceAll("^" + callbackFunc + "\\((.+?)data\":(.*?)\\}\\);$", "$2");
            Iterator<Map.Entry<String, String>> iterator = fieldMapping.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                eastMoneyData = eastMoneyData.replace(entry.getKey(), entry.getValue());
            }
            eastMoneyData = eastMoneyData.replace("\"-\"", "0");

            return new ObjectMapper().readValue(eastMoneyData, EastMoneyStockInfo.class);

        } catch (Exception e) {
            throw new EastMoneyDataParseException(eastMoneyData, e);
        }
    }

    public static String getAllField(){
        return allField;
    }
}
