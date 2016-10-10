package com.shadow.weatherUi.service;

import com.shadow.weatherUi.domain.ForeCastDaily;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author: shadow @github.com/shadowsama
 * Date: 2016/9/23
 * Describe: Feign allready add hystrix module；just add fallback class for easy！
 */
@Component
public class ForecastHyStrixService implements ForecastService {


    public ForeCastDaily getWeatherInfoByName(@RequestParam(value = "q") String q) {
        return new ForeCastDaily();
    }
}