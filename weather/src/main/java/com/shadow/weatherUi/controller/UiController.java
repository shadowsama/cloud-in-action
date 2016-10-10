package com.shadow.weatherUi.controller;

import com.shadow.weatherUi.domain.ForeCastDaily;
import com.shadow.weatherUi.service.ForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class UiController {

    @Autowired
    ForecastService forecastService;

    @RequestMapping("/forecast/daily")
    public ForeCastDaily ForcastDaily(@RequestParam String q) throws IOException {

        System.out.println("Feign comsumer");
        final ForeCastDaily weatherInfoByName = forecastService.getWeatherInfoByName(q);

        return weatherInfoByName;
    }
}