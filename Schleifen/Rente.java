package Schleifen;

import utils.IO;

public class Rente {
    public static void main(String[] args) {
        double kapital = IO.promptAndReadDouble("Kapital in Euro: ");
        double zinssatz = IO.promptAndReadDouble("Zinssatz in %: ") / 100;
        double rente = IO.promptAndReadDouble("Monatliche Rente in Euro: ") * 12;
        int jahr = 0;
        if (rente > (kapital * zinssatz)) {
            
            while (kapital > 0 && kapital > rente) {
                kapital = kapital * (1 + zinssatz) - rente;
                jahr++;
            }
            System.out.println("Sie können " + jahr + " Jahre Rente beziehen");
        }
        else {
            IO.writeln("Rente zu gering!");
        }
    }
}
