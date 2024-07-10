package Rekursion;

import utils.IO;

public class Factorial {
    public static void main(String[] args) {
        int number = IO.promptAndReadInt("Number? ");
        System.out.println(number + "! is " + factorial(number));
    }

    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
