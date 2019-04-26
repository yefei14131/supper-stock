package com.pers.yefei.supper.stock.dao;

import com.pers.yefei.supper.stock.config.db.DatabaseContextHolder;
import com.pers.yefei.supper.stock.config.db.DatabaseType;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author: yefei
 * @date: 2019/4/27 02:28
 */

@Aspect
@Component
public class DataSourceAspect {

    @Pointcut("execution(public * com.pers.yefei.supper.stock.dao.IStock*.*(..))")
    public void chooseDataSource(){};

    @Before("chooseDataSource()")
    public void doBefore(JoinPoint joinPoint){
        DatabaseContextHolder.setDatabaseType(DatabaseType.db_stock);
    }

}
