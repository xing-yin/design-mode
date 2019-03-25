package com.csnote.Observer.src;

public interface Subject {

    void resisterObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}