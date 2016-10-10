package com.shadow.service.weather.domain;

import lombok.Data;

import java.util.List;

/**
 * Created by Administrator on 2016/9/18.
 */
@Data
public class City {

    String id;
    String name;
    Coord coord;
    String country;
    long population;



}