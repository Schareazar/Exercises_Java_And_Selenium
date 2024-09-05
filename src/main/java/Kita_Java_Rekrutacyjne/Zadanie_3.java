package Kita_Java_Rekrutacyjne;

public class Zadanie_3 {

    //Mając dwie tablice napisz program, który utworzy trzecią, dwuelementową zawierającą pierwszy element pierwszej tablicy
    //oraz ostatni element drugiej tablicy.

    public static int[] solution(int[] table1, int[] table2) {
        return new int[]{table1[0], table2[table2.length - 1]};
    }

}
