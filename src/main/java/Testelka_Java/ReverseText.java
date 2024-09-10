package Testelka_Java;

import java.util.Arrays;

public class ReverseText {

    //Napisz program, który odwraca podany ciąg znaków.

    public static void solution(String text) {
        System.out.println(text.length());
        char[] textCharArray = text.toCharArray();
        char[] reverseTextCharArray = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reverseTextCharArray[i] = textCharArray[text.length() - 1 - i];
        }

        System.out.println(Arrays.toString(reverseTextCharArray));
    }

}
