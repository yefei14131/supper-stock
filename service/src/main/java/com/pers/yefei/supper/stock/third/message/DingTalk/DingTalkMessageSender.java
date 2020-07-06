package com.pers.yefei.supper.stock.third.message.DingTalk;

import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockPublicNoticeObserver;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockScoreInfoObserver;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockSoreChangeObserver;
import com.pers.yefei.supper.stock.model.bean.StockScoreChangeInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.List;

/**
 * @author yefei
 * @date: 2019/12/15
 */
@Component
@Slf4j
public class DingTalkMessageSender {

    @Autowired
    private DingTalkHelper dingTalkHelper;

    private final int pageSize = 20;

    /**
     * 推送公告消息
     * @param stockPublicNoticeObserver
     */
    public void sendStockPublicNotice(StockPublicNoticeObserver stockPublicNoticeObserver) {
        dingTalkHelper.sendMarkdownMessage(stockPublicNoticeObserver, contentBuilder -> {
            contentBuilder.append( MessageFormat.format("### {0} {1}\n", new String[]{DateFormatUtils.format(stockPublicNoticeObserver.getDate(), "yyyy-MM-dd"), stockPublicNoticeObserver.getTitle()}));
            contentBuilder.append( MessageFormat.format("#### 关键字：{0}\n", new String[]{stockPublicNoticeObserver.getKeywords()}));
            contentBuilder.append( MessageFormat.format("> #### 共计 {0} 条相关公告\n***\n", new String[]{String.valueOf(stockPublicNoticeObserver.getStockPublicNoticeInfoList().size())}));

            stockPublicNoticeObserver.getStockPublicNoticeInfoList().forEach(stockPublicNoticeInf->{
                contentBuilder.append( MessageFormat.format("> #### {0}, {1}, 总市值:{2}亿, {3}, 评分:{4},评分行业排名:{5}\n\n> ##### [{6}]({7})\n***\n",

                    stockPublicNoticeInf.getStockCode(),
                    stockPublicNoticeInf.getStockName(),
                    String.valueOf(stockPublicNoticeInf.getTotalValue()),
                    stockPublicNoticeInf.getIndustryName(),
                    String.valueOf(stockPublicNoticeInf.getTotalScore()),
                    String.valueOf(stockPublicNoticeInf.getIndustryRank()),
                    stockPublicNoticeInf.getTitle(),
                    stockPublicNoticeInf.getUrl()
                    )
                );
            });
        });
    }

    /**
     * 推送评分变化消息
     * @param stockSoreChangeObserver
     */
    public void sendStockScoreChange(StockSoreChangeObserver stockSoreChangeObserver) {
        sendStockScoreChange(stockSoreChangeObserver, stockSoreChangeObserver.getStockScoreChangeSummary().getReduceList(), "减少");
        sendStockScoreChange(stockSoreChangeObserver, stockSoreChangeObserver.getStockScoreChangeSummary().getIncreaseList(), "增加");
    }

    private void sendStockScoreChange(StockSoreChangeObserver stockSoreChangeObserver, List<StockScoreChangeInfo> stockScoreChangeInfoList, String keyword) {
        if (stockScoreChangeInfoList.size() <= pageSize) {
            sendStockScoreChange(1,1, stockSoreChangeObserver, stockScoreChangeInfoList, keyword);
        } else {
            int pageTotal = stockScoreChangeInfoList.size() % pageSize == 0 ? stockScoreChangeInfoList.size() / pageSize : stockScoreChangeInfoList.size() / pageSize + 1;
            for (int i = 1; i <= pageTotal; i++) {
                sendStockScoreChange(i, pageTotal, stockSoreChangeObserver, stockScoreChangeInfoList, keyword);
            }
        }
    }

    private void sendStockScoreChange(int curPage, int totalPage, StockSoreChangeObserver stockSoreChangeObserver, List<StockScoreChangeInfo> stockScoreChangeInfoList, String keyword) {

        dingTalkHelper.sendMarkdownMessage(stockSoreChangeObserver, contentBuilder -> {

            String title;
            if (totalPage == 1) {
                title = MessageFormat.format("### {0} {1}\n", DateFormatUtils.format(stockSoreChangeObserver.getDate(), "yyyy-MM-dd"), stockSoreChangeObserver.getTitle());
            } else {
                title = MessageFormat.format("### {0} {1} {2}/{3}\n", DateFormatUtils.format(stockSoreChangeObserver.getDate(), "yyyy-MM-dd"), stockSoreChangeObserver.getTitle(), curPage, totalPage);

            }

            contentBuilder.append(title);
            contentBuilder.append( MessageFormat.format("#### 评分{0} 共计 {1} 只\n", keyword, String.valueOf(stockScoreChangeInfoList.size())));

            stockScoreChangeInfoList.forEach(stockScoreChangeInfo->{
                contentBuilder.append( MessageFormat.format("> #### {0}, {1}, 总市值:{2}亿, {3}, 评分:{4},评分行业排名:{5}\n\n> ##### {6}变化: {7}, 当前值: {8}\n***\n",
                        stockScoreChangeInfo.getStockCode(),
                        stockScoreChangeInfo.getStockName(),
                        String.valueOf(stockScoreChangeInfo.getTotalValue()),
                        stockScoreChangeInfo.getIndustryName(),
                        String.valueOf(stockScoreChangeInfo.getTotalScore()),
                        String.valueOf(stockScoreChangeInfo.getIndustryRank()),
                        stockScoreChangeInfo.getChangeField(),
                        String.valueOf(stockScoreChangeInfo.getChangeValue()),
                        String.valueOf(stockScoreChangeInfo.getCurrentValue())
                    )
                );
            });
        } );
    }




    public void sendStockScore(StockScoreInfoObserver stockSoreObserver){
        dingTalkHelper.sendMarkdownMessage(stockSoreObserver, contentBuilder -> {

            contentBuilder.append( MessageFormat.format("### {0}\n", new String[]{stockSoreObserver.getTitle()}));
            contentBuilder.append( MessageFormat.format("#### {0} 共计 {1} 只\n", new String[]{DateFormatUtils.format(stockSoreObserver.getDate(), "yyyy-MM-dd"), String.valueOf(stockSoreObserver.getStockScorePushInfoList().size())}));

            stockSoreObserver.getStockScorePushInfoList().forEach(stockScorePushInfo->{
                TblStockScore tblStockScore = stockScorePushInfo.getTblStockScore();
                contentBuilder.append( MessageFormat.format("> #### {0} {1}, 总市值:{2}亿,  流通市值:{3}亿, 市盈率:{4},市净率:{5}\n\n",
                        tblStockScore.getStockCode(),
                        tblStockScore.getStockName(),
                        String.valueOf(tblStockScore.getTotalValue()),
                        String.valueOf(tblStockScore.getFlowValue()),
                        String.valueOf(tblStockScore.getPriceProfitAssetRatio()),
                        String.valueOf(tblStockScore.getPriceNetAssetRatio())
                    )
                );
                contentBuilder.append( MessageFormat.format("> #### 评分:{0}, 排名:{1}, 行业:{2}, 行业排名:{3}, 机构持仓:{4}, 机构持仓变化:{5}\n\n",
                        String.valueOf(tblStockScore.getTotalScore()),
                        String.valueOf(tblStockScore.getMarketRank()),
                        String.valueOf(tblStockScore.getIndustryDetail()),
                        String.valueOf(tblStockScore.getIndustryRank()),
                        String.valueOf(tblStockScore.getOrganizationHoldScore()),
                        stockScorePushInfo.getTblStockScoreChange() == null ? "0" : String.valueOf(stockScorePushInfo.getTblStockScoreChange().getChangeValue())
                    )
                );

                contentBuilder.append( MessageFormat.format("> #### 涨幅:{0}%, 换手率:{1}%, 主力流入:{2}亿, 主力流出:{3}亿, 净流入:{4}亿, 最高价:{5}, 最低价:{6}\n\n",
                        String.valueOf(tblStockScore.getPriceChangeRatio()),
                        String.valueOf(tblStockScore.getTurnoverRatio()),
                        String.valueOf(tblStockScore.getMainInflowAmount()),
                        String.valueOf(tblStockScore.getMainOutflowAmount()),
                        String.valueOf(tblStockScore.getNetInflow()),
                        String.valueOf(tblStockScore.getMaxPrice()),
                        String.valueOf(tblStockScore.getMinPrice())
                    )
                );

                if (!StringUtils.isEmpty(stockScorePushInfo.getPushReason())){
                    contentBuilder.append( MessageFormat.format("> ###### {0}\n\n", new String[]{stockScorePushInfo.getPushReason()}));
                }

                contentBuilder.append("***\n");

            });
        } );
    }

}
