package Kita_Java_Rekrutacyjne;

import java.util.ArrayList;
import java.util.List;

public class Zadanie_27 {

    //Co zostanie wyświetlone na konsoli po wykonaniu tego programu?

    public static void programme()
    {
        int number = 128;
        List<Integer> numbers = new ArrayList<>();

        while (number >= 32) {
            number -= number / 2;
            numbers.add(number);
        }
        System.out.println(numbers);
    }

    //64 32 16 ? -> tak
}
