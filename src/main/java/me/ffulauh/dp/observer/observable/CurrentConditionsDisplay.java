package me.ffulauh.dp.observer.observable;

import me.ffulauh.dp.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ffulauh on 2016/12/25.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{

    Observable observable;
    private float temperature;
    private  float humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData=(WeatherData)o;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");
    }
}
