package com.example.prcatice.designPatterns.Strategy;

public class TestStrategy {
    public static void main(String[] args) {
        TextFormatter textFormatter = new CapTextFormatter();
        TextEditor editor = new TextEditor(textFormatter);
        editor.publishText("This is Cap");

        textFormatter = new LowerTextFormatter();
        editor = new TextEditor(textFormatter);
        editor.publishText("this is small");
    }


}
