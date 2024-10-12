package Kita_Java_Rekrutacyjne;

import java.util.Arrays;

public class Zadanie_21 {

    //Napisz program, który usunie wybraną liczbę z tablicy oraz wszystkie MNIEJSZE liczby znajdujące
    // się po prawej stronie od szukanej liczby. Liczby w tablicy nie mogą się powtarzać.

    public static void solution(int[] table, int number) {
        int newTableLength = 0;
        int position = 0;

        for (int j : table) {
            if (j == number) {
                newTableLength++;
            }
            if (j == number) {
                position = j;
                break;
            }
        }
        for (int i = newTableLength; i < table.length; i++) {
            if (table[i] > number) {
                newTableLength++;
            }
        }
        System.out.println(newTableLength);
        int[] newTable = new int[newTableLength];

        for (int k = 0; k < table.length; k++) {
            if (table[k] != number) {
                newTable[k] = table[k];
            }
            if (table[k] == number) {
                position = k;
                break;
            }
        }

        for (int i = position; i < table.length; i++) {
            if (table[i] > number) {
                newTable[position] = table[i];
                position++;
            }
        }
        System.out.println(Arrays.toString(newTable));
    }
}
