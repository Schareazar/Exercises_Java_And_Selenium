package Kita_Java_Rekrutacyjne;

public class Zadanie_17 {

    //Napisz program, który sprawdzi czy suma co trzecich elementów tablicy jest równa 10;

    public static void solution(int[] table) {
        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            if ((i+1) % 3 == 0) {
                sum += table[i];
            }
        }
        System.out.println(sum);
        if (sum == 10) {
            System.out.println("Sum of every third elements equals 10");
        } else {
            System.out.println("Sum of every third elements does not equal 10");
        }
    }

}
