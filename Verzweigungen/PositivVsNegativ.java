package Verzweigungen;

import utils.IO;

public class PositivVsNegativ {
    public static void main(String[] args) {
        int yourNumber = (int) (IO.promptAndReadInt("Wie lautet die Zahl? "));
        if (yourNumber < 0 && yourNumber % 2 == 0) {
            System.out.println("Zahl ist negativ und gerade");
        }
        else if (yourNumber < 0 && yourNumber % 2 != 0) {
            System.out.println("Zahl ist negativ und ungerade");
        }
        else if (yourNumber > 0 && yourNumber % 2 == 0) {
            System.out.println("Zahl ist positiv und gerade");
        }
        else if (yourNumber > 0 && yourNumber % 2 != 0) {
            System.out.println("Zahl ist positiv und ungerade");
        }
        else {
            System.out.println("Zahl ist = 0");
        }
    }
}
