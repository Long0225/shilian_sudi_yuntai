package com.cqust.shilian;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
@EnableCaching //开启Spring Cache注解方式是缓存功能
public class ShilianSudiYuntaiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShilianSudiYuntaiApplication.class,args);
        log.info("食链速递云台项目启动成功。。");
    }
} 
