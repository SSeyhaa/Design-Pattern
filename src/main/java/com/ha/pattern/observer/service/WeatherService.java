package com.ha.pattern.observer.service;

import com.ha.pattern.observer.observer.Weather;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherService {
  private final Weather weather;

  public void changeWeather() {
    weather.timePasses();
    weather.timePasses();
    weather.timePasses();
    weather.timePasses();
  }
}
