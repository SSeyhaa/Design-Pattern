package com.ha.pattern.observer.constant;

import lombok.Getter;

@Getter
public enum WeatherType {
  SUNNY("Sunny"),
  RAINY("Rainy"),
  WINDY("Windy"),
  COLD("Cold");

  private final String description;

  WeatherType(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}
