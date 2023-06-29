package org.example;

public class WeatherChecker {

    public boolean isWeatherCondition(String word) {
        return word.equalsIgnoreCase("sunny") ||
                word.equalsIgnoreCase("rainy") ||
                word.equalsIgnoreCase("cloudy") ||
                word.equalsIgnoreCase("windy") ||
                word.equalsIgnoreCase("snowy");
    }
}
