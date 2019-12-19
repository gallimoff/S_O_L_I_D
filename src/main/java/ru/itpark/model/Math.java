package ru.itpark.model;

import ru.itpark.io.DataInterface;
import ru.itpark.io.PrinterInterface;
import ru.itpark.service.ServiceInterface;

public class Math {
    int firstNumber;
    int secondNumber;
    int sum;

    public void init(DataInterface data){
        firstNumber = data.input("Enter first number: ");
        secondNumber = data.input("Enter second number: ");
    }
    public void calculate(ServiceInterface service){
        sum =  service.calculate(firstNumber, secondNumber);
    }

    public void done(PrinterInterface printer){
        printer.print("Result: " + sum);
    }
}


