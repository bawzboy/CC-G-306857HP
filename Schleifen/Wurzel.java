package Schleifen;

import utils.IO;

public class Wurzel {
    public static void main(String[] args) {
        int z = IO.promptAndReadInt("Die Wurzel welcher positiven Zahl wird gesucht? ");
        int n = IO.promptAndReadInt("Wie viele Durchgänge sollen ausgeführt werden? ");
        int i = 1;
        double links = 0;
        double rechts = z;
        while (i <= n) {
            double m = (links + rechts) / 2.;
            if ((m * m) < z) {
                links = m;
            }
            else {
                rechts = m;
            }
            System.out.println(i);
            System.out.println(links);
            System.out.println(rechts);
            i ++;
        }
    }
}
