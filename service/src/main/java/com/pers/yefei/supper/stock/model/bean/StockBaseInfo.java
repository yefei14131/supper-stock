package com.pers.yefei.supper.stock.model.bean;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import lombok.Data;

/**
 * @author yefei
 * @date: 2019/12/16
 */
@Data
public class StockBaseInfo {

    protected String stockCode;
    protected String stockName;
    protected Integer flowValue;
    protected Integer totalValue;
    protected Double priceProfitAssetRatio;
    protected Double priceNetAssetRatio;
    protected String industryName;
    protected Integer industryRank;
    protected Double totalScore;


    public void from(TblStockInfo tblStockInfo) {
        if (tblStockInfo != null) {
            this.flowValue = tblStockInfo.getFlowValue();
            this.totalValue = tblStockInfo.getTotalValue();
            this.priceProfitAssetRatio = tblStockInfo.getPriceProfitAssetRatio();
            this.priceNetAssetRatio = tblStockInfo.getPriceNetAssetRatio();
            this.industryName = tblStockInfo.getIndustryName();
            this.industryRank = tblStockInfo.getIndustryRank();
            this.totalScore = tblStockInfo.getTotalScore();

        }
    }
}
