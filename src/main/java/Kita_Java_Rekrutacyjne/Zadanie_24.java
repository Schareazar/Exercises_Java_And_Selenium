package Kita_Java_Rekrutacyjne;

public class Zadanie_24 {

    //Napisz program, który wyświetli znak na podanym indeksie

    public static void solution(String text, int index) {
        if (index <= text.length()) {
            //System.out.println(text.toCharArray()[index]);
            System.out.println(text.charAt(index));
        } else {
            System.out.println("Index is out of bounds for provided text");
        }
    }

}
