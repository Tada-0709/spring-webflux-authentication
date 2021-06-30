package com.datng.accountservice.entities;

import com.datng.accountservice.enums.AccountStatus;
import java.time.Instant;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {

  @Id
  String id;
  String username;
  String email;
  String password;
  String salt;

  Profile profile;
  AccountStatus accountStatus;
  Instant createdDate;
  Instant updatedDate;

}
