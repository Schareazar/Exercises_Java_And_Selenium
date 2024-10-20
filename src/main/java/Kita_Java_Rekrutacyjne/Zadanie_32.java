package Kita_Java_Rekrutacyjne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie_32 {

    //Napisz program, który usunie powtarzające się znaki z wyrazu

    public static void solution(String word) {

        String[] wordAsTable = word.split("");

        //Set<String> wordAsSet = new LinkedHashSet<>(Arrays.asList(wordAsTable));

        List<String> wordWithoutDuplicates = new ArrayList<>();

        for (String character : wordAsTable) {
            if (!wordWithoutDuplicates.contains(character)) {
                wordWithoutDuplicates.add(character);
            }
        }
        wordWithoutDuplicates.forEach(System.out::print);
    }
}
