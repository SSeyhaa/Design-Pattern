package com.ha.pattern.chain_of_responsibility.chain;

import org.apache.commons.chain.impl.CatalogBase;

public class UserCreationCatalog extends CatalogBase<ExecutionContext> {

  public UserCreationCatalog() {
    super();
    addCommand("userCreationChain", new UserCreationChain());
  }
}
