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

    private static double substract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        return a / b;
    }

    public static void calculate() {
        System.out.println("Program wykona wybraną operację na dwóch liczbach\nPodaj pierwszą liczbę:");
        double a = 0;
        double b = 0;
        try {
            a = scanner.nextDouble();
        } catch (InputMismatchException exception) {
            throw new IllegalArgumentException("Podano nieprawidłową liczbę");
        }
        System.out.println("Podaj drugą liczbę:");
        try {
            b = scanner.nextDouble();
        } catch (InputMismatchException exception) {
            throw new IllegalArgumentException("Podano nieprawidłową liczbę");
        }
        System.out.println("Podaj rodzaj operacji do wykonania ('+', '-', '*' , '/')");
        String operationType = scanner.next();

        switch (operationType) {
            case "+" -> System.out.println(sum(a, b));
            case "-" -> System.out.println(substract(a, b));
            case "*" -> System.out.println(multiply(a, b));
            case "/" -> {
                if(b!=0) System.out.println(divide(a, b));
                else System.out.println("Nie można dzielić przez 0");
            }
            default -> System.out.println("Podano nieprawidłowy rodzaj operacji");
        }
    }

}
