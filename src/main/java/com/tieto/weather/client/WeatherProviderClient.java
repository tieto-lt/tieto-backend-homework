package com.tieto.weather.client;

import com.tieto.weather.model.rest.WeatherObservation;

/**
 * External weather provider client.
 */
public interface WeatherProviderClient {

    /**
     * Returns {@link WeatherObservation} from weather provider.
     *
     * @param city
     * @return {@link WeatherObservation}
     */
    WeatherObservation getWeather(final String city);
}
