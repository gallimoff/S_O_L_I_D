package ru.itpark.io;

public class PrinterConsole  implements PrinterInterface {

    @Override
    public void print(String text) {
        System.out.print(text);
    }

    @Override
    public void print(int number) {
        System.out.print(number);
    }
}
