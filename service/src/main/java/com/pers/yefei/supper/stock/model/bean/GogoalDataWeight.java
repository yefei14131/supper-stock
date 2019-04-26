package com.pers.yefei.supper.stock.model.bean;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.pers.yefei.supper.stock.utils.FileUtils;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: yefei
 * @date: 2019/4/27 00:01
 */
@Data
@Component
public class GogoalDataWeight {

    private int companyHonorScore;
    private int businessStatusScore;
    private int achievementsAppraisalScore;
    private int achievementsGrowupScore;
    private int profitAbilityScore;
    private int achievementsClueScore;
    private int marketplaceStyleScore;
    private int organizationHoldScore;
    private int organizationEmotionScore;
    private int businessPreferenceScore;
    private int successRateStatisticsScore;
    private int stockValuationScore;


    GogoalDataWeight() throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        // 获取接口积分权重
        InputStream mappingStream = getClass().getClassLoader().getResourceAsStream("static/java_templates/json/gogoal_data_mapping.json");
        String mappingDataStr = FileUtils.readContent(mappingStream);
        JSONArray mappingArr = JSONArray.parseArray(mappingDataStr);

        for(int i = 0, len = mappingArr.size(); i < len; i++){
            JSONObject item = mappingArr.getJSONObject(i);
            String fieldName = item.getString("key");
            int weight = item.getInteger("weight");

            String setMethodName = "set" + fieldName.substring(0,1).toUpperCase()+ fieldName.substring(1);

            Method setValueMethod = this.getClass().getMethod(setMethodName, int.class);
            setValueMethod.invoke(this, weight);

        }

    }


}
