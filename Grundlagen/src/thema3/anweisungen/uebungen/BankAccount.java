package thema3.anweisungen.uebungen;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {

		double guthaben = 346.14;
		
		System.out.println("Ihr Guthaben beläuft sich auf " + guthaben + " Euro");
		System.out.println("Wie viel Geld moechten Sie abheben?");

		Scanner scanner = new Scanner(System.in);
		double abhebungsbetrag = scanner.nextDouble();
		
		if(abhebungsbetrag <= guthaben) {
			
			System.out.println("Es werden " + abhebungsbetrag + " Euro ausgezahlt.");
			
			guthaben -= abhebungsbetrag;
			System.out.println("Ihr Konto beträgt: " + guthaben + " Euro.");
			
		} else {
			System.out.println("Keine Auszahlung möglich! Der angegebene Betrag übersteigt Ihr Guthaben.");
		}
		
		
		scanner.close();
	}

}
