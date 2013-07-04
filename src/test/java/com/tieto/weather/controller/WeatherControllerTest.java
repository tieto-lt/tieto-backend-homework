package com.tieto.weather.controller;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tieto.weather.BaseTest;

/**
 * Tests {@link WeatherController}.
 */
public class WeatherControllerTest extends BaseTest {

    @Autowired
    private WeatherController controller;

    @Test
    @Ignore("Can be enabled once WeatherController is implemented.")
    public void getWeaterAllCities() {
        // XXX: dummy test
        controller.getWeather();
    }
}
