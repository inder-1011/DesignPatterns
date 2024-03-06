package com.example.prcatice.MultiThreading.Thread;


public class Tasks {

    public synchronized void tasks1(){
        synchronized (this){
            System.out.println("Hello !");
        }

    }

    public synchronized void tasks2(){
        synchronized (this){
            System.out.println("How");
        }

    }
    public synchronized void tasks3(){
        synchronized (this){
            System.out.println(" are ");
        }

    }

    public void task2(){
        System.out.println("task 2 outside synchronized block");
        synchronized (this){
        System.out.println("Hello ! How are you");
        }
    }

}
