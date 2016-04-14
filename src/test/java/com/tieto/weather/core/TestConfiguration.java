package com.tieto.weather.core;

import com.tieto.weather.integration.WeatherUndergroundClient;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Bean
    public WeatherUndergroundClient mockClient() {
        return Mockito.mock(WeatherUndergroundClient.class);
    }
}
