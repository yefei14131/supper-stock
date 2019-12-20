package com.pers.yefei.supper.stock.utils;

import com.pers.yefei.supper.stock.model.bean.StockBaseInfo;

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
        List<? extends StockBaseInfo> totalValeTop10 = getTotalValeTop10(stockBaseInfoList);
        List<? extends StockBaseInfo> totalScoreTop10 = getTotalScoreTop10(stockBaseInfoList);
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
    private static List<? extends StockBaseInfo> getTotalValeTop10(List<? extends StockBaseInfo> stockBaseInfoList) {

        stockBaseInfoList.sort(new Comparator<StockBaseInfo>() {
            @Override
            public int compare(StockBaseInfo o1, StockBaseInfo o2) {
                return o1.getTotalValue() - o2.getTotalValue();
            }
        });

        return stockBaseInfoList.subList(0, 10);
    }


    /**
     * 获取评分排名前十
     * @return
     */
    private static List<? extends StockBaseInfo> getTotalScoreTop10(List<? extends StockBaseInfo> stockBaseInfoList) {

        stockBaseInfoList.sort(new Comparator<StockBaseInfo>() {
            @Override
            public int compare(StockBaseInfo o1, StockBaseInfo o2) {
                return new Double(o1.getTotalScore() - o2.getTotalScore()).intValue();
            }
        });
        HashSet<StockBaseInfo> stockBaseInfos = new HashSet<>();
        return stockBaseInfoList.subList(0, 10);
    }

}
