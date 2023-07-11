package services;

import models.CurrentWeather;

public interface WeatherService {
    CurrentWeather getMyWeather(String lon, String lat);

    public void getWeather();
}

