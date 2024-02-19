package com.example.prcatice.MultiThreading.Thread;


public class Tasks {

    public synchronized void tasks1(){
        try {

        System.out.println("inside task 1");
            Thread.sleep(10000);
        }catch (Exception e){

        }

    }

    public void task2(){
        System.out.println("task 2 outside synchronized block");
        synchronized (this){
        System.out.println("task 2 in synchronized block");
        }
    }

    public void task3(){
        System.out.println("task 3");
    }
}
