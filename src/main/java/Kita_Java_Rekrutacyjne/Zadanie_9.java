package Kita_Java_Rekrutacyjne;

import java.util.Arrays;

public class Zadanie_9 {

    //Napisz program, który usunie dany element z tablicy liczb całkowitych
    //tablica zawiera tylko unikalne elementy

    public static void solution(int[] table, int deleteNumber) {

        int[] shortenedTable = new int[table.length - 1];
        int j = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] != deleteNumber) {
                shortenedTable[j] = table[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(shortenedTable));

    }

}
