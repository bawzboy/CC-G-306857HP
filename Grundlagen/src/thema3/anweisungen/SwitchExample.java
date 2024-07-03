package thema3.anweisungen;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Wählen Sie eine Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraktion");
        System.out.println("3. Multiplikation");
        System.out.println("4. Division");
        
        System.out.print("Ihre Auswahl: ");
		int choice = scanner.nextInt();
		
		System.out.println("Geben Sie die erste Zahl ein: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Geben Sie die zweite Zahl ein: ");
		int num2 = scanner.nextInt();

		if(choice == 1) {
			System.out.println("Ergebnis der Addition: " + (num1 + num2));
		} else if (choice == 2) {
			System.out.println("Ergebnis der Subtraktion: " + (num1 - num2));
		} else if (choice == 3) {
			System.out.println("Ergebnis der Multiplikation: " + (num1 * num2));
		} else if (choice == 4) {
			if (num2 != 0) {
				System.out.println("Ergebnis der Division: " + (num1 / num2));				
			} else {
				System.out.println("Fehler: Division durch null ist nicht erlaubt.");
			}
		} else {
			System.out.println("Ungültige Auswahl.");
		}
		
		scanner.close();
	}
}
