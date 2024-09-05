package Testelka_Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

//    Stwórz program w Javie, który pobierze od użytkownika dwie liczby i operator (+, -, *, /).
//    Program powinien wykonać określoną operację i wyświetlić wynik.

    private static Scanner scanner = new Scanner(System.in);

    private static double sum(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        return a / b;
    }

    public static void start() {
        double firstNumber;
        double secondNumber;

        System.out.println("Program wykona wybraną operację na dwóch liczbach\nPodaj pierwszą liczbę:");
        try {
            firstNumber = scanner.nextDouble();
        } catch (InputMismatchException exception) {
            throw new IllegalArgumentException("Podano nieprawidłową liczbę");
        }

        System.out.println("Podaj drugą liczbę:");
        try {
            secondNumber = scanner.nextDouble();
        } catch (InputMismatchException exception) {
            throw new IllegalArgumentException("Podano nieprawidłową liczbę");
        }

        System.out.println("Podaj rodzaj operacji do wykonania ('+', '-', '*' , '/')");
        String operationType = scanner.next();

        switch (operationType) {
            case "+" -> System.out.println(sum(firstNumber, secondNumber));
            case "-" -> System.out.println(subtract(firstNumber, secondNumber));
            case "*" -> System.out.println(multiply(firstNumber, secondNumber));
            case "/" -> {
                if (secondNumber != 0) System.out.println(divide(firstNumber, secondNumber));
                else System.out.println("Nie można dzielić przez 0");
            }
            default -> System.out.println("Podano nieprawidłowy rodzaj operacji");
        }
    }

}
