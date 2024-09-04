package Testelka_Java;

import java.util.Scanner;

public class IsNumberNegative {

//    Zadanie 1: Liczba ujemna
//    Napisz program, który sprawdzi czy podana liczba całkowita jest mniejsza od zera.
//    Jeżeli liczba jest mniejsza od zera, wyświetl na konsoli komunikat "Podana liczba jest mniejsza od zera".
//    Jeżeli liczba będzie większa lub równa zero, wyświetl komunikat "Podana liczba jest większa lub równa zero".

    public static void verify() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This will verify if provided number is negative. \nProvide number to be checked");
        int numberToBeChecked = Integer.parseInt(scanner.nextLine());
        if (numberToBeChecked < 0) {
            System.out.println(numberToBeChecked + " Podana liczba jest mniejsza od zera");
        } else {
            System.out.println(numberToBeChecked + " Podana liczba jest większa lub równa zero");
        }
    }

}
