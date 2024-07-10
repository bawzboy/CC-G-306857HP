package Verschachtelungen;

import utils.IO;

public class Dreieckzahlen {
    public static void main(String[] args) {
        int n = IO.promptAndReadInt("Triangle number? ");
        int sum = 0;
        
        if (n == 0) {
            System.out.println("There is no triangle number for 0");
        } else {
            for (int i = 1; i <= n; i++) {
                sum += i;
                for (int sp = (n - i) * 2; sp > 0; sp--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    if (j < i) {
                        System.out.print(j + " + ");
                    } else {
                        System.out.print(j + " = " + sum);
                    }
                }
                System.out.println();
            }
        }
    }
}
