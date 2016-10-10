package com.shadow.cloud;

import com.shadow.cloud.Repository.CityRepository;
import com.shadow.cloud.domain.City;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: shadow @github.com/shadowsama
 * Date: 2016/9/19
 * Describe: find city by id or name
 */

@Api("find city by id or name ")
@RequestMapping("/city")
@RestController
public class CityController {
    @Autowired
    CityRepository cityRepository;

    @ApiOperation("find city by id")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "cityId", value = "cityId")
    })
    @ApiResponses({
            @ApiResponse(code=200,message = "successful request"),
            @ApiResponse(code=401,message = "no aouth2")
    })
    @ResponseBody
    @RequestMapping("/{cityId}")
    public City findCityById(@PathVariable String cityId){

        City city = cityRepository.findBy_id(cityId);
        return  city;

    }


}