package io;

import app.Option;

import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);

    public String readUrl() {
        System.out.println("Enter the link to the match you wish to predict:");
        return scanner.nextLine();
    }
}
