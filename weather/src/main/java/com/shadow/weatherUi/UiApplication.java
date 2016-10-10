package com.shadow.weatherUi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableEurekaClient  //服务注册和发现，含discoryClient
@EnableFeignClients //1
@EnableCircuitBreaker //2
//@EnableZuulProxy //3
public class UiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UiApplication.class,args);
    }
}