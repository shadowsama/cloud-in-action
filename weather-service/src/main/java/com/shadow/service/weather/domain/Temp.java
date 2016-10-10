package com.shadow.service.weather.domain;

import com.fasterxml.jackson.core.SerializableString;
import lombok.Data;

/**
 * Created by Administrator on 2016/9/21.
 */
@Data
public class Temp {
    float day;
    float min;
    float max;
    float morn;
    float night;
    float eve;
}