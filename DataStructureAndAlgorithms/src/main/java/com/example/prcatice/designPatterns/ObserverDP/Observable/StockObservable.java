package com.example.prcatice.designPatterns.ObserverDP.Observable;

import com.example.prcatice.designPatterns.ObserverDP.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int count);
    public int getStockCount();

}
