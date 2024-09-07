package Testelka_Java;

import java.util.Scanner;

public class PasswordVerification {

//    Napisz program, który poprosi o podanie hasła. Gdy wprowadzone hasło to “kluski”, to program zakończy działanie
//    i poinformuje nas o zakończeniu programu komunikatem: “Koniec programu.”
//    Jeżeli hasło będzie inne, program będzie czekał aż zostanie podane poprawne hasło.

    public static void verify() {
        String password = "kluski";
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj hasło \nPodpowiedź: Co ślązacy lubią najbardziej?");

        do {
            input = scanner.nextLine();
        }
        while (!input.equals(password));
    }
}
