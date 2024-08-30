package com.ha.pattern.template_method.template_method;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Defines a skeleton for the stealing algorithm using the Template Method pattern. This abstract
 * class outlines the structure of the stealing process, allowing subclasses to implement specific
 * steps. @Component indicates that this class is a Spring component.
 */
@Component
@Slf4j
public abstract class StealingMethod {

  /**
   * Returns the name of the specific stealing method.
   *
   * @return A string representing the name of the stealing method.
   */
  protected abstract String getMethod();

  /**
   * Selects a target for the stealing operation.
   *
   * @return A string identifying the chosen target.
   */
  protected abstract String pickTarget();

  /**
   * Implements the strategy to confuse or distract the target.
   *
   * @param target The identifier of the target to be confused.
   */
  protected abstract void confuseTarget(String target);

  /**
   * Implements the core action of stealing the item from the target.
   *
   * @param target The identifier of the target from whom to steal.
   */
  protected abstract void stealTheItem(String target);

  /**
   * Executes the complete stealing process.
   * This method defines the template of the algorithm and
   * calls the abstract methods in a specific order.
   */
  public final void steal() {
    final var target = pickTarget();
    log.info("----- The target has been chosen as {}.", target);

    confuseTarget(target);
    stealTheItem(target);
  }
}
