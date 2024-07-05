package Verzweigungen;

import utils.IO;

public class Wochentag {
    public static void main(String[] args) {
        int wochentag = (int) (IO.promptAndReadInt("Wie lautet die Zahl? "));
        switch (wochentag) {
            case 1:
                System.out.println("Es ist Montag");
                break;
            case 2:
                System.out.println("Es ist Dienstag");
                break;
            case 3:
                System.out.println("Es ist Mittwoch");
                break;
            case 4:
                System.out.println("Es ist Donnerstag");
                break;
            case 5:
                System.out.println("Es ist Freitag");
                break;
            case 6:
                System.out.println("Es ist Samstag");
                break;
            case 7:
                System.out.println("Es ist Sonntag");
                break;                
            default:
                break;
        }
    }
}
