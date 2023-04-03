package com.tweteroo.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.api.dtos.AccountDTO;
import com.tweteroo.api.models.Account;
import com.tweteroo.api.repositories.AccountRepository;

@Service
public class SignUpService {
    
    @Autowired
    private AccountRepository repository;

    public void signUp(AccountDTO data) {
        repository.save(new Account(data));
    }
}
