package Verzweigungen;

import utils.IO;

public class Geldautomat {
    public static void main(String[] args) {
        double guthaben = 346.14;
        System.out.println("Ihr Guthaben beträgt: " + guthaben + " Euro");
        double auszahlung = (double) (IO.promptAndReadDouble("Wie viel möchten Sie abheben? "));
        if (auszahlung > guthaben) {
            System.out.println("Keine Auszahlung möglich, Guthaben nicht ausreichend!");
        }
        else if (auszahlung < 0) {
            System.out.println("Negative Beträge können nicht ausgezalt werden!");
        }
        else {
            System.out.println("Es werden: " + auszahlung + " Euro ausgezahlt.");
            System.out.println("Ihr neuer Kontostand beträgt: " + (guthaben - auszahlung) + " Euro");
        }
    }
}
