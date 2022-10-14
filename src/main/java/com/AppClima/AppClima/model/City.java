package com.AppClima.AppClima.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @OneToOne
    private Weather weather;
    private String forecast;

}
