package com.baseline.gameoflife;

import java.util.Scanner;

public class Input {

    private String message;

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
