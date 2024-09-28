package Kita_Java_Rekrutacyjne;

public class Zadanie_15 {

    //Napisz program, który znajdzie wszystkie pary liczb, których suma jest równa innej liczbie

    public static void solution(int[] table, int sum) {
        for (int i = 0; i < table.length; i++) {
            {
                for (int j = i + 1; j < table.length; j++) {
                    if (table[i] + table[j] == sum) {
                        System.out.println(table[i] + " and " + table[j] + " equals " + sum);
                    }
                }
            }
        }
    }
}
