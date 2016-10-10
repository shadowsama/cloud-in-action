package com.shadow.service.weather;
import com.shadow.service.weather.Action.SyncGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.IOException;

@EnableDiscoveryClient
@EnableSwagger2
@EnableEurekaClient
@SpringBootApplication
@SpringApplicationConfiguration(name="forecast")
public class WeatherApplication {
    @Autowired
    SyncGet syncGet ;
    public static void main(String[] args) {


        SpringApplication.run(WeatherApplication.class,args);



    }

}