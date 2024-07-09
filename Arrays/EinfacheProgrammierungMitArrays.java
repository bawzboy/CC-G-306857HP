package Arrays;

import java.util.Arrays;

public class EinfacheProgrammierungMitArrays {
    public static void main(String[] args) {
        // 1.
        Integer [] zahlen = new Integer [5];
        
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = (int)(Math.random() * 10);
		}
        
        int ergebnis = 0;
        for (int value = 0; value < zahlen.length; value ++) {
            System.out.println(zahlen[value]);
            ergebnis = ergebnis + zahlen[value]; 
        }

        System.out.println(Arrays.toString(zahlen));
        System.out.println(ergebnis);
        
        // 2.
        // Integer [] arrayOne = new Integer [20];
        // Integer [] arrayTwo = new Integer [20];

        // for (int i = 0; i < arrayOne.length; i ++) {
        //     int randNo = (int) (Math.random() * 50) * 2;
        //     arrayOne[i] = randNo;
        // }

        // System.out.println(Arrays.toString(arrayOne));

        // for (int i = 0; i < arrayTwo.length; i ++) {
        //     arrayTwo[i] = (int) (Math.random() * 100);
        // }

        // Arrays.sort(arrayTwo);

        // System.out.println(Arrays.toString(arrayTwo));
       
        
    }
}
