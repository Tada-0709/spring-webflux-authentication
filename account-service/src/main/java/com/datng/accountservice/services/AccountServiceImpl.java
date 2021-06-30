package com.datng.accountservice.services;

import com.datng.accountservice.dto.AccountDto;
import com.datng.accountservice.entities.Account;
import com.datng.accountservice.enums.AccountStatus;
import com.datng.accountservice.mapper.MapStructMapper;
import com.datng.accountservice.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
//@AllArgsConstructor
public class AccountServiceImpl implements AccountService{

  private final AccountRepository accountRepository;
  private final MapStructMapper mapper;

  @Autowired
  public AccountServiceImpl(
      AccountRepository accountRepository, MapStructMapper mapper) {
    this.accountRepository = accountRepository;
    this.mapper = mapper;
  }

  @Override
  public Mono<AccountDto> create(AccountDto accountDto) {
    return accountRepository.save(Account.builder()
        .username(accountDto.getUsername())
        .email(accountDto.getEmail())
        .password(accountDto.getPassword())
        .salt(accountDto.getSalt())
        .accountStatus(AccountStatus.CREATED)
        .build()).map(mapper::mapAccountToAccountDto);
  }
}
