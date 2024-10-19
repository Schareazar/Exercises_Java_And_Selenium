package Kita_Java_Rekrutacyjne;

import java.util.*;

public class Zadanie_29 {

    //Napisz program, który policzy liczbę wystąpień każdego znaku w podanym zdaniu.

    public static void solution(String sentence) {

        String[] sentenceAsChar = sentence.toLowerCase().split("");

        int charCounter = 0;

        Map<String, Integer> charOccurrences = new HashMap<>();

        for (String s : sentenceAsChar) {
            charOccurrences.put(s, charCounter++);
            for (String z : sentenceAsChar) {
                if (s.equals(z)) {
                    charOccurrences.put(z, charCounter++);
                }
            }
            charCounter = 0;
        }

        System.out.println(charOccurrences);
    }
}
