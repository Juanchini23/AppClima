package com.AppClima.AppClima.controller;

import com.AppClima.AppClima.model.City;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){

        RestTemplate restTemplate = new RestTemplate();
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.build();

        City[] cityArray = restTemplate.getForObject("https://ws.smn.gob.ar/map_items/weather", City[].class);
        List<City> cityList = Arrays.asList(cityArray);
        System.out.println(cityList.get(1));
        model.addAttribute(cityList.get(1));
        return "home";
    }

}
