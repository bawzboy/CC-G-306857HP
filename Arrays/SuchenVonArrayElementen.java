package Arrays;

import java.util.Arrays;

public class SuchenVonArrayElementen {
    public static void main(String[] args) {

        Integer [] zahlen = new Integer [10];
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = (int)(Math.random() * 10);
		}
        System.out.println(Arrays.toString(zahlen));

        int biggestNumber = zahlen[0];
        int biggestNumberIndex = 0;
		for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] > biggestNumber) {
                biggestNumber = zahlen[i];
                biggestNumberIndex = i;
            }
		}
        System.out.println("Biggest Number in the array is: " + biggestNumber);
        System.out.println("Index of biggest Number is: " + biggestNumberIndex);

        StringBuilder bigNumbers = new StringBuilder();     // stringbuilder to create a "list" of big numbers
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] == biggestNumber) {
                bigNumbers.append(i).append(" ");
            } 
        }
        if (bigNumbers.length() > 2){   // print only if there is more than 1 biggest number
            bigNumbers.delete(0, 1);    // delete first entry because its already printed with biggest number
            System.out.println("The element/s at index/indices " + bigNumbers + " are as big as the biggest number.");
        }        
    }
}
