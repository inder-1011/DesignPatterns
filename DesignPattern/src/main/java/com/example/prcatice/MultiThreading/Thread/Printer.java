package com.example.prcatice.MultiThreading.Thread;

import java.util.function.Predicate;

public class Printer implements Runnable{

    static int counter=1;
    int remainder;
    static Object lock= new Object();

    public Printer(int remainder) {
        this.remainder= remainder;
    }


    public void printer(){
        System.out.println(Thread.currentThread().getName()+" "+counter++);
    }
    @Override
    public void run() {
        for (int i=0;i<=10;i++){
            synchronized (lock) {
                if (remainder !=2) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                printer();
                lock.notifyAll();

            }

        }
    }
}
