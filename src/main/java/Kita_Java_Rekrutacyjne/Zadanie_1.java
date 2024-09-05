package Kita_Java_Rekrutacyjne;

public class Zadanie_1 {

    //Napisz program, który sprawdzi czy pierwszy i ostatni element tablicy zawierającej liczby całkowite jest taki sam
    //Przykład tablica = [1,2,3,4,1] -> true

    public static void solution(int[] table) {
        if (table[0] == table[table.length - 1]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
