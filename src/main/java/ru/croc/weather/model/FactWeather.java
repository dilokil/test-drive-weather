package ru.croc.weather.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FactWeather {

    private Integer temp;

    @JsonSetter("feels_like")
    private Integer feelsLike;

    @JsonSetter("temp_water")
    private Integer tempWater;

    private String icon;

    private String condition;

    @JsonSetter("wind_speed")
    private Double windSpeed;

    @JsonSetter("wind_gust")
    private Double windGust;

    @JsonSetter("wind_dir")
    private String windDir;

    @JsonSetter("pressure_mm")
    private Integer pressureMm;

    @JsonSetter("pressure_pa")
    private Double pressurePa;

    private Double humidity;

    @JsonSetter("daytime")
    private String  dayTime;

    private Boolean polar;

    private String season;

    private Integer uptime;

    @JsonSetter("obs_time")
    private Integer obsTime;

    @JsonSetter("is_thunder")
    private Boolean isThunder;

    @JsonSetter("prec_type")
    private Integer precType;

    @JsonSetter("prec_strength")
    private Double precStrength;

    @JsonSetter("prec_prob")
    private Double precProb;

    private Double cloudness;

    @JsonSetter("phenom_icon")
    private String phenomIcon;

    @JsonSetter("phenom_condition")
    private String phenomCondition;

    private String source;

    @JsonSetter("soil_moisture")
    private Double soilMoisture;

    @JsonSetter("soil_temp")
    private Integer soilTemp;

    @JsonSetter("uv_index")
    private Integer uvIndex;
}
