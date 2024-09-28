package Kita_Java_Rekrutacyjne;

public class Zadanie_14 {

    //Napisz program, który znajdzie drugi największy element w tablicy zawierającej liczby całkowite

    public static void solution(int[] table) {
        for (int i = 0; i < table.length; i++) {
            {
                for (int j = i + 1; j < table.length; j++) {
                    if (table[j] > table[i]) {
                        table[j] = table[i] + table[j];
                        table[i] = table[j] - table[i];
                        table[j] = table[j] - table[i];
                    }
                }
            }
        }
        System.out.println(table[1]);
    }
}
