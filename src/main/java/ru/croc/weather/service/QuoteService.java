package ru.croc.weather.service;

import org.springframework.stereotype.Service;
import ru.croc.weather.model.Quote;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuoteService {

    private final List<Quote> quotes = new ArrayList<>();

    public QuoteService() {
        quotes.add(new Quote("Цитита", "автор"));
    }

    public Quote getRandomQuote() {

        return quotes.get(0);
    }
}
