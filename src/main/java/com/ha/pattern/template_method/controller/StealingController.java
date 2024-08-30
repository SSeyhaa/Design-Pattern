package com.ha.pattern.template_method.controller;

import com.ha.pattern.template_method.service.HalflingThief;
import com.ha.pattern.template_method.template_method.StealingMethod;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stealing")
@RequiredArgsConstructor
public class StealingController {

  private final HalflingThief halflingThief;

  /* @PathVariable for testing: 'HitAndRunMethod', 'SubtleMethod' */
  @GetMapping("/{method}")
  public void steal(@PathVariable String method) {
    StealingMethod stealingMethod = halflingThief.getStealingMethod(method);
    stealingMethod.steal();
  }
}
