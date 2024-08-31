package com.quanxiaoha.xiaohashu.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author youle
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "com.quanxiaoha.xiaohashu")
public class XiaohashuAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(XiaohashuAuthApplication.class, args);
    }
}
