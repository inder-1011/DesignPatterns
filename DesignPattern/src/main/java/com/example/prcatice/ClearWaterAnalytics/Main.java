package com.example.prcatice.ClearWaterAnalytics;

public class Main {
    public static void printHello() {
        System.out.println("Hello! how are you?");
    }

    public static void main(String[] args) {
        // Define a class extending Thread for each thread
        class HelloThread extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    printHello();
                }
            }
        }

        // Create and start four separate threads
        for (int i = 0; i < 4; i++) {
            Thread thread = new HelloThread();
            thread.start();
        }
    }
}
