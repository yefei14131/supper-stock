package com.pers.yefei.supper.stock.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pers.yefei.supper.stock.exception.EastMoneyDataGetException;
import com.pers.yefei.supper.stock.model.bean.EastMoneyStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.service.IStockBaseInfoEastMoneyService;
import com.pers.yefei.supper.stock.utils.FileUtils;
import com.pers.yefei.supper.stock.utils.OkHttpHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.text.MessageFormat;


/**
 * @author yefei
 * @date: 2019/12/14
 */
@Service
@Slf4j
public class StockBaseInfoEastMoneyServiceImpl implements IStockBaseInfoEastMoneyService {

    private final static String SH_MARKET_CODE = "1";
    private final static String SZ_MARKET_CODE = "0";
    private final static String SH_STOCK_CODE = "sh000001";
    private final static String SZ_STOCK_CODE = "399001";
    private final static String urlTemplate = "https://push2.eastmoney.com/api/qt/stock/get?secid={0}.{1}&ut=f057cbcbce2a86e2866ab8877db1d059&forcect=1&fields={2}&invt=2&cb={3}&callback=jsonp1";

    @Autowired
    private OkHttpHelper okHttpHelper;

    @Override
    public EastMoneyStockInfo queryStockInfo(String stockCode) {
        String callbackFunc = RandomStringUtils.randomAlphanumeric(5);
        String s = readFromEastMoneyServer(stockCode, callbackFunc);
        return EastMoneyStockInfo.from(s, callbackFunc);
    }

    @Override
    public void queryStockInfo(TblStockScore stockScore) {
        EastMoneyStockInfo eastMoneyStockInfo = this.queryStockInfo(stockScore.getStockCode());
        /**
         *
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
         private int  priceNetAssetRatio;    // f162    动态市盈率
         private int  priceProfitAssetRatio; // f167    市净率
         private int  turnoverRatio;     // f168    换手率
         private int  priceChange;       // f169    涨跌
         private int  priceChangeRatio;  // f170    涨跌幅
         *
         */

        /**
         *
         * {
         "price":3190,
         "maxPrice":3210,
         "minPrice":3138,
         "openPrice":3160,

         "dealQuantity":219569,
         "dealAmount":697775792,
         "stockCode":"300003",
         "stockName":"乐普医疗",

         "totalValue":56834728179.899994,
         "flowValue":48336465780.9,

         "mainInflowAmount":243793527,
         "mainOutflowAmount":224922795,
         "netInflow":18870732,

         "priceNetAssetRatio":2644,
         "priceProfitAssetRatio":762,
         "turnoverRatio":145,
         "priceChange":56,
         "priceChangeRatio":179
         }

         */

        stockScore.setMaxPrice(((double)eastMoneyStockInfo.getMaxPrice())/100);
        stockScore.setMinPrice(((double)eastMoneyStockInfo.getMinPrice())/100);
        stockScore.setOpenPrice(((double)eastMoneyStockInfo.getOpenPrice())/100);
        stockScore.setDealQuantity(((double)eastMoneyStockInfo.getDealQuantity())/10000);
        stockScore.setDealAmount(((double)eastMoneyStockInfo.getDealAmount())/10000/10000);
        stockScore.setTotalValue((int)(eastMoneyStockInfo.getTotalValue()/10000/10000));
        stockScore.setFlowValue((int)(eastMoneyStockInfo.getFlowValue()/10000/10000));
        stockScore.setMainInflowAmount(((double)eastMoneyStockInfo.getMainInflowAmount())/10000/10000);
        stockScore.setMainOutflowAmount(((double)eastMoneyStockInfo.getMainOutflowAmount())/10000/10000);
        stockScore.setNetInflow(((double)eastMoneyStockInfo.getNetInflow())/10000/10000);
        stockScore.setPriceNetAssetRatio(((double)eastMoneyStockInfo.getPriceNetAssetRatio())/100);
        stockScore.setPriceProfitAssetRatio(((double)eastMoneyStockInfo.getPriceProfitAssetRatio())/100);
        stockScore.setTurnoverRatio(((double)eastMoneyStockInfo.getTurnoverRatio())/100);
        stockScore.setPriceChange(((double)eastMoneyStockInfo.getPriceChange())/100);
        stockScore.setPrice(((double)eastMoneyStockInfo.getPrice())/100);
        stockScore.setPriceChangeRatio(((double)eastMoneyStockInfo.getPriceChangeRatio())/100);

    }

    @Override
    public void queryStockInfo(TblStockInfo stockInfo) {
        EastMoneyStockInfo eastMoneyStockInfo = this.queryStockInfo(stockInfo.getStockCode());

        stockInfo.setTotalValue(((int)eastMoneyStockInfo.getTotalValue())/10000/10000);
        stockInfo.setFlowValue(((int)eastMoneyStockInfo.getFlowValue())/10000/10000);
        stockInfo.setPriceNetAssetRatio(((double)eastMoneyStockInfo.getPriceNetAssetRatio())/100);
        stockInfo.setPriceProfitAssetRatio(((double)eastMoneyStockInfo.getPriceProfitAssetRatio())/100);
        stockInfo.setStockName(eastMoneyStockInfo.getStockName());
        stockInfo.setPrice(((double)eastMoneyStockInfo.getPrice())/100);


    }

    @Override
    public String fetchSHCompositeStockPrice(){
        EastMoneyStockInfo eastMoneyStockInfo = this.queryStockInfo(SH_STOCK_CODE);

        return ((float)eastMoneyStockInfo.getPrice())/100 + "";
    }

    private String readFromEastMoneyServer(String stockCode, String callbackFunc) {
        String market;
        if (stockCode.equals(SH_STOCK_CODE)) {
            market = SH_MARKET_CODE;
            stockCode = SH_STOCK_CODE.replace("sh", "");

        } else {
            market = stockCode.startsWith("6") ? SH_MARKET_CODE : SZ_MARKET_CODE;
        }
        String url  = MessageFormat.format(urlTemplate, new Object[]{market, stockCode, EastMoneyStockInfo.getAllField(), callbackFunc});
        try {

            log.info("调用东方财富接口获取股票信息：{}", url);
            String content = okHttpHelper.getResponseString(url);
            log.info("调用东方财富接口获取股票信息，返回内容：{}", url);

            return content;
        } catch (IOException e) {
            throw new EastMoneyDataGetException(e);

        }
    }





    public static void main(String[] args) throws JsonProcessingException {
        StockBaseInfoEastMoneyServiceImpl stockBaseInfoEastMoney = new StockBaseInfoEastMoneyServiceImpl();
        String stockCode = "300003";
        stockCode = "603859";
//        stockCode = "000001";
//        stockCode = "sh000001";
//        stockCode = SZ_STOCK_CODE;

        EastMoneyStockInfo eastMoneyStockInfo = stockBaseInfoEastMoney.queryStockInfo(stockCode);
        System.out.println(new ObjectMapper().writeValueAsString(eastMoneyStockInfo));
    }
}
