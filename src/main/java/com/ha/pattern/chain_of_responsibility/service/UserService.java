package com.ha.pattern.chain_of_responsibility.service;

import com.ha.pattern.chain_of_responsibility.chain.ExecutionContext;
import com.ha.pattern.chain_of_responsibility.chain.UserCreationCatalog;
import com.ha.pattern.chain_of_responsibility.model.User;
import org.apache.commons.chain.Catalog;
import org.apache.commons.chain.Command;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  public User create(User user) throws Exception {

    ExecutionContext context = new ExecutionContext();
    context.setUser(user);

    Catalog<ExecutionContext> catalog = new UserCreationCatalog();
    Command<ExecutionContext> userCreationChain = catalog.getCommand("userCreationChain");

    userCreationChain.execute(context);
    return user;
  }
}
