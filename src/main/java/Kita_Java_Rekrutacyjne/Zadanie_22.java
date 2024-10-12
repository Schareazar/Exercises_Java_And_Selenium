package Kita_Java_Rekrutacyjne;

import java.util.Arrays;

public class Zadanie_22 {

    //Tablica zawiera tylko 0 i 1 w losowej kolejności. Napisz program, który
    // przesunie wszystkie 0 na lewą stronę i wszystkie 1 na prawą stronę

    public static void solution(int[] table) {
        int[] sortedTable = new int[table.length];
        int zeroOccurringTimes = 0;

        for (int i : table) {
            if (i == 0) zeroOccurringTimes++;
        }

        for (int i = zeroOccurringTimes; i < sortedTable.length; i++) {
            sortedTable[i] = 1;
        }
        System.out.println(Arrays.toString(sortedTable));
    }
}
