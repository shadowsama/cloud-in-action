package com.shadow.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//if forget this swagger is not function
@EnableSwagger2
@SpringBootApplication
public class CityApplication {


    public static void main(String[] args) {
        SpringApplication.run(CityApplication.class, args);
    }



}