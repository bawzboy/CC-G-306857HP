package Schleifen;

import utils.IO;

public class Zinsen {
    public static void main(String[] args) {
        double kapital = IO.promptAndReadDouble("Kapital in Euro: ");
        double zinssatz = IO.promptAndReadDouble("Zinssatz in %: ") / 100;
        int laufzeit = IO.promptAndReadInt("Laufzeit in Jahren: ");
        int i = 1;
        
        while (i <= laufzeit) {
            System.out.println("Das Kapital beträgt: " + 
            IO.round(kapital = kapital + kapital * zinssatz, 2) + 
            " Euro im " + i + "ten Jahr");
            i++; 
        }
    }
}
