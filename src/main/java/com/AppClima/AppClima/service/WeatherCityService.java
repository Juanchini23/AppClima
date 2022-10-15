package com.AppClima.AppClima.service;

import com.AppClima.AppClima.model.City;
import com.AppClima.AppClima.model.WeatherCity;

import java.util.List;

public interface WeatherCityService {

    void saveEntity();
    List<WeatherCity> getList();
}
