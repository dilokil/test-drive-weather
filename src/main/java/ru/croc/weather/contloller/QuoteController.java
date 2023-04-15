package ru.croc.weather.contloller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.croc.weather.model.Quote;
import ru.croc.weather.service.QuoteService;

@RestController
@RequestMapping("/api/quote")
public class QuoteController {

    private final QuoteService quoteService;

    @Autowired
    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping("get")
    public ResponseEntity<Quote> getWeather() {
        return ResponseEntity
                .ok()
                .body(quoteService.getRandomQuote());
    }
}
