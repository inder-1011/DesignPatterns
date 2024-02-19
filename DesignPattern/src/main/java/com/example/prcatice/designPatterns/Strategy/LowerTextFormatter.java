package com.example.prcatice.designPatterns.Strategy;

public class LowerTextFormatter implements TextFormatter{
    @Override
    public void formatText(String text) {
        System.out.println("[LowerTextFormatter]: "+text.toLowerCase());

    }
}
