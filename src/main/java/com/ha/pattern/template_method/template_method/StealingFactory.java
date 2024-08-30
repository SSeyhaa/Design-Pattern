package com.ha.pattern.template_method.template_method;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class StealingFactory {

  private final Map<String, StealingMethod> stealingMethodMap;

  public StealingFactory(List<StealingMethod> stealingMethods) {
    this.stealingMethodMap =
        stealingMethods.stream()
            .collect(Collectors.toMap(StealingMethod::getMethod, Function.identity()));
  }

  public StealingMethod get(String method) {
    StealingMethod stealingMethod = stealingMethodMap.get(method);
    if (stealingMethod == null) {
      throw new IllegalArgumentException("----- Unsupported method");
    }
    return stealingMethod;
  }
}
