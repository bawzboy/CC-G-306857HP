import java.util.Scanner;

public class Verzweigungen {
    public static void main(String[] args) {
        
        // 3.1.1 1)
        // boolean b = false;
        // int b = 0;
        
        // if (b = false) {
        // if (b == 0) {
        //     System.out.println("1");
        // }
        // else {
        //     System.out.println("2");
        // }


        // 3.1.1 2)
        // a)   True
        // b)   False
        // c)   False
        // d)   True
        // e)   False
        // f)   False
        // g)   False
        // h)   True
        // i)   False
        // j)   False

        // 3.1.2 1) (if)
        // int yourNumber = (int) (IO.promptAndReadInt("Wie lautet die Zahl? "));
        // if (yourNumber >= 0 && yourNumber <= 3) {
        //     System.out.println("Bereich Null bis Drei");
        // }
        // else if (yourNumber >= 4 && yourNumber <= 7) {
        //     System.out.println("Bereich Vier bis Sieben");
        // }
        // else if (yourNumber >= 8 && yourNumber <= 9) {
        //     System.out.println("Bereich Acht bis Neun");
        // }
        // else {
        //     System.out.println("Bereich außerhalb 0 bis 9");
        // }

        // 3.1.2 1) switch()
        // int yourNumber = (int) (IO.promptAndReadInt("Wie lautet die Zahl? "));
        // switch (yourNumber){
        //     case 0, 1, 2, 3:
        //         System.out.println("Bereich Null bis Drei");
        //         // break;
        //     case 4, 5, 6, 7:
        //         System.out.println("Bereich Vier bis Sieben");
        //         // break;
        //     case 8, 9:
        //         System.out.println("Bereich Acht bis Neun");
        //         // break;
        //     default:
        //         System.out.println("Zahl außerhalb Bereich 0 - 9");
        //         // break;
        // }
        // 3.1.2 2)
        // ohne break-Anweisung werden alle cases ausgegeben

        // 3.2
        // int yourNumber = (int) (IO.promptAndReadInt("Wie lautet die Zahl? "));
        // if (yourNumber % 2 == 0) {
        //     System.out.println("Die Zahl ist gerade");
        // }
        // else {
        //     System.out.println("Die Zahl ist ungerade");
        // }

        // 3.3.1
        // int number1 = (int) (IO.promptAndReadInt("Wie lautet die erste Zahl? "));
        // int number2 = (int) (IO.promptAndReadInt("Wie lautet die zweite Zahl? "));
        // int number3 = (int) (IO.promptAndReadInt("Wie lautet die dritte Zahl? "));
        // if (number1 > number2 && number1 > number3) {
        //     System.out.println("Zahl 1 ist die größte");
        // }
        // else if (number2 > number1 && number2 > number3) {
        //     System.out.println("Zahl 2 ist die größte");
        // }
        // else {
        //     System.out.println("Zahl 3 ist ist die größte");
        // }

        // 3.3.1 alternativ
        // int number1 = (int) (IO.promptAndReadInt("Wie lautet die erste Zahl? "));
        // int number2 = (int) (IO.promptAndReadInt("Wie lautet die zweite Zahl? "));
        // int number3 = (int) (IO.promptAndReadInt("Wie lautet die dritte Zahl? "));
        // int biggestNumber = Math.max(number1, Math.max(number2, number3)) ;
        // if (biggestNumber == number1) {
        //     System.out.println("Die erste Zahl ist die größte: " + number1);
        // } else if (biggestNumber == number2) {
        //     System.out.println("Die zweite Zahl ist die größte: " + number2);
        // } else if (biggestNumber == number3) {
        //     System.out.println("Die dritte Zahl ist die größte: " + number3);
        // }

        // 3.3.2
        // int number1 = (int) (IO.promptAndReadInt("Wie lautet die erste Zahl? "));
        // int number2 = (int) (IO.promptAndReadInt("Wie lautet die zweite Zahl? "));
        // int number3 = (int) (IO.promptAndReadInt("Wie lautet die dritte Zahl? "));
        // int biggestNumber = Math.max(number1, Math.max(number2, number3)) ;
        // switch (biggestNumber){
        //     case 1: if (biggestNumber == number1){
        //         System.out.println("Die erste Zahl ist die größte");
        //         break;
        //     }

        // }





        // 3.4
        // float note = (float) (IO.promptAndReadFloat("Wie lautet die Note? "));
        // if (note >= 1.0 && note <= 1.4) {
        //     System.out.println("Sehr gut");
        // }
        // else if (note >= 1.5 && note <= 2.4) {
        //     System.out.println("Gut");
        // }
        // else if (note >= 2.5 && note <= 3.4) {
        //     System.out.println("Befriedigend");
        // }
        // else if (note >= 3.5 && note <= 4.0) {
        //     System.out.println("Ausreichend");
        // }
        // else if (note >= 4.1 && note <= 5.0) {
        //     System.out.println("Nicht bestanden");
        // }
        // else {
        //     System.out.println("Ungültig");
        // }

        // 3.5
        // int wochentag = (int) (IO.promptAndReadInt("Wie lautet die Zahl? "));
        // switch (wochentag) {
        //     case 1:
        //         System.out.println("Es ist Montag");
        //         break;
        //     case 2:
        //         System.out.println("Es ist Dienstag");
        //         break;
        //     case 3:
        //         System.out.println("Es ist Mittwoch");
        //         break;
        //     case 4:
        //         System.out.println("Es ist Donnerstag");
        //         break;
        //     case 5:
        //         System.out.println("Es ist Freitag");
        //         break;
        //     case 6:
        //         System.out.println("Es ist Samstag");
        //         break;
        //     case 7:
        //         System.out.println("Es ist Sonntag");
        //         break;                
        //     default:
        //         break;
        // }

        // 3.6
        // int yourNumber = (int) (IO.promptAndReadInt("Wie lautet die Zahl? "));
        // if (yourNumber < 0 && yourNumber % 2 == 0) {
        //     System.out.println("Zahl ist negativ und gerade");
        // }
        // else if (yourNumber < 0 && yourNumber % 2 != 0) {
        //     System.out.println("Zahl ist negativ und ungerade");
        // }
        // else if (yourNumber > 0 && yourNumber % 2 == 0) {
        //     System.out.println("Zahl ist positiv und gerade");
        // }
        // else if (yourNumber > 0 && yourNumber % 2 != 0) {
        //     System.out.println("Zahl ist positiv und ungerade");
        // }
        // else {
        //     System.out.println("Zahl ist = 0");
        // }

        // 3.7
        // double guthaben = 346.14;
        // System.out.println("Ihr Guthaben beträgt: " + guthaben + " Euro");
        // double auszahlung = (double) (IO.promptAndReadDouble("Wie viel möchten Sie abheben? "));
        // if (auszahlung > guthaben) {
        //     System.out.println("Keine Auszahlung möglich, Guthaben nicht ausreichend!");
        // }
        // else if (auszahlung < 0) {
        //     System.out.println("Negative Beträge können nicht ausgezalt werden!");
        // }
        // else {
        //     System.out.println("Es werden: " + auszahlung + " Euro ausgezahlt.");
        //     System.out.println("Ihr neuer Kontostand beträgt: " + (guthaben - auszahlung) + " Euro");
        // }

        // 3.8
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
