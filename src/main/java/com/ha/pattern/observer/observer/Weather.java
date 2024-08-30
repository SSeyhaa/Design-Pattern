package com.ha.pattern.observer.observer;

import com.ha.pattern.observer.constant.WeatherType;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class Weather {
  private final List<WeatherObserver> observers; // all classes that implement WeatherObserver interface will be registered here
  private WeatherType currentWeather = WeatherType.SUNNY;

  public void timePasses() {
    var enumValues = WeatherType.values();
    currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
    log.info("The weather changed to {}.", currentWeather);
    notifyObservers();
  }

  private void notifyObservers() {
    for (var obs : observers) {
      obs.update(currentWeather);
    }
  }
}
