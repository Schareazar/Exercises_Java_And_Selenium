package Testelka_Java;

import java.util.ArrayList;
import java.util.List;

public class SplitNegativeAndPositiveNumbers {

//    Masz daną tablicę. Stwórz dwie tablice, z których jedna będzie zawierała tylko liczby dodatnie, a druga ujemne.
//    Program ma następnie pokazać w konsoli zawartość zmiennych tablic,
//    Program ma działać dla dowolnej tablicy z dowolną ilością liczb (int).

    public static void solution(int[] table) {

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int a : table) {
            if (a >= 0) positive.add(a);
            else negative.add(a);
        }

        System.out.println("Positive list: " + positive.toString());
        System.out.println("Negative list: " + negative.toString());
    }
}
