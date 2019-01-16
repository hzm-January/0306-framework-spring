package houzm.accumulation.ed.jdk.observer.custom;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * author: hzm_dream@163.com
 * date: 2019/1/16 12:43
 * description:
 */
public class WeatherData implements Subject {
    private float temperature; //温度
    private float humidity; //湿度
    private float pressure; //气压
    private List<Observer> observers = new LinkedList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    private void measurementsChanged() {
        this.notifyObservers();
    }
}
