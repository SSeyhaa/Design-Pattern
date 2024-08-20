package com.ha.pattern.chain_of_responsibility.chain;

import com.ha.pattern.chain_of_responsibility.constant.UserConstant;
import com.ha.pattern.chain_of_responsibility.model.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.chain.Command;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserCreationKeycloakHandler implements Command<ExecutionContext> {
  @Override
  public boolean execute(ExecutionContext context) throws Exception {

    User user = (User) context.get(UserConstant.USER);
    // logic to create user in keycloak
    log.info("----- Creating user in keycloak: {}", user);
    // done creating user in keycloak
    String idReference = "kkljdfekjfosfnewwy"; // fake id reference user in keycloak

    context.put(
        UserConstant.ID_REFERENCE, idReference); // set id reference for next handler to save in DB

    return false; // return false to continue the chain
  }
}
