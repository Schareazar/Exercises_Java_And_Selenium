package Kita_Java_Rekrutacyjne;

public class Zadanie_26 {

    //Napisz program, który sprawdzi czy podany tekst kończy się jak drugi podany tekst

    public static void solution(String text, String subString) {
        //łatwe
        //boolean endsWith = text.endsWith(subString);

        String[] textTable = text.split("");
        String[] subStringTable = subString.split("");

        boolean endsWith = true;
        int textTableIndex = textTable.length - subStringTable.length;
        //Moje
//        for (int i = 1; i <= subStringTable.length; i++) {
//            if (!textTable[textTable.length-i].equals(subStringTable[subStringTable.length-i])) {
//                endsWith = false;
//                break;
//            }
//        }
        //Kity
        for (int i = textTableIndex, k = 0; i < textTable.length; i++) {
            if (!textTable[i].equals(subStringTable[k++])) {
                endsWith = false;
                break;
            }
        }

        System.out.println("Text ends with substring: " + endsWith);
    }
}
