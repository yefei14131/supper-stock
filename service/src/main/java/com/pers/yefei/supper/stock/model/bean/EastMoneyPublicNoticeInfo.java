package com.pers.yefei.supper.stock.model.bean;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNotice;
import com.pers.yefei.supper.stock.utils.DateUtils;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author yefei
 * @date: 2019/12/14
 */
@Slf4j
@Data
public class EastMoneyPublicNoticeInfo {
    private int recordTotal = 0;
    private int pageTotal;
    private int page = 1;
    private int pageSize = 50;
    private List<TblStockPublicNotice> publicNoticeList = new ArrayList<>();

    private static final String dateTimeformat = "yyyy-MM-dd HH:mm:ss";
    private static final String noticeDetailUrl = "http://m.data.eastmoney.com/notices/detail/{0}/{1}";
    private static final List<String> firstOfA = Arrays.asList(new String[]{"0", "3", "6"});

    public static EastMoneyPublicNoticeInfo from(String eastMoneyRespContent, String callback) throws Exception {
        EastMoneyPublicNoticeInfo eastMoneyPublicNoticeInfo = new EastMoneyPublicNoticeInfo();

        eastMoneyRespContent = eastMoneyRespContent.replaceAll("^var "+ callback +" = (.+?);?$", "$1");

        JSONObject eastMoneyResp = new ObjectMapper().readValue(eastMoneyRespContent, JSONObject.class);
        eastMoneyPublicNoticeInfo.setPageTotal( eastMoneyResp.getInteger("pages"));
        eastMoneyPublicNoticeInfo.setRecordTotal( eastMoneyResp.getInteger("TotalCount"));

        JSONArray dataList = eastMoneyResp.getJSONArray("data");

        for (int i=0; i < dataList.size(); i++){
            JSONObject dataItem = dataList.getJSONObject(i);
            TblStockPublicNotice tblStockPublicNotice = new TblStockPublicNotice();
            eastMoneyPublicNoticeInfo.getPublicNoticeList().add(tblStockPublicNotice);

            Date notice_date = DateUtils.getZeroDate(DateUtils.parseDate(dataItem.getString("notice_date"), dateTimeformat));
            tblStockPublicNotice.setTitle(dataItem.getString("title"));
            tblStockPublicNotice.setNoticeDate(notice_date);
            tblStockPublicNotice.setPublicTime(notice_date);
            tblStockPublicNotice.setNoticeCode(dataItem.getString("art_code"));

            // 获取股票代码和股票名称
            JSONArray cdsy_secucodes = dataItem.getJSONArray("codes");
            for (int j=0; j<cdsy_secucodes.size(); j++) {
                JSONObject stockInfo = cdsy_secucodes.getJSONObject(j);
                String stockCode = stockInfo.getString("stock_code");
                if (firstOfA.contains(stockCode.substring(0, 1))){
                    // A股股票
                    tblStockPublicNotice.setStockCode(stockCode);
                    tblStockPublicNotice.setStockName(stockInfo.getString("short_name"));
                    break;
                }
            }

            // 公告标签
            JSONArray ann_relcolumns = dataItem.getJSONArray("columns");
            List<String> tags = new ArrayList<>();
            for (int k=0; k<ann_relcolumns.size(); k++) {
                JSONObject jsonObject = ann_relcolumns.getJSONObject(k);
                tags.add(jsonObject.getString("column_name"));
            }
            tblStockPublicNotice.setKeywords(String.join(";", tags));

            tblStockPublicNotice.setUrl(MessageFormat.format(noticeDetailUrl, new String[]{tblStockPublicNotice.getNoticeCode(), tblStockPublicNotice.getNoticeCode()}));

        }

        return eastMoneyPublicNoticeInfo;
    }
}
