package com.tweteroo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dtos.TweetDTO;
import com.tweteroo.api.models.Tweet;
import com.tweteroo.api.services.TweetsService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweets")
public class TweetsController {
    
    @Autowired
    private TweetsService service;

    @PostMapping
    public void create(@RequestBody @Valid TweetDTO body) {
        service.create(body);
    }

    @GetMapping(params = { "page" })
    public List<Tweet> getPage(@RequestParam("page") int page) {
        return service.findByPage(page);
    }

    @GetMapping("/{username}")
    public List<Tweet> getByUsername(@PathVariable String username) {
        return service.findByUsername(username);
    }
}
