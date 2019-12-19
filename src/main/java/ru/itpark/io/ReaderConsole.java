package ru.itpark.io;

import java.util.Scanner;

public class ReaderConsole implements ReaderInterface {

    private Scanner scanner;

    public ReaderConsole (Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    public int read() {
        return scanner.nextInt();
    }
}