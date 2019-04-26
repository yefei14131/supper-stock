/**
 * Copyright (c) 2014 http://www.jieqianhua.com
 */
package com.pers.yefei.supper.stock.config.db;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;

/**
 * Created by yefei on 2018/8/2.
 */
@Data
@Configuration
public class DataSourceConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceConfiguration.class);


    @Bean(name = "shardDB")
    @Autowired
    public DynamicDataSource shardRouteDataSource(@Qualifier("stock_db") DataSource stockDataSource){
        DynamicDataSource dynamicDataSource =  new DynamicDataSource();
        HashMap<Object, Object> targetDataSources = new HashMap<Object, Object>() {{
            this.put(DatabaseType.db_stock, stockDataSource);
        }};
        dynamicDataSource.setTargetDataSources(targetDataSources);
//        dynamicDataSource.setDefaultTargetDataSource(shardDB1DataSource); // health监测用
        dynamicDataSource.afterPropertiesSet();
        return dynamicDataSource;

    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean(DynamicDataSource dynamicDataSource) throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        //Can no longer use application.properties for mybatis configuration settings, so this is a hack for
        //application.properties: mybatis.configuration.map-underscore-to-camel-case=true
//        org.apache.ibatis.session.Configuration ibatisConfiguration = new org.apache.ibatis.session.Configuration();
//        ibatisConfiguration.setMapUnderscoreToCamelCase(true);
//        sqlSessionFactoryBean.setConfiguration(ibatisConfiguration);

        sqlSessionFactoryBean.setDataSource(dynamicDataSource);
        return sqlSessionFactoryBean.getObject();
    }

}
