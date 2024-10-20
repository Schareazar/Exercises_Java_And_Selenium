package Kita_Java_Rekrutacyjne;

public class Zadanie_33_Bonus1 {

    //Napisz program, który wyświetla liczby od 1 do 100;
    //Dla liczb podzielnych przez 3 wyświetli Fizz
    //Dla liczb podzielnych przez 5 wyświetli Buzz
    //Dla liczb podzielnych przez 3 i 5 wyświetli FizzBuzz

    public static void solution() {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i + " ");
            }
        }
    }

}
