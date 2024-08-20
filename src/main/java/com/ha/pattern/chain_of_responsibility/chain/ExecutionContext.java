package com.ha.pattern.chain_of_responsibility.chain;

import com.ha.pattern.chain_of_responsibility.model.User;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.chain.impl.ContextBase;

@Getter
@Setter
public class ExecutionContext extends ContextBase {
  User user;
  String idReference;
}
