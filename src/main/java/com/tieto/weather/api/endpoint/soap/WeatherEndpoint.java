package com.tieto.weather.api.endpoint.soap;

import com.tieto.weather.model.api.WeatherObservationType;
import com.tieto.weather.model.api.WeatherRequest;
import com.tieto.weather.model.api.WeatherResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


/**
 * Weather SOAP endpoint.
 */
@Endpoint
public class WeatherEndpoint {

    private static final String NAMESPACE_URI = "http://tieto.com/weather/schemas";

    /**
     * Endpoint for fetching location weather data.
     *
     * @param {@link WeatherRequest}
     * @return {@link WeatherResponse}
     */
    @PayloadRoot(namespace=NAMESPACE_URI, localPart = "WeatherRequest")
    @ResponsePayload
    public WeatherResponse getWeather(@RequestPayload final WeatherRequest request) {
        WeatherObservationType observation = new WeatherObservationType();
        WeatherResponse response = new WeatherResponse();
        response.getWeatherObservation().add(observation);
        return response;
    }
}
