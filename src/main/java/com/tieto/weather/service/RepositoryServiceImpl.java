package com.tieto.weather.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.tieto.weather.model.rest.WeatherObservation;

@Service
public class RepositoryServiceImpl implements RepositoryService {

    /**
     * {@inheritDoc}
     */
    @Override
    public WeatherObservation getWeather(final String city) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<WeatherObservation> getWeather() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
