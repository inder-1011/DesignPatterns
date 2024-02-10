package com.example.prcatice.designPatterns.ObserverDP.Observer;

import com.example.prcatice.designPatterns.ObserverDP.Observable.StockObservable;

public class EmailNotificationAlertImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable stockObservable;
    @Override
    public void update() {
        sendEmail(emailId ,"emaild sent");
    }

    public EmailNotificationAlertImpl(String emailId, StockObservable stockObservable){
        this.emailId= emailId;
        this.stockObservable= stockObservable;
    }

    public void sendEmail(String emailId,String msg){
        System.out.println();
    }


}
