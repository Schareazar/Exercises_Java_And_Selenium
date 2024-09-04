package Testelka_Java;

import java.util.ArrayList;
import java.util.List;

public class BiggestNumber {

//    Napisz program, który z trzech wprowadzonych liczb wybierze największą i wyświetli ją w konsoli.
//    Zakładamy, że wszystkie trzy liczby są różne od siebie.

    public static void get(int a, int b, int c)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);

        numbers.stream()
                .max(Integer::compareTo)
                .ifPresent(System.out::println);
    }
}

