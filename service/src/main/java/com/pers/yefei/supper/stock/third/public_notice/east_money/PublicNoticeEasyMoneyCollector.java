package com.pers.yefei.supper.stock.third.public_notice.east_money;

import com.pers.yefei.supper.stock.exception.FetchEastMoneyStockNoticeException;
import com.pers.yefei.supper.stock.model.bean.EastMoneyPublicNoticeInfo;
import com.pers.yefei.supper.stock.utils.OkHttpHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Date;

/**
 * @author yefei
 * @date: 2019/12/16
 */
@Slf4j
@Component
public class PublicNoticeEasyMoneyCollector {

    private static final String urlTemplate = "http://data.eastmoney.com/notices/getdata.ashx?StockCode=&FirstNodeType=0&CodeType=A&PageIndex={0}&PageSize={1}&jsObj={2}&SecNodeType=0&Time={3}&rt=52544429\n";

    @Autowired
    private OkHttpHelper okHttpHelper;

    public EastMoneyPublicNoticeInfo fetchNotice(int pageSize, int page, Date noticeDate) {
        try {
            String callbackFunc = RandomStringUtils.randomAlphanumeric(8);
            String content = getFromEastMoney(pageSize, page, noticeDate, callbackFunc);
            EastMoneyPublicNoticeInfo eastMoneyPublicNoticeInfo = EastMoneyPublicNoticeInfo.from(content, callbackFunc);
            eastMoneyPublicNoticeInfo.setPage(page);
            eastMoneyPublicNoticeInfo.setPageSize(pageSize);
            return eastMoneyPublicNoticeInfo;
        } catch (Exception e) {
            throw new FetchEastMoneyStockNoticeException(e);
        }
    }


    private String getFromEastMoney(int pageSize, int page, Date noticeDate, String callbackFunc) throws IOException {
        String url = MessageFormat.format(urlTemplate, new Object[]{page, pageSize, callbackFunc, DateFormatUtils.format(noticeDate, "yyyy-MM-dd")});
        log.info("调用东方财富接口获取公告：{}", url);
        if (okHttpHelper == null) {
            okHttpHelper = new OkHttpHelper();
            okHttpHelper.init();
        }

        String content = okHttpHelper.getResponseString(url, "gbk");
//        log.info("调用东方财富接口获取公告，返回内容：{}", content);
        return content;
    }
}
