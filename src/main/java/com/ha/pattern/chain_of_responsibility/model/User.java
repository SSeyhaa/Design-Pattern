package com.ha.pattern.chain_of_responsibility.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

  private String idReference;
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private String phone;
}
