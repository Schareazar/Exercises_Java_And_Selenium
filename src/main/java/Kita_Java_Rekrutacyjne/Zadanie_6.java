package Kita_Java_Rekrutacyjne;

import java.util.Arrays;

public class Zadanie_6 {

    //Napisz program, który przesunie wszystkie elementy tablicy o jedno miejsce w lewo.
    //Tablica składa się z 3 liczb całkowitych
    //Opcjonalne utrudnienie - brak założenia o długości tablicy

    public static void solution(int[] table) {
        int[] result = new int[table.length];

        result[table.length - 1] = table[0];

        for (int i = 1; i < table.length; i++) {
            result[i-1] = table[i];
        }
        System.out.println(Arrays.toString(result));
    }

}
