package Kita_Java_Rekrutacyjne;

public class Zadanie_16 {

    //Napisz program, któy policzy wszystkie liczby parzyste i nieparzyste w tablicy zawierającej liczby całkowite.

    public static void solution(int[] table) {
        int even = 0;
        int odd = 0;
        for (int i : table) {
            if (i % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + "\nOdd: " + odd);
    }

}
