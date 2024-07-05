package Verzweigungen;

import utils.IO;

@SuppressWarnings("unused")
public class Switch {
    public static void main(String[] args) {
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
    }
}
