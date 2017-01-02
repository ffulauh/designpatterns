package me.ffulauh.dp.observer;

/**
 * Created by ffulauh on 2016/12/25.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
