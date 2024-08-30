package com.ha.pattern.observer.observer;

import com.ha.pattern.observer.constant.WeatherType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Hobbit implements WeatherObserver {
  @Override
  public void update(WeatherType currentWeather) {
    log.info("The hobbits are facing {} weather now", currentWeather.getDescription());
  }
}
