package me.ffulauh.dp.observer;

import me.ffulauh.dp.observer.observable.*;
import me.ffulauh.dp.observer.observable.CurrentConditionsDisplay;
import me.ffulauh.dp.observer.observable.WeatherData;

/**
 * Created by ffulauh on 2016/12/25.
 */
public class Test {
    public static void main(String[] args) {
//        WeatherData weatherData=new WeatherData();
//        CurrentConditionsDisplay currentDisplay=new CurrentConditionsDisplay(weatherData);
//        weatherData.setMeasurements(80,65,24.4f);
//        weatherData.setMeasurements(90,40,34f);
//        weatherData.setMeasurements(77,59,30.4f);

//        用java内置观察者
        me.ffulauh.dp.observer.observable.WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentDisplay=new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,24.4f);
    }
}
