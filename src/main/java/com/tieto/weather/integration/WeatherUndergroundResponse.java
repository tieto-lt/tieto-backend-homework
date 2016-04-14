package com.tieto.weather.integration;

import java.util.Collection;

/**
 * {@link WeatherUndergroundObservation} container,
 * only needed for the nice binding when rendering multiple observation response data.
 */
public class WeatherUndergroundResponse {

    private Collection<WeatherUndergroundObservation> result;

    public Collection<WeatherUndergroundObservation> getResult() {
        return result;
    }

    public void setResult(final Collection<WeatherUndergroundObservation> result) {
        this.result = result;
    }
}
