package Testelka_Java;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

//    Stwórz program w Javie, który losuje liczbę między 1 a 100 i prosi użytkownika o zgadnięcie tej liczby.
//    Program powinien dawać informacje zwrotne (za wysoko lub za nisko) do momentu, gdy użytkownik zgadnie poprawną liczbę.
//    Do wygenerowania losowej liczby użyj klasy Random (metoda nextInt()).

    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private static int solution = random.nextInt(100);

    public static void start() {
        int guess;
        System.out.println("Guess a number between 1 and 100! \nGuess: ");
        do {
            guess = scanner.nextInt();

            if (guess == solution) System.out.println("Congratulations, you guessed the correct number!");
            else if (guess < solution) {
                System.out.println("Number needs to be higher!");
            } else if (guess > solution) {
                System.out.println("Number needs to be lower");
            }
        } while (guess != solution);
    }
}
