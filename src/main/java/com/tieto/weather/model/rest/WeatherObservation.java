package com.tieto.weather.model.rest;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * DTO class for weather observation's.
 */
@JsonRootName(value = "result")
public class WeatherObservation {

    private String location;

    @JsonProperty(value = "temp_c")
    private String temperature;

    @JsonProperty(value = "relative_humidity")
    private String humidity;

    private String weather;

    @JsonProperty(value = "wind_dir")
    private String windDirection;

    @JsonProperty(value = "wind_string")
    private String wind;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }
}
