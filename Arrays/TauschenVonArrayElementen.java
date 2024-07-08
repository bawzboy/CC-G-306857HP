package Arrays;

import java.util.Arrays;

import utils.IO;

public class TauschenVonArrayElementen {

    
    public static void main(String[] args) {
        
        int [] zahlen = {4, 2, 10, 3, -5, 0, 17};

        System.out.println("Original Array: " + Arrays.toString(zahlen));
        int i = IO.promptAndReadInt("Parameter 1: ");
        int j = IO.promptAndReadInt("Parameter 2: ");

        swap(zahlen, i, j);

        System.out.println("Swapped Array: " + Arrays.toString(zahlen));
        
    }
    public static void swap(int [] a, int i, int j) {
        
        if (i >= 0 && i < a.length && j >= 0 && j < a.length) {
            int placeholder = a[i];
            a[i] = a[j];
            a[j] = placeholder;
            }
    
    }
}
