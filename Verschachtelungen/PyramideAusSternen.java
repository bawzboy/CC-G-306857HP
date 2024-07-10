package Verschachtelungen;

import utils.IO;

public class PyramideAusSternen {
    public static void main(String[] args) {
        int height = IO.promptAndReadInt("How tall shall the pyramid be? ");
        // l = line, sp = space, st = star        
        for (int l = 0; l < height; l++) {              // loop for every line (height = no of lines)
            for (int sp = height -1 - l; sp > 0 ; sp--) {  // loop for leading spaces
                System.out.print(" ");
            }
            for (int st = 0; st < (2 * l + 1); st++) {    // loop for stars
                System.out.print("*");
            }
            System.out.println();            
        }
    }
}
