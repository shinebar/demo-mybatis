package com.example.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableCaching(proxyTargetClass = true)
@MapperScan(basePackages = {"com.example.mapper"})
public class DemoMybatisAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMybatisAppApplication.class, args);
    }

}
