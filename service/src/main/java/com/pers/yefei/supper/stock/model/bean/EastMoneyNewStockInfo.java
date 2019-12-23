package com.pers.yefei.supper.stock.model.bean;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.utils.DateUtils;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yefei
 * @date: 2019/12/14
 */
@Slf4j
@Data
public class EastMoneyNewStockInfo {
    private int pageTotal;
    private int page = 1;
    private int pageSize = 10;
    private List<TblStockInfo> stockInfoList = new ArrayList<>();

    private static final String dateTimeformat = "yyyy-MM-dd'T'HH:mm:ss";
    private static final List<String> scs = Arrays.asList(new String[]{"sh", "cyb", "zxb"});


    public static EastMoneyNewStockInfo from(String eastMoneyRespContent, String callback) throws Exception {
        EastMoneyNewStockInfo eastMoneyNewStockInfo = new EastMoneyNewStockInfo();


        eastMoneyRespContent = eastMoneyRespContent.replaceAll("^var "+ callback +" ?= ?(.+?);?$", "$1");
        eastMoneyRespContent = eastMoneyRespContent.replaceAll("pages:(\\d+),data", "\"pages\":$1,\"data\"");


        JSONObject eastMoneyResp = new ObjectMapper().readValue(eastMoneyRespContent, JSONObject.class);
        eastMoneyNewStockInfo.setPageTotal( eastMoneyResp.getInteger("pages"));

        JSONArray dataList = eastMoneyResp.getJSONArray("data");

        for (int i=0; i < dataList.size(); i++){
            JSONObject dataItem = dataList.getJSONObject(i);

            String sc = dataItem.getString("sc");
            if (scs.contains(sc)) {

                TblStockInfo tblStockInfo = new TblStockInfo();
                eastMoneyNewStockInfo.getStockInfoList().add(tblStockInfo);
                tblStockInfo.setStockCode(dataItem.getString("securitycode"));
                tblStockInfo.setStockName(dataItem.getString("securityshortname"));
                tblStockInfo.setUpdateTime(DateUtils.getZeroDate(DateUtils.parseDate(dataItem.getString("purchasedate"), dateTimeformat)));
                tblStockInfo.setIsActive(true);
            }

        }

        return eastMoneyNewStockInfo;
    }
}
