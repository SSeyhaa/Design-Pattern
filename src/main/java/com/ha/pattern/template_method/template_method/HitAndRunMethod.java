package com.ha.pattern.template_method.template_method;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/** HitAndRunMethod implementation of {@link StealingMethod}. */
@Component
@Slf4j
public class HitAndRunMethod extends StealingMethod {

  @Override
  protected String getMethod() {
    return HitAndRunMethod.class.getSimpleName();
  }

  @Override
  protected String pickTarget() {
    return "old goblin woman";
  }

  @Override
  protected void confuseTarget(String target) {
    log.info("----- Approach the {} from behind.", target);
  }

  @Override
  protected void stealTheItem(String target) {
    log.info("----- Grab the handbag and run away fast!");
  }
}
