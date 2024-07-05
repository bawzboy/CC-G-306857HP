package Schleifen;

import utils.IO;

public class Differentialgleichung {
    public static void main(String[] args) {
        double t = 0;
        double dt = 1.0;
        double k = 0.1;
        double xn = 0.01;
        double dx = 0;
        while (t < 100) {
            t = t + dt;
            dx = k * xn * (1 - xn) * dt;
            xn = xn + dx;
            System.out.println(Math.round(t) + "\t" + xn);
        }
    }
}
