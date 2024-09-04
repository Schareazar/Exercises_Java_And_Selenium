package Testelka_Java;


public class NumberAsText {

//    Napisz program, który podaną jednocyfrową nieujemną liczbę całkowitą zapisze słownie.
//    Przykład: jeżeli program otrzyma liczbę 2, powinien na konsoli wyświetlić “dwa”.
//    Program powinien także upewnić się, że liczba jest jednocyfrowa i nieujemna.
//    Zakładamy, że liczba zawsze będzie całkowita.

    public static void get(int number) {
        String[] numbersAsText = {"jeden", "dwa", "trzy", "cztery", "pięć", "sześć", "siedem", "osiem", "dziewięć"};

        if (number > 0 && number < 10) {
            System.out.println(numbersAsText[number - 1]);
        }
        else System.out.println("Number is not a one digit positive");
    }
}
