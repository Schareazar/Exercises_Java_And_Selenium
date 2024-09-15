package Kita_Java_Rekrutacyjne;

import java.util.Arrays;

public class Zadanie_10 {

    //Napisz program, który usunie dany element z tablicy liczb całkowitych
    //tablica zawiera elementy, które się powtarzają!

    public static void solution(int[] table, int deleteNumber) {
        int deleteOccurrences = 0;
        int j = 0;

        for (int number : table)
            if (number == deleteNumber) {
                deleteOccurrences++;
            }

        int[] shortenedTable = new int[table.length - deleteOccurrences];

        for (int i = 0; i < table.length; i++) {
            if (table[i] != deleteNumber) {
                shortenedTable[j] = table[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(shortenedTable));

    }

}
