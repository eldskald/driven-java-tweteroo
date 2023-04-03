package com.tweteroo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.api.models.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {}
