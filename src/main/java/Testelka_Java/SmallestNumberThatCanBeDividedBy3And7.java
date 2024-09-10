package Testelka_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SmallestNumberThatCanBeDividedBy3And7 {

//    Napisz program, który znajdzie najmniejszą liczbę podzielną zarówno przez 3 i 7 w zbiorze liczb od 1 do 100
//    (zbiór domknięty, a więc włącznie z 1 i 100).
//    Następnie liczba ta zostanie wyświetlona na konsoli wraz z komunikatem,
//    że jest to najmniejsza liczba podzielna przez 3 i 7.

    public static void get() {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        System.out.print("Najmniejsza liczba podzielna przez 3 i 7 to: ");
        numbers.stream()
                .filter(n -> n % 3 == 0)
                .filter(n -> n % 7 == 0)
                .min(Comparator.comparing(Integer::intValue))
                .ifPresentOrElse(System.out::println, () -> System.out.println("Nie ma takiej liczby"));
    }


}
