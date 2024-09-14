package Kita_Java_Rekrutacyjne;

import java.util.Arrays;

public class Zadanie_8 {

    //Napisz program, który policzy sumę wszystkich elementów tablicy zawierającej liczby całkowite

    public static void solution(int[] table) {
        //System.out.println(Arrays.stream(table).sum());
        int sum = 0;
//        for (int i = 0; i < table.length; i++) {
//            sum += table[i];
//        }
        for (int i : table) {
            sum += i;
        }
        System.out.println(sum);
    }

}
