package Kita_Java_Rekrutacyjne;

public class Zadanie_23 {

    //Napisz program, który znajdzie liczby większe niż średnia liczb w tablicy

    public static void solution(int[] table) {

        int sum = 0;
        int average = 0;
        for (int number : table) {
            sum += number;
        }
        average = sum / table.length;
        System.out.println(sum + " is sum, while average is " + average);

        for (int number : table) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
    }

}
