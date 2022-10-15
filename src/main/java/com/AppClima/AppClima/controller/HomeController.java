package com.AppClima.AppClima.controller;

import com.AppClima.AppClima.service.WeatherCityService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final WeatherCityService service;

    @GetMapping("/")
    public String home(Model model){
        service.saveEntity();
        model.addAttribute("cities", service.getList());
        return "home";
    }

}
