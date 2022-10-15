package com.AppClima.AppClima.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Weather {

    private int humidity;
    private double pressure;
    private String st;
    private int visibility;
    private int wind_speed;
    private Long id;
    private String description;
    private int temp;
    private String wing_deg;
    private String tempDesc;
}
