package com.pers.yefei.supper.stock.utils;

import com.pers.yefei.supper.stock.model.bean.StockScorePushInfo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/**
 * @author yefei
 * @date: 2019/12/20
 */
public class StockScoreUtils {

    /**
     *
     * @param stockScorePushInfoList
     */
    public static void filterTotalValeTop10AndTotalScoreTop10(List<StockScorePushInfo> stockScorePushInfoList) {
        if (stockScorePushInfoList.size() < 10 ) {
            return;
        }

        int limit = 8;
        List<StockScorePushInfo> totalValeTop10 = getTotalValeTop10(stockScorePushInfoList, limit);
        List<StockScorePushInfo> totalScoreTop10 = getTotalScoreTop10(stockScorePushInfoList, limit);
        stockScorePushInfoList.clear();
        HashSet stockScorSet = new HashSet<>();
        stockScorSet.addAll(totalValeTop10);
        stockScorSet.addAll(totalScoreTop10);
        stockScorePushInfoList.addAll(stockScorSet);
    }

    /**
     * 获取市值排名前十
     * @return
     */
    public static List<StockScorePushInfo> getTotalValeTop10(List<StockScorePushInfo> stockScorePushInfoList, int limit) {
        stockScorePushInfoList.sort(new Comparator<StockScorePushInfo>() {
            @Override
            public int compare(StockScorePushInfo o1, StockScorePushInfo o2) {
                return o2.getTblStockScore().getTotalValue() - o1.getTblStockScore().getTotalValue();
            }
        });
        List list = new ArrayList();
        list.addAll(stockScorePushInfoList.size() < limit ? stockScorePushInfoList.subList(0, stockScorePushInfoList.size()) : stockScorePushInfoList.subList(0, limit));
        return list;
    }


    /**
     * 获取评分排名前十
     * @return
     */
    public static List<StockScorePushInfo> getTotalScoreTop10(List<StockScorePushInfo> stockScorePushInfoList, int limit) {

        stockScorePushInfoList.sort(new Comparator<StockScorePushInfo>() {
            @Override
            public int compare(StockScorePushInfo o1, StockScorePushInfo o2) {
                return new Double(o2.getTblStockScore().getTotalScore() - o1.getTblStockScore().getTotalScore()).intValue();
            }
        });
        List list = new ArrayList();
        list.addAll(stockScorePushInfoList.size() < limit ? stockScorePushInfoList.subList(0, stockScorePushInfoList.size()) : stockScorePushInfoList.subList(0, limit));
        return list;
    }

}
