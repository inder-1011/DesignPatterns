package com.example.prcatice.MultiThreading.Thread;

public class OddEven {

    public static void main(String[] args) {

        Printer evenObject = new Printer(2);
        Printer fivePrint = new Printer(5);
        Printer sevenPrint = new Printer(7);
        Thread evenThread= new Thread(evenObject,"two Thread");
        Thread oddThread= new Thread(fivePrint,"Five Thread");
        Thread seven_thread= new Thread(sevenPrint,"Seven Thread");
        evenThread.start();
        oddThread.start();
        seven_thread.start();

    }

}
