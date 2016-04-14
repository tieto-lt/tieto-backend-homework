package com.tieto.weather.integration;

/**
 * External weather provider client.
 */
public interface WeatherUndergroundClient {

    /**
     * Returns {@link WeatherUndergroundObservation} from weather provider.
     *
     * @param city
     * @return {@link WeatherUndergroundObservation}
     */
    WeatherUndergroundObservation getWeather(final String city);
}
