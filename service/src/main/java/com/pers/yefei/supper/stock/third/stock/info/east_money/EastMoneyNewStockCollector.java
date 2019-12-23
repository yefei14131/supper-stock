package com.pers.yefei.supper.stock.third.stock.info.east_money;

import com.pers.yefei.supper.stock.exception.FetchEastMoneyStockNoticeException;
import com.pers.yefei.supper.stock.model.bean.EastMoneyNewStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.utils.OkHttpHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author yefei
 * @date: 2019/12/16
 */
@Service
@Slf4j
public class EastMoneyNewStockCollector {

    private static final String urlTemplate = "http://dcfm.eastmoney.com/em_mutisvcexpandinterface/api/js/get?type=XGSG_LB&token=70f12f2f4f091e459a279469fe49eca5&st=purchasedate,securitycode&sr=-1&p={0}&ps={1}&js=var {2}=%7bpages:(tp),data:(x)%7d&rt=525700{3}";
    private static final String dateFormat = "yyyy-MM-dd";
    @Autowired
    private OkHttpHelper okHttpHelper;

    public  List<TblStockInfo> fetchNewStockByDay(Date date) {
        EastMoneyNewStockInfo eastMoneyNewStockInfo = this.fetchNewStock(50, 1);
        eastMoneyNewStockInfo.setPageTotal(1);
        List<TblStockInfo> tblStockInfoList = new ArrayList<>();
        eastMoneyNewStockInfo.getStockInfoList().forEach(stockInfo -> {
            if (DateFormatUtils.format(date, dateFormat).equals( DateFormatUtils.format(stockInfo.getUpdateTime(), dateFormat))){
                tblStockInfoList.add(stockInfo);
            }
        });
        return tblStockInfoList;
    }

    public EastMoneyNewStockInfo fetchNewStock(int pageSize, int page) {
        try {
            String callbackFunc = RandomStringUtils.randomAlphanumeric(8);
            String content = getFromEastMoney(pageSize, page, callbackFunc);
            EastMoneyNewStockInfo eastMoneyNewStockInfo = EastMoneyNewStockInfo.from(content, callbackFunc);

            eastMoneyNewStockInfo.setPage(page);
            eastMoneyNewStockInfo.setPageSize(pageSize);
            return eastMoneyNewStockInfo;
        } catch (Exception e) {
            throw new FetchEastMoneyStockNoticeException(e);
        }
    }

    private String getFromEastMoney(int pageSize, int page, String callbackFunc) throws IOException {
        String url = MessageFormat.format(urlTemplate, new Object[]{page, pageSize, callbackFunc, RandomUtils.nextInt(10, 99)});
        log.info("调用东方财富接口获取新股：{}", url);
        if (okHttpHelper == null) {
            okHttpHelper = new OkHttpHelper();
            okHttpHelper.init();
        }

        String content = okHttpHelper.getResponseString(url);
        log.info("调用东方财富接口获取新股，返回内容：{}", content);
        return content;
    }

}
