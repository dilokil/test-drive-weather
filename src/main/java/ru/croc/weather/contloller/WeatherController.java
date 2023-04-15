package ru.croc.weather.contloller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {
    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${api.yandex.token}")
    private String yandexToken;

    @Value("${yandex.template.url}")
    private String url;

    @RequestMapping("get")
    public String getWeather(@RequestParam String longitude, @RequestParam String latitude) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Yandex-API-Key", yandexToken);
        HttpEntity<?> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                String.class,
                latitude,
                longitude
        );
        if (response.getStatusCode() != HttpStatus.ACCEPTED) {
            return response.getBody();
        } else {
            return "bad";
        }
    }
}
