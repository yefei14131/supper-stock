package com.pers.yefei.supper.stock.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pers.yefei.supper.stock.service.ICategoryService;
import com.pers.yefei.supper.stock.utils.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: yefei
 * @date: 2018/10/4 22:16
 */
@Service
public class CategoryServiceImpl implements ICategoryService {

    private JSONObject category;

    @Autowired
    private ObjectMapper jacksonFormatter;

    private synchronized void genCategory() throws IOException {

        InputStream stream = getClass().getClassLoader().getResourceAsStream("static/java_templates/json/category.json");

        JSONObject jsonObject = jacksonFormatter.readValue(FileUtils.readContent(stream), JSONObject.class);
        this.category = jsonObject;
    }

    @Override
    public JSONArray getCategory(String nav) throws IOException {
        if (this.category == null){
            genCategory();
        }

        return category.getJSONArray(nav);
    }
}
