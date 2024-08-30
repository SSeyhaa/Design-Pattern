package com.ha.pattern.template_method.service;

import com.ha.pattern.template_method.template_method.StealingFactory;
import com.ha.pattern.template_method.template_method.StealingMethod;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/** Halfling thief uses {@link StealingMethod} to steal. */
@Service
@RequiredArgsConstructor
public class HalflingThief {

  private final StealingFactory stealingFactory;

  public StealingMethod getStealingMethod(String method) {
    return stealingFactory.get(method);
  }
}
