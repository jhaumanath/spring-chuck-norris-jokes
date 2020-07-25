package com.learning.spring.springchucknorrisjokes.controller;

import com.learning.spring.springchucknorrisjokes.service.RandomQuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    private RandomQuoteService randomQuoteService;

    public JokeController(RandomQuoteService randomQuoteService) {
        this.randomQuoteService = randomQuoteService;
    }

    @GetMapping("/joke")
    public String getRandomQuote(Model model){
        System.out.println(randomQuoteService.getRandomQuote());
        model.addAttribute("joke",randomQuoteService.getRandomQuote());
        return "joke";
    }
}
