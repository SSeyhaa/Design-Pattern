package com.ha.pattern.observer.controller;

import com.ha.pattern.observer.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/weather")
@RequiredArgsConstructor
public class WeatherController {
  private final WeatherService weatherService;

  @GetMapping
  public ResponseEntity<Void> getCurrentWeather() {
    weatherService.changeWeather();
    return ResponseEntity.noContent().build();
  }
}
