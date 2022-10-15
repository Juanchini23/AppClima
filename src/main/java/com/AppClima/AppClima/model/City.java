package com.AppClima.AppClima.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class City {

    private Long id;
    private String _id;
    private double dist;
    private int lid;
    private int fid;
    private int int_number;
    private String name;
    private String province;
    private String lat;
    private String lon;
    private String zoom;
    private int updated;
    private Weather weather;
    private String forecast;

}
