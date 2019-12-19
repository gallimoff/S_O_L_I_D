package ru.itpark.io;


public class Data implements DataInterface {
    private ReaderInterface reader;
    private PrinterInterface printer;

    public Data (PrinterInterface printer, ReaderInterface reader){
        this.reader = reader;
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        printer.print(text);
    }

    @Override
    public void print(int number) {
        printer.print(number);
    }

    @Override
    public int read() {
        return reader.read();
    }

}
