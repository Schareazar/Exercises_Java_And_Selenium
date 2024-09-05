package Kita_Java_Rekrutacyjne;

public class Zadanie_4 {

    //Napisz program, który pomnoży odpowiadające sobie elementy dwóch tablic.
    //Obie tablice muszą być tej samej długości

    public static int[] solution(int[] table1, int[] table2) {
        int[] table3 = new int[table1.length];
        if (table1.length != table2.length) {
            System.out.println("Tablice muszą być tej samej długości!");
        } else {
            for (int i = 0; i < table1.length; i++) {
                table3[i] = table1[i]*table2[i];
            }
        }
        return table3;
    }

}
