package com.shadow.cloud.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;

//城市信息，json格式
@Setter
@Getter
@NoArgsConstructor
public class City {

    @Id
    String _id;
    String name;
    String country;
    Coord coord;


}