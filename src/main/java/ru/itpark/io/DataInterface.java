package ru.itpark.io;

public interface DataInterface extends PrinterInterface, ReaderInterface {

    default int input(String text){
        print(text);
        return read();
    }
}