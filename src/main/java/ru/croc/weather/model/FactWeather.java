package ru.croc.weather.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FactWeather {

    private Integer temp;

    private Integer feelsLike;

    private Integer tempWater;

    private String icon;

    private String condition;

    private Double windSpeed;

    private Double windGust;

    private String windDir;

    private Integer pressureMm;

    private Double humidity;

    private String  dayTime;

    private Boolean polar;

    private String season;

    private Integer obsTime;

    private Boolean isThunder;

    private Integer precType;

    private Double precStrength;

    private Double cloudnes;

    private String phenomIcon;

    private String phenomCondition;
}
