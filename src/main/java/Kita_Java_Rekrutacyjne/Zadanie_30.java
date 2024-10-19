package Kita_Java_Rekrutacyjne;

public class Zadanie_30 {

    //Napisz program, który odwróci stringa

    public static void solution(String text) {

        //System.out.println(new StringBuilder(text).reverse());

        String[] textAsChar = text.split("");
        for (int i = textAsChar.length - 1; i >= 0; i--) {
            System.out.print(textAsChar[i]);
        }

    }

}
