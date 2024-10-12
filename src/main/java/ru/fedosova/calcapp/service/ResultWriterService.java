package ru.fedosova.calcapp.service;

public class ResultWriterService {
    public static void printResult(int num1, int num2, int result, char operation) {
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}
