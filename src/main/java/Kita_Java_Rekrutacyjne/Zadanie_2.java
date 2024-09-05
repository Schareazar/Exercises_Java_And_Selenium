package Kita_Java_Rekrutacyjne;

public class Zadanie_2 {
    //Mając dwie tablice zawierające liczby całkowite napisz program, który sprawdzi czy pierwszy i ostatni element
    //pierwszej tablicy jest taki sam jak pierwszy i ostatni element drugiej tablicy

    public static void solution(int[] table1, int[] table2) {
        if (table1[0] == table2[0] && table1[table1.length - 1] == table2[table2.length - 1]) {
            System.out.println("Pierwsze i ostatnie elementy tablic są takie same");
        } else {
            System.out.println("Pierwsze lub ostatnie elementy tablic są różne");
        }
    }

}
