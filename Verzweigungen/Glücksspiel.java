package Verzweigungen;

import java.util.Scanner;

import utils.IO;

public class Glücksspiel {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {


            System.out.println("Willkommen beim Glücksspiel!");
            System.out.println("Geben Sie Ihren Tipp (Eine ganze Zahl zwischen 1 und 100) ab!");
            System.out.println("Alternativ drücken sie 's' um das Spiel zu beenden." );

            int randNo = IO.getRandomInt(100) + 1;
            System.out.print("Wie lautet Ihr Tip? ");
            String tip = scanner.next();

            if(tip.equals("s")) {
                System.out.println("Das Spiel wird beendet");
                break;
            }
            else {
                try {
                    int tipNumber = Integer.parseInt(tip);

                    if (tipNumber == randNo) {
                    System.out.println("Die generierte Zahl lautet: " + randNo);
                    System.out.println("Herzlichen Glückwunsch, Sie haben gewonnen!");
                    break;
                    }
                    else {
                    System.out.println("Das ist leider falsch, versuchen Sie es erneut!");
                    }
                }
                catch (NumberFormatException e) {
                    System.out.println("Ungültige Eingabe!");
                }
            }
        
    }
    scanner.close();
}
}
