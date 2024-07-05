public class Schleifen {
    public static void main(String[] args) {
        // 4.1
        // 1)
        // int i = 0;
        // while(i < 10) {
        //     i++;
        //     IO.writeln("Wert = " + i);
        // }
        // Ausgabe 1 - 10. Programm addiert erst i + 1 und gibt dann aus

        // 2)
        // double d = Double.POSITIVE_INFINITY;
        // while (d == d + 1) {
        //     IO.writeln("läuft");
        // }        

        // 3)
        // double d = Double.NaN;
        // while (d != d) {
        //     IO.writeln("läuft");
        // }

        // 4)
        // int n, a = 5; // 1
        // // while (a<10) {n = 1; a++; } // 2
        // // do {n = 1; a++; } while(a<10); // 3
        // // for (int i = 0; i<10; i++) {n = 10; } // 4
        // int b = n; // 5
        // Ausgabe Nichts?

        // 5)
        // float dy = 1E-10f;
        // float yn = 1f;
        // int i = 0;
        // while (yn < 10.0f) {
        //     yn = yn + dy;
        //     i++;
        //     IO.writeln("Iteration: " + i + " yn = " + yn);
        // }

        // 4.3
        // double kapital = IO.promptAndReadDouble("Kapital in Euro: ");
        // double zinssatz = IO.promptAndReadDouble("Zinssatz in %: ") / 100;
        // int laufzeit = IO.promptAndReadInt("Laufzeit in Jahren: ");
        // int i = 1;
        
        // while (i <= laufzeit) {
        //     System.out.println("Das Kapital beträgt: " + 
        //     IO.round(kapital = kapital + kapital * zinssatz, 2) + 
        //     " Euro im " + i + "ten Jahr");
        //     i++; 
        // }

        // 4.4
        // double kapital = IO.promptAndReadDouble("Kapital in Euro: ");
        // double zinssatz = IO.promptAndReadDouble("Zinssatz in %: ") / 100;
        // double rente = IO.promptAndReadDouble("Monatliche Rente in Euro: ") * 12;
        // int jahr = 0;
        // if (rente > (kapital * zinssatz)) {
            
        //     while (kapital > 0 && kapital > rente) {
        //         kapital = kapital * (1 + zinssatz) - rente;
        //         jahr++;
        //     }
        //     System.out.println("Sie können " + jahr + " Jahre Rente beziehen");
        // }
        // else {
        //     IO.writeln("Rente zu gering!");
        // }

        // 4.5
        // double t = 0;
        // double dt = 1.0;
        // double k = 0.1;
        // double xn = 0.01;
        // double dx = 0;
        // while (t < 100) {
        //     t = t + dt;
        //     dx = k * xn * (1 - xn) * dt;
        //     xn = xn + dx;
        //     System.out.println(Math.round(t) + "\t" + xn);
        // }

        // 4.6
        // double n = 1;
        // while (n < 100) {
        //     double ergebnis = 1 / n;
        //     n++;
        //     IO.writeln(ergebnis);

        // }


        // 4.7
        // int n = IO.promptAndReadInt("Wie viele Durchgänge sollen ausgeführt werden? ");
        // double count = 0;
        // for (int i = 0; i < n; i++) {
        //     double x = Math.random();
        //     double y = Math.random();
        //     double dist = (x * x) + (y * y);
        //     if (dist <= 1.0) {
        //         count++;
        //     }
        // }
        // System.out.println("Der Näherungswert für Pi bei " + n + " Durchgängen beträgt: " + (4 * (count / n)));
        // System.out.println("Math.PI: " + Math.PI);

        // 4.8
        // int z = IO.promptAndReadInt("Die Wurzel welcher positiven Zahl wird gesucht? ");
        // int n = IO.promptAndReadInt("Wie viele Durchgänge sollen ausgeführt werden? ");
        // int i = 1;
        // double links = 0;
        // double rechts = z;
        // while (i <= n) {
        //     double m = (links + rechts) / 2.;
        //     if ((m * m) < z) {
        //         links = m;
        //     }
        //     else {
        //         rechts = m;
        //     }
        //     System.out.println(i);
        //     System.out.println(links);
        //     System.out.println(rechts);
        //     i ++;
        // }



    }
}
