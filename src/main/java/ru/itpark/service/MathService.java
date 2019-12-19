package ru.itpark.service;

public class MathService implements ServiceInterface {

    @Override
    public int calculate(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
