package com.pers.yefei.supper.stock.config.db;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author : Wangruiyan
 * @Date : 2018/11/19
 */

@Data
@Configuration
@ConfigurationProperties(prefix = "datasource")
public class StockDBConfiguration {
    private String driverClassName;

    private String url;

    private String username;

    private String password;

    private int initialSize;

    private int maxActive;

    private int minIdle;

    private String validationQuery;
    private static final Logger LOGGER = LoggerFactory.getLogger(StockDBConfiguration.class);


    @Bean(name = "stock_db")
    public DataSource shardDB1DataSource() {
        return DataSourceConfigSupport.getDataSource(
            driverClassName,
            url,
            username,
            password,
            initialSize,
            minIdle,
            maxActive,
            validationQuery);
    }

}
