package thema1.grundlagen;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name = scanner.next();
		// System.out.println("Name: " + name);

		System.out.println("What's your weight?");
		double weight = scanner.nextDouble();
		// System.out.println("Weight: " + weight);
		
		
		System.out.println("What's your height?");
		double height = scanner.nextDouble();
		// System.out.println("Height: " + height);
		
		double bmi = weight / (height * height);
		System.out.print("Hello " + name);
		System.out.print("Your BMI is: " + bmi);
		
		System.out.print("Your BMI is: " + Math.round(bmi));
		
		scanner.close();
	}

}
