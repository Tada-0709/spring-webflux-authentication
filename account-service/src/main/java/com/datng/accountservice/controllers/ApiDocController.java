package com.datng.accountservice.controllers;


import com.datng.accountservice.dto.AccountDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Mono;

@Tag(name = "Account APIs", description = "API docs for account service")
public interface ApiDocController {

  @Operation(summary = "Create new account")
  @ApiResponses(
      value = {
          @ApiResponse(responseCode = "200", description = "Account created!",
            content = {@Content(mediaType = "application/json",
            schema = @Schema(implementation = AccountDto.class))
            }
          )
      }
  )
  @PostMapping
  ResponseEntity<Mono<AccountDto>> create(@RequestBody AccountDto accountDto);
}
