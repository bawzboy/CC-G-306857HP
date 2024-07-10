package Rekursion;

import utils.IO;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int n = IO.promptAndReadInt("What position? ");
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0; 
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
