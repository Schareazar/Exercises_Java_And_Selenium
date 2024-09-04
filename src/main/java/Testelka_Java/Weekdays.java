package Testelka_Java;

import java.util.Scanner;

public class Weekdays {

//    Napisz program, który podaną liczbę zamieni na tekst i go wyświetli zgodnie z poniższym wzorem:
//1 – Dzisiaj jest poniedziałek
//2 – Dzisiaj jest wtorek
//...
//6 – Dzisiaj jest weekend
//7 – Dzisiaj jest weekend
//    Upewnij się też, że podana liczba jest z przedziału <1; 7>.

    public static void today()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer dnia tygodnia");
        int dayNumber = Integer.parseInt(scanner.nextLine());

            switch(dayNumber) {
                case 1:
                    System.out.println("Dzisiaj jest poniedziałek");
                    break;
                case 2:
                    System.out.println("Dzisiaj jest wtorek");
                    break;
                case 3:
                    System.out.println("Dzisiaj jest środa");
                    break;
                case 4:
                    System.out.println("Dzisiaj jest czwartek");
                    break;
                case 5:
                    System.out.println("Dzisiaj jest piątek");
                    break;
                case 6,7:
                    System.out.println("Dzisiaj jest weekend");
                    break;
                default:
                    System.out.println("Tydzień ma 7 dni, spróbuj liczby z zakresu 1-7");
            }
        }
    }

