package com.tieto.weather.controller;

import com.tieto.weather.model.soap.WeatherResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Weather Rest controller.
 */
@Controller
public class WeatherController {

    private static final String HEADER = "Accept=application/json";

    /**
     * Endpoint for fetching supported locations weather data.
     *
     * @return {@link WeatherResponse}
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, headers = HEADER)
    public WeatherResponse getWeather() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Endpoint for fetching single location weather data.
     *
     * @return {@link WeatherResponse}
     */
    @ResponseBody
    @RequestMapping(value = "/{city}", method = RequestMethod.GET, headers = HEADER)
    public WeatherResponse getWeather(@PathVariable final String city) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
