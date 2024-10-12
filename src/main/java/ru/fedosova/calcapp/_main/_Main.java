package ru.fedosova.calcapp._main;

import ru.fedosova.calcapp.service.ResultWriterService;
import ru.fedosova.calcapp.util.Calculator;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.println("Введите символ операции + - *: ");
        char operation = sc.next().charAt(0);
        int result;
        switch (operation) {
            case '+':
                result = Calculator.summarize(num1, num2);
                break;
            case '-':
                result = Calculator.subtract(num1, num2);
                break;
            case '*':
                result = Calculator.multiply(num1, num2);
                break;
            default:  System.out.println("Вы ввели некоректный оператор!");
            return;
        }
        ResultWriterService.printResult(num1, num2, result, operation);
    }
}
