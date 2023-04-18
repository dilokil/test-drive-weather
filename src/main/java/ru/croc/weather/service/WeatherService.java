package ru.croc.weather.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import ru.croc.weather.model.FactWeather;

@Service
public class WeatherService {

    public FactWeather getFactWeather(String response) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode responseJson = mapper.readTree(response);
        return mapper.treeToValue(responseJson.path("fact"), FactWeather.class);
    }
}
