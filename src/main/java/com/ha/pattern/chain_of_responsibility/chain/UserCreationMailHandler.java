package com.ha.pattern.chain_of_responsibility.chain;

import com.ha.pattern.chain_of_responsibility.constant.UserConstant;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.chain.Command;

@Slf4j
public class UserCreationMailHandler implements Command<ExecutionContext> {
  @Override
  public boolean execute(ExecutionContext context) {

    String email = (String) context.get(UserConstant.EMAIL);
    // logic to create user in DB

    log.info("----- Sending notify mail to user : {}", email);

    return true; // return true to end the chain
  }
}
