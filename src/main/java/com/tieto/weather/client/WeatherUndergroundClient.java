package com.tieto.weather.client;

import com.tieto.weather.model.rest.WeatherObservation;
import org.springframework.stereotype.Component;

@Component
public class WeatherUndergroundClient implements WeatherProviderClient {

    /**
     * {@inheritDoc}
     */
    @Override
    public WeatherObservation getWeather(final String city) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
