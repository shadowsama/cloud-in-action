package com.shadow.service.weather.Controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shadow.service.weather.Action.SyncGet;
import com.shadow.service.weather.domain.WeatherInfo;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;


import java.io.IOException;

@Api("get方式获取openwether上的天气信息")
@RequestMapping("/city")
@RestController()
public class WeatherController {

    @Autowired
    SyncGet syncGet;


    @ApiOperation("method=get only")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "cityId", value = "cityId")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "successful request"),
    })
    @RequestMapping("/{cityId}")
    public String getweatherInfo(@PathVariable String cityId) throws IOException {

        String weatherInfo = syncGet.getWeatherInfoById(cityId);

        final WeatherInfo Info = JSON.parseObject(weatherInfo, WeatherInfo.class);
        final String result = JSON.toJSONString(Info);
        return result;

    }

}