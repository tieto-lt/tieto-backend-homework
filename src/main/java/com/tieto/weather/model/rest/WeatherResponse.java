package com.tieto.weather.model.rest;

import java.util.Collection;

/**
 * {@link WeatherObservation} container,
 * only needed for the nice binding when rendering multiple observation response data.
 */
public class WeatherResponse {

    private Collection<WeatherObservation> result;

    public Collection<WeatherObservation> getResult() {
        return result;
    }

    public void setResult(final Collection<WeatherObservation> result) {
        this.result = result;
    }
}
