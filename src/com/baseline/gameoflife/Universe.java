package com.baseline.gameoflife;

public class Universe {

    private Input input;

    public Universe(Input input) {
        this.input = input;
    }

    public String acceptSize() {
        return input.getInput();
    }
}
