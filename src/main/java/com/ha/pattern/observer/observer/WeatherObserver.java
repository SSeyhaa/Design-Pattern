package com.ha.pattern.observer.observer;

import com.ha.pattern.observer.constant.WeatherType;

public interface WeatherObserver {
  void update(WeatherType currentWeather);
}
