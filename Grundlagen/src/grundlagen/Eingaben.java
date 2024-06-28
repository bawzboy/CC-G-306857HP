package grundlagen;

import java.util.Scanner;

public class Eingaben {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scanner.next();
		
		
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();		
		
		
		// System.out.println("Your age is: " + age);
		
		
		System.out.println("Your name is " + name + " and your age is " + age);
		
		
		scanner.close(); 
	}

}
