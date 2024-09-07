package Kita_Java_Rekrutacyjne;

import java.util.Arrays;

public class Zadanie_5 {

    //Napisz program, który zamieni miejscami pierwszy i ostatni element tablicy

    public static void solution(int[] table) {
        // moje
//        int first = table[0];
//        int last = table[table.length - 1];
//        int[] changedTable = table;
//        changedTable[0] = last;
//        changedTable[changedTable.length - 1] = first;
//        System.out.println(Arrays.toString(changedTable));
        // Kita
        table[0] = table[0] + table[table.length - 1];
        table[table.length - 1] = table[0] - table[table.length - 1];
        table[0] = table[0] - table[table.length - 1];
        System.out.println(Arrays.toString(table));
    }

}
