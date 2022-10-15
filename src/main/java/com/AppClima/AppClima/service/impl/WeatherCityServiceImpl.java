package com.AppClima.AppClima.service.impl;

import com.AppClima.AppClima.model.City;
import com.AppClima.AppClima.model.WeatherCity;
import com.AppClima.AppClima.repository.WeatherCityRepository;
import com.AppClima.AppClima.service.WeatherCityService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WeatherCityServiceImpl implements WeatherCityService {

    private final WeatherCityRepository repository;


    @Override
    public void saveEntity() {
        repository.deleteAll();
        RestTemplate restTemplate = getRestTemplate();
        City[] cityArray = restTemplate.getForObject("https://ws.smn.gob.ar/map_items/weather", City[].class);
        List<City> cities = Arrays.asList(Arrays.copyOfRange(cityArray, 0,5));
        cities.forEach(city -> {
            WeatherCity weatherCity = new WeatherCity();
            weatherCity.setName(city.getName());
            weatherCity.setTempDesc(city.getWeather().getTempDesc());
            repository.save(weatherCity);
        });
    }

    private RestTemplate getRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.build();
        return restTemplate;
    }

    @Override
    public List<WeatherCity> getList() {
        return repository.findAll();
    }
}
