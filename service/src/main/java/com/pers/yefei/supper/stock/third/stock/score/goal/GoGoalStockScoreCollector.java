package com.pers.yefei.supper.stock.third.stock.score.goal;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pers.yefei.supper.stock.model.bean.GogoalDataWeight;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.utils.FileUtils;
import com.pers.yefei.supper.stock.utils.OkHttpHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;

/**
 * @author yefei
 * @date: 2019/12/16
 */
@Component
@Slf4j
public class GoGoalStockScoreCollector {


    @Autowired
    private GogoalDataWeight gogoalDataWeight;

    private String makeSignJsCodeTemplate;

    private ScriptEngine jsEngine;

    final private String gogoalHost = "https://ggservice.go-goal.cn/";

    final static int LEVEL_RATE = 1000;

    @Autowired
    private OkHttpHelper okHttpHelper;

    public GoGoalStockScoreCollector() throws IOException {

        // 读取签名算法代码
        InputStream stream = getClass().getClassLoader().getResourceAsStream("static/java_templates/js/makeSign.js");
        makeSignJsCodeTemplate = FileUtils.readContent(stream);

        // 初始化js脚本引擎
        ScriptEngineManager factory = new ScriptEngineManager();
        jsEngine = factory.getEngineByName("nashorn");

    }

    /**
     * 获取股票评分信息
     * @param stockCode
     * @return
     */
    public TblStockScore fetchStockScore(String stockCode) {

        TblStockScore stockScore = new TblStockScore();
        stockScore.setStockCode(stockCode);
        fetchStockScore(stockScore);

        return stockScore;
    }


    /**
     * 获取股票评分信息
     * @param stockScore
     * @return
     */
    public void fetchStockScore(TblStockScore stockScore) {

        JSONObject response = readFromGoGoal(stockScore.getStockCode());
        dealGogoalResponse(response, stockScore);
    }

    /**
     * 执行js脚本，准备请求参数
     * @param stockCode
     * @return
     * @throws ScriptException
     */
    private String getReqString(String stockCode) throws ScriptException {
//        String makeSignJsCode = this.makeSignJsCodeTemplate.replace("STOCK_CODE", stockCode);

        HashMap<String, String> signInfo = new HashMap<>();
        signInfo.put("stockCode", stockCode);
        Bindings bings = jsEngine.createBindings();
        bings.put("signInfoMap", signInfo);

        long startTime = System.currentTimeMillis();
//        log.info("开始执行js脚本,{}", startTime);

        Object result =  jsEngine.eval(makeSignJsCodeTemplate, bings);
        long endTime = System.currentTimeMillis();
        log.info("执行js脚本结束,{}, 耗时：{}ms, {}", endTime, endTime-startTime , result);

        if(signInfo.containsKey("reqString")){
            return signInfo.get("reqString");
        }else if(result != null){
            return result.toString();
        }
        return "";
    }



    /**
     * 读取股票评分信息
     * @param stockCode
     * @return
     */
    private JSONObject readFromGoGoal(String stockCode) {
        try {

            String reqString = getReqString(stockCode);
            String gogoalUrl = gogoalHost + reqString;
            String gogoalResp = okHttpHelper.getResponseString(gogoalUrl);

            return new ObjectMapper().readValue(gogoalResp, JSONObject.class);

        } catch (IOException e) {
            log.error("获取gogal接口出错", e);

        } catch (ScriptException e) {
            log.error("生成gogal请求数据时出错", e);
        }

        return null;
    }


    private void dealGogoalResponse(JSONObject response, TblStockScore tblStockScore){

        if (response.getIntValue("code") != 0){
            log.error("获取gogal接口出错");
            return;
        }
        JSONObject data = response.getJSONObject("data");

        JSONObject appraisalList = data.getJSONObject("appraisal_list");

        JSONArray status = appraisalList.getJSONArray("status");

        if (appraisalList == null || appraisalList.size() == 0 || status == null || status.size() == 0){
            log.info("{} gogoal接口没有数据。", tblStockScore.getStockCode());
            return;
        }
        JSONArray scoreList = appraisalList.getJSONArray("score");
/**
 `stockCode` varchar(255) NOT NULL DEFAULT '' COMMENT '股票代码',
 `stockName` varchar(255) NOT NULL DEFAULT '' COMMENT '股票名称',
 `companyHonorScore` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '公司品质',
 `businessStatusScore` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '行业龙头',
 `achievementsAppraisalScore` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '超预期鉴定',
 `achievementsGrowupScore` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '业绩成长性',
 `profitAbilityScore` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '盈利能力',
 `achievementsClueScore` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '业绩线索',
 `marketplaceStyleScore` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '业绩驱动性',
 `organizationHoldScore` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '机构持仓',
 `organizationEmotionScore` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '分析师情绪',
 `businessPreferenceScore` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '全市场情绪',
 `successRateStatisticsScore` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '胜率统计',
 `stockValuationScore` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '个股估值',
 **/
        String stockName = scoreList.getString(0);
        int companyHonorScore = scoreList.getIntValue(1);
        int businessStatusScore = scoreList.getIntValue(2);
        int achievementsAppraisalScore = scoreList.getIntValue(3);
        int achievementsGrowupScore = scoreList.getIntValue(4);
        int profitAbilityScore = scoreList.getIntValue(5);
        int achievementsClueScore = scoreList.getIntValue(6);
        int marketplaceStyleScore = scoreList.getIntValue(7);
        int organizationHoldScore = scoreList.getIntValue(8);
        int organizationEmotionScore = scoreList.getIntValue(9);
        int businessPreferenceScore = scoreList.getIntValue(10);
        int successRateStatisticsScore = scoreList.getIntValue(11);
        int stockValuationScore = scoreList.getIntValue(12);

        tblStockScore.setStockName(stockName);
        tblStockScore.setCompanyHonorScore(companyHonorScore * LEVEL_RATE / gogoalDataWeight.getCompanyHonorScore());
        tblStockScore.setBusinessStatusScore(businessStatusScore * LEVEL_RATE / gogoalDataWeight.getBusinessStatusScore());
        tblStockScore.setAchievementsAppraisalScore(achievementsAppraisalScore * LEVEL_RATE /gogoalDataWeight.getAchievementsAppraisalScore());
        tblStockScore.setAchievementsGrowupScore(achievementsGrowupScore * LEVEL_RATE / gogoalDataWeight.getAchievementsGrowupScore());
        tblStockScore.setProfitAbilityScore(profitAbilityScore * LEVEL_RATE / gogoalDataWeight.getProfitAbilityScore());
        tblStockScore.setAchievementsClueScore(achievementsClueScore * LEVEL_RATE / gogoalDataWeight.getAchievementsClueScore());
        tblStockScore.setMarketplaceStyleScore(marketplaceStyleScore * LEVEL_RATE / gogoalDataWeight.getMarketplaceStyleScore());
        tblStockScore.setOrganizationHoldScore( organizationHoldScore * LEVEL_RATE / gogoalDataWeight.getOrganizationHoldScore());
        tblStockScore.setOrganizationEmotionScore(organizationEmotionScore * LEVEL_RATE / gogoalDataWeight.getOrganizationEmotionScore());
        tblStockScore.setBusinessPreferenceScore( businessPreferenceScore * LEVEL_RATE / gogoalDataWeight.getBusinessPreferenceScore());
        tblStockScore.setSuccessRateStatisticsScore( successRateStatisticsScore * LEVEL_RATE / gogoalDataWeight.getStockValuationScore());
        tblStockScore.setStockValuationScore(stockValuationScore * LEVEL_RATE / gogoalDataWeight.getStockValuationScore());

        // 获取当前总得分
        tblStockScore.setTotalScore(data.getJSONObject("week_change").getDoubleValue("total_score"));

        // 获取当前总排名
        tblStockScore.setMarketRank(status.getIntValue(0));

        tblStockScore.setIndustryDetail(status.getString(2) == null ? "" : status.getString(2));

        tblStockScore.setIndustryRank(status.getIntValue(3));

        tblStockScore.setDate( new Date());

    }



}
