package com.tieto.weather.endpoint;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tieto.weather.BaseTest;
import com.tieto.weather.controller.WeatherController;

/**
 * Tests {@link WeatherController}.
 */
public class WeatherEndpointTest extends BaseTest {

    @Autowired
    private WeatherEndpoint endpoint;

    @Test
    @Ignore("Can be enabled once WeatherEndpoint is implemented.")
    public void getWeaterAllCities() {
        // XXX: dummy test
        endpoint.getWeather(null);
    }
}
