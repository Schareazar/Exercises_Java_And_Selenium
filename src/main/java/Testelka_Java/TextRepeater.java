package Testelka_Java;

import java.util.Scanner;

public class TextRepeater {

//    Napisz program, który pobierze od użytkownika dwie informacje. Pierwszą z nich będzie jakieś słowo, a drugą ilość powtórzeń.
//    Następnie program ma wypisać na konsoli pobrane słowo tyle razy, ile wynosi podana przez użytkownika liczba powtórzeń.
//    Niech kolejne powtórzenia słowa zostaną wyświetlone w osobnej linii. Zakładamy, że wprowadzona liczba nie będzie ujemna i będzie całkowita.

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This will repeat provided word n times \nProvide a word to be repeated");
        String wordToRepeat = scanner.nextLine();
        System.out.println("Provide number of times for word to be repeated");
        int timesToRepeat = Integer.parseInt(scanner.nextLine());

        repeatWord(wordToRepeat, timesToRepeat);
    }

    private static void repeatWord(String wordToRepeat, int timesToRepeat) {

        int i = 0;

        do {
            if (timesToRepeat > 0) {
                System.out.println(wordToRepeat);
                i++;
            }
            else break;
        }
        while (i < timesToRepeat);
    }
}
