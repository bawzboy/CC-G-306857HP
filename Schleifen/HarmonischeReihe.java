package Schleifen;

import utils.IO;

public class HarmonischeReihe {
    public static void main(String[] args) {
        double n = 1;
        while (n < 100) {
            double ergebnis = 1 / n;
            n++;
            IO.writeln(ergebnis);

        }
    }
}
