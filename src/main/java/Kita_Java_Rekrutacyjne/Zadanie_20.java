package Kita_Java_Rekrutacyjne;

public class Zadanie_20 {

    //Napisz program, który policzy która liczba występuje najczęściej w tablicy

    public static void solution(int[] table) {
        int max = 0;
        int occurrences = 0;
        int maxOccurrences = 0;
        int numberOccuringMost = -1;

        for (int number : table) {
            if (number > max) {
                max = number;
            }
        }

        for (int i = 0; i <= max; i++) {
            for (int j : table) {
                if (j == i) {
                    occurrences++;
                }
            }
            if (occurrences > maxOccurrences) {
                maxOccurrences = occurrences;
                numberOccuringMost = i;
            }
            occurrences = 0;
        }
        System.out.println("Number occurring most: " + numberOccuringMost + "\nappeared times: " + maxOccurrences);
    }
}
