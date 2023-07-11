package models;

import java.util.List;

public class CurrentWeather {
    Coordinate coord;
    List<Weather> weather;
    String base;

    public CurrentWeather(Coordinate coord, List<Weather> weather, String base, String name, Main main) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.name = name;
        this.main = main;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinate getCoord() {
        return coord;
    }

    public void setCoord(Coordinate coord) {
        this.coord = coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    Main main;

    }
