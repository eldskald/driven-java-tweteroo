package com.tweteroo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dtos.AccountDTO;
import com.tweteroo.api.services.SignUpService;

import jakarta.validation.Valid;

@RestController()
@RequestMapping("/sign-up")
public class SignUpController {

    @Autowired
    private SignUpService service;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void signUp(@RequestBody @Valid AccountDTO body) {
        service.signUp(body);
    }

}
