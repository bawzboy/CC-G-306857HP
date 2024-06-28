//import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
		
        //Scanner scanner = new Scanner(System.in);

        String name = IO.promptAndReadString("What's your name? ");
        //String name = scanner.next();
        IO.writeln("Hello " + name);
        
        Double weight = IO.promptAndReadDouble("What's your weight in kilogram? ");
        //Double weight = scanner.nextDouble();  

        Double height = IO.promptAndReadDouble("What's your height in meter? ");
        //Double height = scanner.nextDouble();
        
        Double bmi = weight / (height * height);
        IO.writeln("Your BMI is: " + IO.round(bmi, 2));
        
        //scanner.close();
    }
    
}
