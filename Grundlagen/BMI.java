package Grundlagen;
//import java.util.Scanner;

import utils.IO;

public class BMI {

    public static void main(String[] args) {

        String name = IO.promptAndReadString("What's your name? ");
        IO.writeln("Hello " + name);
        
        Double weight = IO.promptAndReadDouble("What's your weight in kilogram? ");

        Double height = IO.promptAndReadDouble("What's your height in meter? ");
        
        Double bmi = weight / (height * height);
        IO.writeln("Your BMI is: " + IO.round(bmi, 2));
        
    }
    
}
