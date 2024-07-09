package Verschachtelungen;

import utils.IO;

public class PyramideAusSternen {
    public static void main(String[] args) {
        int height = IO.promptAndReadInt("How tall shall the pyramid be? ");
        
        for (int i = 0; i < height; i++) {              // loop for every line (height = no of lines)
            for (int j = height -1 - i; j > 0 ; j--) {  // loop for leading spaces
                System.out.print(" ");
            }
            for (int st = 0; st < (2 * i + 1); st++) {    // loop for stars
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
