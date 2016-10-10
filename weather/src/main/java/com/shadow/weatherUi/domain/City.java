package com.shadow.weatherUi.domain;

import lombok.Data;

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