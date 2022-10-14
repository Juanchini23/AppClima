package com.AppClima.AppClima.service.impl;

import com.AppClima.AppClima.repository.CityRepository;
import com.AppClima.AppClima.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;
}
