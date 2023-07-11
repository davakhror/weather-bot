package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import services.IconService;
import services.IconServiceImpl;
import services.WeatherService;
import services.WeatherServiceImpl;

public class Main {
    public static void main(String[] args) {
        IconService iconService = new IconServiceImpl();
        WeatherService weatherService = new WeatherServiceImpl();
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            WeatherBot weatherBot = new WeatherBot(
            "5990181043:AAF8hZw4yZRXTdRI1neW3wiOMWLGmMEuHL4",weatherService,iconService);
            botsApi.registerBot(weatherBot);
        }catch (TelegramApiException e){
            throw new RuntimeException(e);
        }

    }
}