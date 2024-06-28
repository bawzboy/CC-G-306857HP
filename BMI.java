import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = scanner.next();
        
        System.out.println("What's your weight in kilogram? ");
        Double weight = scanner.nextDouble();  

        System.out.println("What's your height in meter? ");
        Double height = scanner.nextDouble();
        
        Double bmi = weight / (height * height);
        System.out.println("Hello " + name);
        System.out.println("Your BMI is: " + Math.round(bmi));
        
        scanner.close();
    }
    
}
