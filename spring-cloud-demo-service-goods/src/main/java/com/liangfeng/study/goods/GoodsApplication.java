package com.liangfeng.study.goods;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author Liangfeng
 * @version 1.0
 * @Title: GoodsApplication
 * @Description:
 * @date  2017/10/31 9:50
 */
@ServletComponentScan
@EnableCircuitBreaker
@EnableFeignClients(basePackages = {"com.liangfeng.study"})
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = {"com.liangfeng.study"},exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class GoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class, args);
    }

}
