package com.ha.pattern.chain_of_responsibility.chain;

import org.apache.commons.chain.impl.ChainBase;
import org.springframework.stereotype.Component;

@Component
public class UserCreationChain extends ChainBase<ExecutionContext> {

  public UserCreationChain() {
    super();
    addCommand(new UserCreationKeycloakHandler());
    addCommand(new UserCreationDBHandler());
    addCommand(new UserCreationMailHandler());
  }
}
