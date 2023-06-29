package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WeatherCheckerTest {
    private WeatherChecker weatherChecker;

    @Before
    public void setUp() {
        weatherChecker = new WeatherChecker();
    }

    @Test
    public void testIsWeatherCondition() {
        assertTrue(weatherChecker.isWeatherCondition("sunny"));
        assertTrue(weatherChecker.isWeatherCondition("rainy"));
        assertFalse(weatherChecker.isWeatherCondition("happy"));
        assertFalse(weatherChecker.isWeatherCondition("sad"));
        assertTrue(weatherChecker.isWeatherCondition("CLOUDY"));
    }
}
