package ru.croc.weather.contloller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.croc.weather.service.WeatherService;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {
    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${api.yandex.token}")
    private String yandexToken;

    @Value("${yandex.template.url}")
    private String url;

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @RequestMapping("get")
    public ResponseEntity<?> getWeather(@RequestParam String longitude, @RequestParam String latitude) throws JsonProcessingException {
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
        if (response.getStatusCode() == HttpStatus.OK) {
            return ResponseEntity
                    .ok()
                    .body(weatherService.getFactWeather(response.getBody()));
        } else {
            return ResponseEntity
                    .badRequest()
                    .body("Error with request on Weather API");
        }
    }
}
