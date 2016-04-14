package com.tieto.weather.api.endpoint.rest;


import com.tieto.weather.model.api.WeatherObservationType;
import com.tieto.weather.model.api.WeatherResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Weather Rest controller.
 */
@RestController
public class WeatherController {

    private static final String HEADER = "Accept=application/json";

    /**
     * Endpoint for fetching supported locations weather data.
     *
     * @return {@link WeatherResponse}
     */
    @RequestMapping(value ="/observations", method = RequestMethod.GET, headers = HEADER)
    public WeatherResponse getWeatherObservations() {
        throw new UnsupportedOperationException("Not supported getWeatherObservations yet.");
    }

    /**
     * Endpoint for fetching single location weather data.
     *
     * @return {@link WeatherResponse}
     */
    @RequestMapping(value = "/observations/{city}", method = RequestMethod.GET, headers = HEADER)
    public WeatherResponse getWeatherObservation(@PathVariable final String city) {
        WeatherObservationType observation = new WeatherObservationType();
        WeatherResponse response = new WeatherResponse();
        response.getWeatherObservation().add(observation);
        return response;
    }
}
