package com.tieto.weather.core;

import com.tieto.weather.Application;
import org.junit.runner.RunWith;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Application.class, TestConfiguration.class })
@WebIntegrationTest
public abstract class IntegrationTest {
}
