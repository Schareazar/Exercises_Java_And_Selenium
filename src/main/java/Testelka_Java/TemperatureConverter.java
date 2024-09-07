package Testelka_Java;

import java.util.Scanner;

public class TemperatureConverter {

//    Napisz program w Javie, który przelicza temperatury między skalami Celsjusza, Fahrenheita i Kelvina.
//    Użytkownik powinien podać wartość temperatury i żądaną konwersję (np. z Celsjusza na Fahrenheita).


    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide temperature to convert");
        int temperature = scanner.nextInt();
        System.out.print("""
                Select conversion type number:
                1 - Celsius to Fahrenheit
                2 - Celsius to Kelvin
                3 - Fahrenheit to Kelvin
                4 - Kelvin to Celsius
                5 - Kelvin to Fahrenheit
                6 - Fahrenheit to Celsius
                """);
        int selectedConversion = scanner.nextInt();

        switch (selectedConversion) {
            case 1 -> System.out.println("Converted temperature is: " + (temperature * 9 / 5 + 32));
            case 2 -> System.out.println("Converted temperature is: " + (temperature + 273));
            case 3 -> System.out.println("Converted temperature is: " + ((temperature + 460) * 5 / 9));
            case 4 -> System.out.println("Converted temperature is: " + (temperature - 273));
            case 5 -> System.out.println("Converted temperature is: " + (temperature * 9 / 5 - 460));
            case 6 -> System.out.println("Converted temperature is: " + ((temperature - 32) * 5 / 9));
        }
    }

}
