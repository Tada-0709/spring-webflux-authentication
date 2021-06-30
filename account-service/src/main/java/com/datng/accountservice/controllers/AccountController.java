package com.datng.accountservice.controllers;

import com.datng.accountservice.dto.AccountDto;
import com.datng.accountservice.services.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("api/account")
public class AccountController implements ApiDocController{

  private final AccountService accountService;

  @PostMapping
  public ResponseEntity<Mono<AccountDto>> create(@RequestBody AccountDto accountDto) {
    return ResponseEntity.ok(accountService.create(accountDto));
  }

}
