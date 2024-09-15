package Kita_Java_Rekrutacyjne;

public class Zadanie_12 {

    //Napisz program, który znajdzie powtarzające się wartości w tablicy liczb całkowitych

    public static void solution(int[] table) {

        for (int i = 0; i < table.length; i++) {
            for (int j = i+1; j < table.length; j++) {
                if (table[i] == table[j])
                {
                    System.out.println(table[j]);
                }
            }
        }
    }
}
