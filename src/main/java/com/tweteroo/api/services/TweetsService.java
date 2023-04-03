package com.tweteroo.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.tweteroo.api.dtos.TweetDTO;
import com.tweteroo.api.models.Tweet;
import com.tweteroo.api.repositories.TweetRepository;

@Service
public class TweetsService {
    
    @Autowired
    private TweetRepository repository;

    public void create(TweetDTO data) {
        repository.save(new Tweet(data));
    }

    public List<Tweet> findByPage(int page) {
        Pageable pageable = PageRequest.of(page, 5, Sort.by(Order.desc("id")));
        return repository.findAll(pageable).getContent();
    }

}
