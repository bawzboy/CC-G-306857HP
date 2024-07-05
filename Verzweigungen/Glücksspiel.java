package Verzweigungen;

import java.util.Scanner;

import utils.IO;

public class Glücksspiel {
    public static void main(String[] args) {
        // Versuch 1
        // while (true) {
        //     System.out.println("Willkommen beim Glücksspiel!");
        //     System.out.println("Geben Sie Ihren Tipp (Eine ganze Zahl zwischen 1 und 100) ab!");
        //     // System.out.println("Alternativ drücken sie 's' um das Spiel zu beenden." );
        //     int tip = (int) (IO.promptAndReadInt("Wie lautet Ihr Tipp? "));
        //     int randNo = IO.getRandomInt(100) + 1;
        //     System.out.println("Die generierte Zahl lautet: " + randNo);
        //     if (tip == randNo) {
        //         System.out.println("Herzlichen Glückwunsch, Sie haben gewonnen!");
        //         break;
        //     }
        //     else {
        //         System.out.println("Das ist leider falsch, versuchen Sie es erneut!");
        //     }
            
        // }

        // Versuch 2
        while (true) {

            Scanner scanner = new Scanner(System.in);

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
            else if (Integer.parseInt(tip) == randNo) {
                System.out.println("Die generierte Zahl lautet: " + randNo);
                System.out.println("Herzlichen Glückwunsch, Sie haben gewonnen!");
                break;
            }
            else {
                System.out.println("Das ist leider falsch, versuchen Sie es erneut!");
            }
            // try {
            //     int userInput = Integer.valueOf(tip);
            //     System.out.println("Die generierte Zahl lautet: " + randNo);
            //     if (userInput == randNo) {
            //         System.out.println("Herzlichen Glückwunsch, Sie haben gewonnen!");
            //         break;
            //     }
            //     else {
            //         System.out.println("Das ist leider falsch, versuchen Sie es erneut!");
            //     }
            // }
            // catch (NumberFormatException e) {
            //     if (tip.charAt(0) == 's') {
            //         System.out.println("Das Spiel wird beendet");
            //         break;
            //     } 
            // }
            scanner.close();
        
        }
    }
}
