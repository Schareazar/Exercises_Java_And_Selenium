package Kita_Java_Rekrutacyjne;

public class Zadanie_34_Bonus2 {

    //Napisz program, który policzy silnię wskazanej liczby

    public static void solution(int n) {
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            answer *= i;
        }
        System.out.println(answer);
    }
}
