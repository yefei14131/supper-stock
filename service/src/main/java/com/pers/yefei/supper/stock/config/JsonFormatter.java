package com.pers.yefei.supper.stock.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author: yefei
 * @date: 2018/9/9 12:13
 */
@Configuration
@Slf4j
public class JsonFormatter {

    @Bean(name = "jacksonFormatter")
    public ObjectMapper jacksonFormatter() {
        return new ObjectMapper();
    }


}
