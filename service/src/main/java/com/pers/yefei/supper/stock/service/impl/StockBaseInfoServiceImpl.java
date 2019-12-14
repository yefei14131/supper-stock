package com.pers.yefei.supper.stock.service.impl;

import com.pers.yefei.supper.stock.model.bean.SinaStock;
import com.pers.yefei.supper.stock.service.IStockBaseInfoService;
import com.pers.yefei.supper.stock.utils.FileUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: yefei
 * @date: 2019/4/29 18:44
 */
@Slf4j
@Service
public class StockBaseInfoServiceImpl implements IStockBaseInfoService {

    final private String sinaStockApiPreffix = "http://hq.sinajs.cn/list=";
    final private int sinaApiSize = 50;


    @Override
    public SinaStock fetchStockInfo(String stockCode) throws IOException {
        String sinaStockApi = sinaStockApiPreffix + fillStockCode(stockCode);

        String content = doGet(sinaStockApi);

        SinaStock sinaStock = null;
        Pattern p = Pattern.compile("([0-9]{6})=(\\\".*?\\\")");
        Matcher m = p.matcher(content);
        while(m.find()) {
            String stockInfo = m.group(2);

            sinaStock = transSinaStock(stockCode, stockInfo);
        }
        return sinaStock;
    }


    @Override
    public String fetchSHCompositeStockPrice() {
        try {

            String sinaStockApi = "http://hq.sinajs.cn/list=s_sh000001";

            String content = doGet(sinaStockApi);

            SinaStock sinaStock = null;
            Pattern p = Pattern.compile("([0-9]{6})=(\\\".*?\\\")");
            Matcher m = p.matcher(content);
            while(m.find()) {
                String stockInfo = m.group(2);
                String[] strings = stockInfo.split(",");
                return strings[1];
            }
            return "0";
        }catch (Exception e){
            log.error(ExceptionUtils.getStackTrace(e));
            return "0";
        }
    }


    @Override
    public HashMap<String, SinaStock> batchFetchStockInfo(List<String> stockCodeList) {

        HashMap<String, SinaStock> sinaStockMap = new HashMap<>();

        try {
            List<String> fullStockCodeList = new ArrayList<>();
            int loopCount = stockCodeList.size() % sinaApiSize == 0 ? stockCodeList.size() / sinaApiSize : stockCodeList.size() / sinaApiSize + 1;


            for (int i=0; i<loopCount; i++){

                log.info("分步拉取实时股票信息，总记录数 {}， startIndex: {}, endIndex: {} ", stockCodeList.size(), i*sinaApiSize, i==loopCount-1 ? stockCodeList.size() : (i+1)*sinaApiSize);

                fullStockCodeList.clear();

                stockCodeList.subList(i*sinaApiSize, i==loopCount-1 ? stockCodeList.size() : (i+1)*sinaApiSize).forEach(stockCode->{
                    fullStockCodeList.add(fillStockCode(stockCode));
                });

                String sinaStockApi = sinaStockApiPreffix + StringUtils.join(fullStockCodeList, ",");
                String content = doGet(sinaStockApi);

                Pattern p = Pattern.compile("([0-9]{6})=(\\\".*?\\\")");
                Matcher m = p.matcher(content);
                while(m.find()) {
                    String stockCode = m.group(1);
                    String stockInfo = m.group(2);

                    SinaStock sinaStock = transSinaStock(stockCode, stockInfo);
                    sinaStockMap.put(stockCode, sinaStock);
                }
                //暂停1s，防止被和谐
                Thread.sleep(1000L);
            }

        }catch (Exception e){
            log.error(ExceptionUtils.getStackTrace(e));
        }


        return sinaStockMap;
    }


    private SinaStock transSinaStock(String stockCode, String stockInfo){

        String[] inputData = stockInfo.split(",");

        String stockName = inputData[0];
        String currentPrice = inputData[1];
        String changePrice = inputData[2];
        String changePriceRate = inputData[3];
        String dealQuantity = inputData[4];
        String dealAmount = inputData[5];

        SinaStock sinaStock = new SinaStock();
        sinaStock.setStockCode(stockCode);
        sinaStock.setStockName(stockName);
        sinaStock.setTodayOpenPrice(currentPrice);
        sinaStock.setPriceChange(changePrice);
        sinaStock.setCurrentPrice(currentPrice);
        sinaStock.setPriceChange(changePrice);
        sinaStock.setPriceChangeRate(changePriceRate);
        sinaStock.setDealQuantity(dealQuantity);
        sinaStock.setDealAmount(dealAmount);
        return sinaStock;
    }



    private String doGet(String sinaStockApi) throws IOException {
        URL url = new URL(sinaStockApi);
        URLConnection urlConnection = url.openConnection();
        String content = FileUtils.readContent(urlConnection.getInputStream(), "gbk");
        return content;
    }


    private String fillStockCode(String stockCode){
        return stockCode.startsWith("6") ? "sh" + stockCode : "sz" + stockCode;
    }




    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        list.add("000507");
        list.add("600353");
        new StockBaseInfoServiceImpl().batchFetchStockInfo(list);
    }
}
