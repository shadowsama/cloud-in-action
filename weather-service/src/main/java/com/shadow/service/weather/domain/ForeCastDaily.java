package com.shadow.service.weather.domain;

import lombok.Data;

import java.util.List;

/**
 * Created by Administrator on 2016/9/21.
 */
@Data
public class ForeCastDaily {
    City city;
    String cnt;
    String cod;
    String message;

    List<ForeCastDailyList> list;







}