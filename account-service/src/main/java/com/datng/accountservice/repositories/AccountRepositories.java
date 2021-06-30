package com.datng.accountservice.repositories;

import com.datng.accountservice.entities.Account;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepositories extends ReactiveCrudRepository<Account, String> {

}
