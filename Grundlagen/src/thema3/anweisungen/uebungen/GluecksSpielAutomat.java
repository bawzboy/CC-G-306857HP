package thema3.anweisungen.uebungen;

import java.util.Scanner;

import utils.IO;

public class GluecksSpielAutomat {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		// Random random = new Random();
		
		System.out.println("Willkommen beim Glueckspiel!");
		
//		System.out.println("Geben Sie Ihre Vermutung (einge ganze Zahl zwischen 1 und 100 ein oder 's' zum Beenden.");
//		String input = scanner.next();
		
		String input = IO.promptAndReadString("Geben Sie 'a' zu starten oder 's' zum Beenden.");
		
		
		if(input.equals("s")) {
			System.out.println("Das Spiel wurde beendet. Vielen Dank fürs Spielen!");			
		} else if (input.equals("a")) {
			
			// int generatedNumber = random.nextInt(100) + 1;
			int generatedNumber = IO.getRandomInt(100) + 1;
			System.out.println("Die generierte Zahl lautet: " + generatedNumber);
			if(generatedNumber >= 40 && generatedNumber <= 60) {
				System.out.println("Herzlichen Glückwunsch! Sie haben gewonnen!");
			} else {
				System.out.println("Leider verloren.");
			}
		}
		
		scanner.close();
	}

}
