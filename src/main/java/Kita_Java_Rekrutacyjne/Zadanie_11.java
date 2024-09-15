package Kita_Java_Rekrutacyjne;

import java.util.Arrays;
import java.util.Optional;

public class Zadanie_11 {

    //Napisz program, który zwróci maksymalną i minimalną wartość w tablicy zawierającej liczby całkowite

    public static void solution(int[] table) {
//        int min = Arrays.stream(table).min().orElse(0);
//        int max = Arrays.stream(table).max().orElse(0);
//        System.out.println("Minumum is: " + min + "\nMaximum is: " + max);

        int min = table[0];
        int max = table[0];

        for (int number : table) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Minumum is: " + min + "\nMaximum is: " + max);
    }
}
