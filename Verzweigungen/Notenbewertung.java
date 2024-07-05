package Verzweigungen;

import utils.IO;

public class Notenbewertung {
    public static void main(String[] args) {
        float note = (float) (IO.promptAndReadFloat("Wie lautet die Note? "));
        if (note >= 1.0 && note <= 1.4) {
            System.out.println("Sehr gut");
        }
        else if (note >= 1.5 && note <= 2.4) {
            System.out.println("Gut");
        }
        else if (note >= 2.5 && note <= 3.4) {
            System.out.println("Befriedigend");
        }
        else if (note >= 3.5 && note <= 4.0) {
            System.out.println("Ausreichend");
        }
        else if (note >= 4.1 && note <= 5.0) {
            System.out.println("Nicht bestanden");
        }
        else {
            System.out.println("Ungültig");
        }
    }
}
