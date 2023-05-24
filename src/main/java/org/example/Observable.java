package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Observable {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Tour tour, Singe singe) {

        observers.stream().filter(Objects::nonNull).forEach(observer -> observer.update(tour,singe));

    }
}
