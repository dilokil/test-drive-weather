package ru.croc.weather.service;

import org.springframework.stereotype.Service;
import ru.croc.weather.model.Quote;

@Service
public class QuoteService {

    public Quote getRandomQuote() {

        return new Quote();
    }
}
