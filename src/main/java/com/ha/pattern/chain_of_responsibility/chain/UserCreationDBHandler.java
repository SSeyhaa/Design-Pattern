package com.ha.pattern.chain_of_responsibility.chain;

import com.ha.pattern.chain_of_responsibility.constant.UserConstant;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.chain.Command;

@Slf4j
public class UserCreationDBHandler implements Command<ExecutionContext> {
  @Override
  public boolean execute(ExecutionContext context) {

    String idReference = (String) context.get(UserConstant.ID_REFERENCE);
    // logic to create user in DB

    log.info("----- Saving user in DB with id reference: {}", idReference);

    // set email for next handler to send email (fake)
    context.put(UserConstant.EMAIL, "email@example.com");

    return false; // return true to end the chain
  }
}
