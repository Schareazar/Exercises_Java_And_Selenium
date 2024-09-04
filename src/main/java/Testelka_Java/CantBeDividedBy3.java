package Testelka_Java;

public class CantBeDividedBy3 {

//    Napisz program wyświetlający na ekranie liczby od 1 do 20, które nie są podzielne przez 3.
//    Oczywiście nie chodzi o to, żeby je wpisać z palca, tylko użyć jakiejś pętli.

    static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    public static void verify() {
     for(int number : numbers)
    {
        if (number%3 != 0) {
            System.out.println(number);
        }
    }
}
}
