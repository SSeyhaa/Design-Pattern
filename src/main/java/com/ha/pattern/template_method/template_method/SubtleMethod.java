package com.ha.pattern.template_method.template_method;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/** SubtleMethod implementation of {@link StealingMethod}. */
@Component
@Slf4j
public class SubtleMethod extends StealingMethod {

  @Override
  protected String getMethod() {
    return SubtleMethod.class.getSimpleName();
  }

  @Override
  protected String pickTarget() {
    return "shop keeper";
  }

  @Override
  protected void confuseTarget(String target) {
    log.info("----- Approach the {} with tears running and hug him!", target);
  }

  @Override
  protected void stealTheItem(String target) {
    log.info("----- While in close contact grab the {}'s wallet.", target);
  }
}
