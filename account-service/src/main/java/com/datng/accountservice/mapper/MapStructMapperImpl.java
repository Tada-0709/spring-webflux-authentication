package com.datng.accountservice.mapper;

import com.datng.accountservice.dto.AccountDto;
import com.datng.accountservice.entities.Account;
import org.springframework.stereotype.Component;

@Component
public class MapStructMapperImpl implements MapStructMapper{

  @Override
  public AccountDto mapAccountToAccountDto(Account account) {
    return AccountDto.builder()
        .id(account.getId())
        .username(account.getUsername())
        .email(account.getEmail())
        .build();
  }
}
