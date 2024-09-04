package Testelka_Java;

import java.util.Scanner;

public class Square {

//    Napisz program, który na podstawie boku kwadratu obliczy jego pole i obwód.
//    Pole i obwód powinny zostać wyświetlone na konsoli.
//    Program powinien sprawdzić, czy wprowadzona długość boku jest dodatnia.
//    Jeżeli jest, to powinien wykonać obliczenia i pokazać wynik.
//    Jeżeli długość boku jest równa 0, powinien zostać wyświetlony komunikat “Długość boku nie może być równa 0”.
//    Jeżeli długość boku jest ujemna, powinien zostać wyświetlony komunikat “Długość boku nie może być ujemna”.

    public static void calculateAreaAndPerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This will calculate area and perimeter of a square based on side length." +
                " \nProvide side of a square length");
        double side = Double.parseDouble(scanner.nextLine());

        if (side < 0) {
            System.out.println("Długość boku nie może być ujemna");
        } else if (side == 0) {
            System.out.println("Długość boku nie może być równa 0");
        } else {
            double area = side * side;
            double perimeter = side * 4;
            System.out.println("Square area based on provided side length is " + area +
                    "\nSquare perimeter based on provided side length is " + perimeter);
        }
    }
}
