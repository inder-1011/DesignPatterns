package com.example.prcatice.MultiThreading.Thread;

public class Main {
    public static void main(String[] args) {
        Tasks tasks= new Tasks();
        Thread t1 = new Thread(()->{tasks.tasks1();});
        Thread t2 = new Thread(()->{tasks.task2();});
        Thread t3 = new Thread(()-> tasks.task3());

        t1.start();
        t2.start();
        t3.start();
    }
}
