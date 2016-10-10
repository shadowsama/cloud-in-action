package com.shadow.weatherUi.service;

import com.shadow.weatherUi.domain.ForeCastDaily;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "forecast",fallback = ForecastHyStrixService.class)
public interface ForecastService {

    @RequestMapping(method = RequestMethod.GET, value = "/forecast/daily/", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ForeCastDaily getWeatherInfoByName(@RequestParam(value = "q") String q);
}