package com.shadow.cloud.config;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

/**
 * Author: shadow @github.com/shadowsama
 * Date: 2016/9/16
 * Describe: cloud service Config properties center
 */
@Slf4j
@Api("配置中心")
@Controller
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigApplication {


    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(ConfigApplication.class, args);
        log.info(String.format(Thread.currentThread().getName()+"  configserver is try runing!"));
    }

}