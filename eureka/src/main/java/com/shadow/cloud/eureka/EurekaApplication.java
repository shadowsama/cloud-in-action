
package com.shadow.cloud.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Author: shadow @github.com/shadowsama
 * Date: 2016/9/16
 * Describe: use Eureka as registry center just like zookeeper
 */
@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication{

        public static void main(String[] args) {
            SpringApplication.run(EurekaApplication.class, args);
        }
}