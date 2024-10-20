package org.codecollad.snapverse.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "User")
public class User {

  @Id
  private String id;
  private String name;
  private String lastname;
  private String username;
  private String password;
  private String created_at;

}