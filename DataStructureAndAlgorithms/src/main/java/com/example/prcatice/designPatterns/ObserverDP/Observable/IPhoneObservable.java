package com.example.prcatice.designPatterns.ObserverDP.Observable;

import com.example.prcatice.designPatterns.ObserverDP.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservable implements StockObservable{
    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int count =0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : observerList){
            notifySubscribers();
        }
    }

    @Override
    public void setStockCount(int count) {
        if(count==0){
            notifySubscribers();
        }
        setStockCount(count);
    }

    @Override
    public int getStockCount() {
        return count;
    }
}
