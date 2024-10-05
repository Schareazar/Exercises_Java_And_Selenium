package Kita_Java_Rekrutacyjne;

public class Zadanie_18 {

//Napisz program, który sprawdzi, czy tablica liczb całkowitych zawiera dwa wskazane elementy

    public static void solution(int[] table, int a, int b) {
        boolean containsA = false;
        boolean containsB = false;

        for (int i : table) {
            if (i == a) {
                containsA = true;
            }
            if (i == b) {
                containsB = true;
            }
        }

        if (containsA && containsB) {
            System.out.println("Table contains both numbers");
        } else {
            System.out.println("Table doesn't contain one or both numbers");
        }
    }
}
