package com.baseline.gameoflife;

public class Output {

    private String message;

    public Output(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println(message);
    }
}
