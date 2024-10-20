package Kita_Java_Rekrutacyjne;

import java.util.*;

public class Zadanie_31 {

    //Napisz program, który usunie powtarzające się wyrazy z podanego zdania.

    public static void solution(String sentence) {
        //Set
//        String[] sentenceAsTable = sentence.split(" ");
//
//        Set<String> sentenceAsHashSet = new LinkedHashSet<>(Arrays.asList(sentenceAsTable));
//
//        for (String word : sentenceAsHashSet) {
//            System.out.print(word + " ");
//        }
//
        //No set
        String[] sentenceAsTable = sentence.split(" ");
        StringBuilder sentenceWithoutDuplicates = new StringBuilder();

        List<String> uniqueWords = new ArrayList<>();

        for (String word : sentenceAsTable) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
                sentenceWithoutDuplicates.append(word + " ");
            }
        }

        System.out.println(sentenceWithoutDuplicates);
    }
}


