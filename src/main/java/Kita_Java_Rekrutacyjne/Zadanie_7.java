package Kita_Java_Rekrutacyjne;

import java.util.Arrays;
import java.util.List;

public class Zadanie_7 {

    //Napisz program, który posortuje tablicę liczb całkowitych

    public static void solution(int[] table) {
//        int[] sorted = Arrays.stream(table).sorted().toArray();
//        System.out.println(Arrays.toString(sorted));

        int min;
        for (int i = 0; i < table.length; i++) {
            min = table[i];
            for (int j = i + 1; j < table.length; j++) {
                if (table[j] < min) {
                    min = table[j];
                    table[j] = table[i];
                    table[i] = min;
                }
            }
        }
        System.out.println(Arrays.toString(table));

    }

}
