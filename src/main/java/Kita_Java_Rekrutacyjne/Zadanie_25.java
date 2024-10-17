package Kita_Java_Rekrutacyjne;

public class Zadanie_25 {

    //Napisz program, który sprawdzi czy tekst zaczyna się od innego tekstu

    public static void solution(String text, String subString)
            //easy solution
//    {
//        if(text.substring(0,subString.length()).equals(subString))
//            //if(text.startsWith(subString))
//            System.out.println("Text contains substring");
//        else
//            System.out.println("Text doesn't contain substring");
//    }
            //tables solution
    {
        String[] textTable = text.split("");
        String[] subStringTable = subString.split("");

        boolean startsWith = false;

        for (int i = 0; i < subStringTable.length; i++) {
            startsWith = subStringTable[i].equals(textTable[i]);
        }

        System.out.println("Text starts with substring: " + startsWith);
    }
}
