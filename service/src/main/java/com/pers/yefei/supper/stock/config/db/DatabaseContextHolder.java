package com.pers.yefei.supper.stock.config.db;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.WebStatFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by yefei on 2018/8/1.
 */
@Slf4j
public class DatabaseContextHolder {
    private static final ThreadLocal<DatabaseType> contextHolder = new ThreadLocal<>();

     public static void setDatabaseType(DatabaseType type){
         contextHolder.set(type);
     }

    public static DatabaseType getDatabaseType(){
         return contextHolder.get();
     }
}
