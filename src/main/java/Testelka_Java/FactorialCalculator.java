package Testelka_Java;

import java.util.Scanner;

public class FactorialCalculator {

//    Stwórz program w Javie, który oblicza silnię podanej nieujemnej liczby całkowitej wprowadzonej przez użytkownika.
//    Silnia liczby n to iloczyn wszystkich dodatnich liczb mniejszych lub równych n.

    private static int calculateFactorial(int numberToCalculate) {
        int i = 1;
        int factorial = 1;

        while (i <= numberToCalculate) {
            factorial = factorial * i;
            i++;
        }
        return factorial;
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide number for factorial calculation");
        int numberToCalculate = Integer.parseInt(scanner.nextLine());

        System.out.println("Factorial is: " + calculateFactorial(numberToCalculate));
    }
}
