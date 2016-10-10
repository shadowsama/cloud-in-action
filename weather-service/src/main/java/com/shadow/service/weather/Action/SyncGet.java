package com.shadow.service.weather.Action;


import com.alibaba.fastjson.JSON;
import com.shadow.service.weather.domain.ForeCastDaily;
import com.shadow.service.weather.domain.Weather;
import com.shadow.service.weather.domain.WeatherInfo;
import com.shadow.service.weather.utils.HttpClientUtil;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import springfox.documentation.spring.web.json.Json;


import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
@Component
public  class SyncGet {

    @Value(value = "${appid}")
    @NotNull
    public  String appid;


    public    String getWeatherInfoById(String cityID) throws IOException {

        Map map = new HashMap();
        map.put("id", cityID);
        map.put("APPID", appid);
        String info = HttpClientUtil.doGet("http://api.openweathermap.org/data/2.5/forecast/city", map);
       return info;

    }

 //   q=Hamburg&APPID=&callback=angular.callbacks._0&cnt=7&lang=en&mode=json&units=metric

    public  ForeCastDaily getWeatherInfoByName(String CityName) throws IOException {

        Map map = new HashMap();
        map.put("q", CityName);
        map.put("APPID", appid);

        String info = HttpClientUtil.doGet("http://api.openweathermap.org/data/2.5/forecast/daily", map);
        return JSON.parseObject(info, ForeCastDaily.class);

    }
}