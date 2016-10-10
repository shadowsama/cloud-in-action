package com.shadow.weatherUi.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/9/21.
 */
@Data
public class ForeCastDailyList {
    Date dt;
    Temp temp;
    String pressure;
    String humidity;
    List<Weather> weather;
    String speed;
    String deg;
    String clouds;





}