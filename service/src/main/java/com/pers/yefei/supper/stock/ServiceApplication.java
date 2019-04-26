package com.pers.yefei.supper.stock;

import com.pers.yefei.supper.stock.config.ApplicationContextProvider;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@ComponentScan(basePackages = {"com.pers.yefei.*"})
public class ServiceApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ServiceApplication.class, args);
        ApplicationContextProvider applicationContextProvider = (ApplicationContextProvider) ctx.getBean("applicationContextProvider");
        applicationContextProvider.setApplicationContext(ctx);
    }


	@Configuration
	@MapperScan(basePackages = {"com.pers.yefei.supper.stock.model.gen.dao"}, sqlSessionFactoryRef="sqlSessionFactoryBean")
	class DBConfig{}
}
