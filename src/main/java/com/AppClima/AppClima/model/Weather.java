package com.AppClima.AppClima.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;
    private int humidity;
    private double pressure;
    private String st;
    private int visibility;
    private int wind_speed;
    private int id;
    private String description;
    private int temp;
    private String wing_deg;
    private String tempDesc;
}
