package com.ha.pattern.strategy.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FileTypeEnum {
  CSV(".csv"),
  XML(".xml"),
  JSON(".json");

  private final String value;
}
