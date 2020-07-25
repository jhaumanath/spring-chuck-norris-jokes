package com.learning.spring.springchucknorrisjokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class RandomQuoteServiceImpl implements RandomQuoteService {

    private ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
