package Kita_Java_Rekrutacyjne;

public class Zadanie_13 {

    //Napisz program, który znajdzie te same elementy w dwóch tablicach zawierających znaki (char)

    public static void solution(char[] table1, char[] table2) {
        for (char i : table1) {
            for (char j : table2) {
                if (i == j) {
                    System.out.println(i);
                }
            }
        }
    }
}
