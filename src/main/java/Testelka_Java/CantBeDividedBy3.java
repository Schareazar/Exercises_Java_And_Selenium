package Testelka_Java;

public class CantBeDividedBy3 {

//    Napisz program wyświetlający na ekranie liczby od 1 do 20, które nie są podzielne przez 3.
//    Oczywiście nie chodzi o to, żeby je wpisać z palca, tylko użyć jakiejś pętli.

    public static void verify() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
    }
}
