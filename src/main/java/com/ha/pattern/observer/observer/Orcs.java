package com.ha.pattern.observer.observer;

import com.ha.pattern.observer.constant.WeatherType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Orcs implements WeatherObserver {
  @Override
  public void update(WeatherType currentWeather) {
    log.info("The orcs are facing {} weather now", currentWeather.getDescription());
  }
}
