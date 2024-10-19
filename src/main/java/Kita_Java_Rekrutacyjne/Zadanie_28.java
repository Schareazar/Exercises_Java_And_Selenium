package Kita_Java_Rekrutacyjne;

import java.util.Arrays;

public class Zadanie_28 {

    //Napisz program, który zastąpi każdy wyraz w zdaniu innym wyrazem

    public static void solution(String text, String toReplace, String replacement) {
        //System.out.println(text.replace(toReplace, replacement));

        String[] textTable = text.split(" ");

        for (int i = 0; i < textTable.length; i++) {
            if (textTable[i].equals(toReplace)) {
                textTable[i] = replacement;
            }
        }
        String outputText = "";
        for (String word : textTable) {
            outputText = outputText.concat(word + " ");
        }
        System.out.println(outputText);
    }

}
