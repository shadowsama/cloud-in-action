package com.shadow.service.weather.domain;


import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/9/18.
 */
@Data
public class ListDetails {

    Date dt;
    Main main;
    List<Weather> weather;
    Clouds clouds;
    Wind wind;
    Rain rain;
    Date dt_txt;

}