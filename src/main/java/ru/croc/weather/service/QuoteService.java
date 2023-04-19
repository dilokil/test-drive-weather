package ru.croc.weather.service;

import org.springframework.stereotype.Service;
import ru.croc.weather.model.Quote;

import java.util.List;
import java.util.Random;

@Service
public class QuoteService {

    private final List<Quote> quotes;

    public QuoteService() {
        quotes = List.of(
                new Quote("Никогда не откладывай на завтра то, что можешь сделать послезавтра.", "Марк Твен"),
                new Quote("Теория — это когда все известно, но ничего не работает. Практика — это когда все работает, но никто не знает почему. Мы же объединяем теорию и практику: ничего не работает... и никто не знает почему!", "Альберт Эйнштейн"),
                new Quote("Всё, что есть прекрасного в этой жизни, либо аморально, либо незаконно, либо приводит к ожирению.", "Оскар Уайльд"),
                new Quote("Своим долголетием я обязан спорту. Я им никогда не занимался.", "Уинстон Черчилль"),
                new Quote("Любовь слепа, но брак восстанавливает зрение.", "Георг Кристоф Лихтенберг"),
                new Quote("Очень тяжело менять, ничего не меняя, но мы будем!", "Михаил Жванецкий"),
                new Quote("Человек, повторяющий, что он не дурак, обычно имеет какие-то сомнения по этому вопросу.", "Уилсон Мизнер"));
    }

    public Quote getRandomQuote() {
        Random rand = new Random();
        return quotes.get(rand.nextInt(quotes.size()));
    }
}
