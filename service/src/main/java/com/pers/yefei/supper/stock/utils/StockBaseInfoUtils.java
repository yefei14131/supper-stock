package com.pers.yefei.supper.stock.utils;

import com.pers.yefei.supper.stock.model.bean.StockBaseInfo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/**
 * @author yefei
 * @date: 2019/12/20
 */
public class StockBaseInfoUtils {

    /**
     *
     * @param stockBaseInfoList
     */
    public static void filterTotalValeTop10AndTotalScoreTop10(List<? extends StockBaseInfo> stockBaseInfoList) {
        if (stockBaseInfoList.size() < 20 ) {
            return;
        }

        int limit = 15;
        List<? extends StockBaseInfo> totalValeTop10 = getTotalValeTop10(stockBaseInfoList, limit);
        List<? extends StockBaseInfo> totalScoreTop10 = getTotalScoreTop10(stockBaseInfoList, limit);
        stockBaseInfoList.clear();
        HashSet stockBaseInfoSet = new HashSet<>();
        stockBaseInfoSet.addAll(totalValeTop10);
        stockBaseInfoSet.addAll(totalScoreTop10);
        stockBaseInfoList.addAll(stockBaseInfoSet);
    }

    /**
     * 获取市值排名前十
     * @return
     */
    private static List<? extends StockBaseInfo> getTotalValeTop10(List<? extends StockBaseInfo> stockBaseInfoList, int limit) {
        stockBaseInfoList.sort(new Comparator<StockBaseInfo>() {
            @Override
            public int compare(StockBaseInfo o1, StockBaseInfo o2) {
                return o2.getTotalValue() - o1.getTotalValue();
            }
        });
        List list = new ArrayList();
        list.addAll(stockBaseInfoList.size() < limit ? stockBaseInfoList.subList(0, stockBaseInfoList.size()) : stockBaseInfoList.subList(0, limit));
        return list;
    }


    /**
     * 获取评分排名前十
     * @return
     */
    private static List<? extends StockBaseInfo> getTotalScoreTop10(List<? extends StockBaseInfo> stockBaseInfoList, int limit) {

        stockBaseInfoList.sort(new Comparator<StockBaseInfo>() {
            @Override
            public int compare(StockBaseInfo o1, StockBaseInfo o2) {
                return new Double(o2.getTotalScore() - o1.getTotalScore()).intValue();
            }
        });
        List list = new ArrayList();
        list.addAll(stockBaseInfoList.size() < limit ? stockBaseInfoList.subList(0, stockBaseInfoList.size()) : stockBaseInfoList.subList(0, limit));
        return list;
    }

}
