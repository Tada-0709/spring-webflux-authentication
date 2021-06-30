package com.datng.accountservice.services;

import com.datng.accountservice.dto.AccountDto;
import reactor.core.publisher.Mono;

public interface AccountService {

  Mono<AccountDto> create(AccountDto accountDto);
}
