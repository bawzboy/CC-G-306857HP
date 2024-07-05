package Verzweigungen;

import utils.IO;

public class PositiveZahl {
    public static void main(String[] args) {
        int yourNumber = (int) (IO.promptAndReadInt("Wie lautet die Zahl? "));
        if (yourNumber % 2 == 0) {
            System.out.println("Die Zahl ist gerade");
        }
        else {
            System.out.println("Die Zahl ist ungerade");
        }
    }
}
