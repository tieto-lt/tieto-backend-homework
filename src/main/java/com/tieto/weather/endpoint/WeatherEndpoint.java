package com.tieto.weather.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.tieto.weather.model.soap.WeatherRequest;
import com.tieto.weather.model.soap.WeatherResponse;

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
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
