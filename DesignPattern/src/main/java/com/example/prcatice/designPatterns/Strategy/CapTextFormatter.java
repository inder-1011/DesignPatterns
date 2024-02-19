package com.example.prcatice.designPatterns.Strategy;

public class CapTextFormatter implements TextFormatter{
    @Override
    public void formatText(String text) {
        System.out.println("[CapTextFormatter]: "+text.toLowerCase());

    }
}
