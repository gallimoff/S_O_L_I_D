package ru.itpark;

import ru.itpark.io.*;
import ru.itpark.model.Math;
import ru.itpark.service.ServiceInterface;
import ru.itpark.service.MathService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServiceInterface service = new MathService();
        ReaderInterface reader = new ReaderConsole(scanner);
        PrinterInterface printer = new PrinterConsole();
        DataInterface data = new Data(printer, reader);
        Math math = new Math();
        math.init(data);
        math.calculate(service);
        math.done(data);

    }
}