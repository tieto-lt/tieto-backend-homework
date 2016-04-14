package com.tieto.weather.integration;

import com.tieto.weather.api.endpoint.rest.WeatherController;
import com.tieto.weather.api.endpoint.soap.WeatherEndpoint;
import com.tieto.weather.core.IntegrationTest;
import com.tieto.weather.model.api.WeatherRequest;
import com.tieto.weather.model.api.WeatherResponse;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

/**
 * Tests {@link WeatherController}.
 */
public class WeatherIntegrationTest extends IntegrationTest {

    @Autowired
    private WeatherController controller;

    @Autowired
    private WeatherEndpoint endpoint;

    @Autowired
    private WeatherUndergroundClient client;

    @Test
    public void soapAndRestEndpointsShouldReturnIdenticalResponses() {
        String cityName = "Test";
        WeatherResponse restResponse = controller.getWeatherObservation(cityName);

        WeatherRequest soapRequest = new WeatherRequest();
        soapRequest.getCity().add(cityName);
        WeatherResponse soapResponse = endpoint.getWeather(soapRequest);

        assertThat(restResponse, Matchers.is(soapResponse));

    }

    @Test
    public void tryMockedTest() {
        WeatherUndergroundObservation response = new WeatherUndergroundObservation();
        when(client.getWeather("aaa")).thenReturn(response);
        assertThat(client.getWeather("aaa"), Matchers.sameInstance(response));
    }
}
