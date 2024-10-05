package Kita_Java_Rekrutacyjne;

public class Zadanie_19 {

    //Napisz program, który znajdzie takie same litery (char) znajdujące się obok siebie w tablicy

    public static void solution(char[] table) {
        for (int i = 0; i < table.length - 1; i++) {
            if (table[i] == table[i + 1]) {
                System.out.println(table[i] + " is next to another " + table[i + 1] + " in the table");
            }
        }
    }
}

