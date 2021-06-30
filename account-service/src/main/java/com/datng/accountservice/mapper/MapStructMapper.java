package com.datng.accountservice.mapper;

import com.datng.accountservice.dto.AccountDto;
import com.datng.accountservice.entities.Account;
import org.mapstruct.Mapper;

@Mapper
public interface MapStructMapper {

  AccountDto mapAccountToAccountDto(Account account);
}
