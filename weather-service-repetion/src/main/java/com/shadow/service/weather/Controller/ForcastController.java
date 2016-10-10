package com.shadow.service.weather.Controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.alibaba.fastjson.JSON;
import com.shadow.service.weather.Action.SyncGet;
import com.shadow.service.weather.domain.ForeCastDaily;
import com.shadow.service.weather.domain.WeatherInfo;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.SchemaOutputResolver;
import java.io.IOException;
import java.util.Objects;



//  version 1.0 is used for this is for jsonp
// and version 2.0 is use json
@Api("天气服务集群")
@Slf4j
@RestController
public class ForcastController {

    @Autowired
    SyncGet syncGet;

    @Autowired
    private DiscoveryClient client;

    @ApiOperation("Get")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "q", value = "q")
    })
    @ApiResponses({
            @ApiResponse(code=200,message = "successful request"),
            @ApiResponse(code=401,message = "no aouth2")
    })
    @RequestMapping("/forecast/daily")
    public ForeCastDaily ForcastDaily(@RequestParam(value = "q") String q) throws IOException {

        ServiceInstance instance = client.getLocalServiceInstance();

        final ForeCastDaily weatherInfoByName = syncGet.getWeatherInfoByName(q);
        log.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + JSON.toJSONString(weatherInfoByName));

        return weatherInfoByName;


    }
}