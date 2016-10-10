package com.shadow.weatherUi.domain;

import lombok.Data;

import java.util.List;

/**
 * Created by Administrator on 2016/9/18.
 */
@Data
public class WeatherInfo {
    City city;
    String cod;
    float message;
    Integer cnt;
    List<ListDetails> list;

}