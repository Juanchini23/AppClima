package com.AppClima.AppClima.repository;

import com.AppClima.AppClima.model.WeatherCity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherCityRepository extends JpaRepository<WeatherCity, Long> {
}
