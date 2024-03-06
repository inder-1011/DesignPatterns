package com.example.prcatice.MultiThreading.Thread;

import org.springframework.ui.context.Theme;

public class Deadlock {

    String s1= "indrajeet";
    String s2 = "verma";
    Thread t1= new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (s1){
                try {
                    System.out.println("inside thread 1"+ s1);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (s2){
                    System.out.println("inside thread 1"+ s2);
                }
            }
        }
    });
    Thread t2= new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (s2){
                System.out.println("inside thread 2"+ s2);
                synchronized (s1){
                    System.out.println("inside thread 2"+ s1);
                }
            }
        }
    });

    public static void main(String[] args) {
        Deadlock d= new Deadlock();
        d.t1.start();
        d.t2.start();
    }
}
