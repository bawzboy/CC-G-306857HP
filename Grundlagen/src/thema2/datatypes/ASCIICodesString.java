package thema2.datatypes;

/**
 * Aufgabe 2.5.2 String und Zeichenkettenverarbeitung
 */
public class ASCIICodesString {

	public static void main(String[] args) {
		
		
		String text = "Hello, World";
		
			
		System.out.println("ASCII-Werte:");
		System.out.println("H: \t" + (int) text.charAt(0));
		System.out.println("e: \t" + (int) text.charAt(1));
		System.out.println("l: \t" + (int) text.charAt(2));
		System.out.println("l: \t" + (int) text.charAt(3));
		System.out.println("o: \t" + (int) text.charAt(4));
		System.out.println(",: \t" + (int) text.charAt(5));
		System.out.println(" : \t" + (int) text.charAt(6));
		System.out.println("W: \t" + (int) text.charAt(7));
		System.out.println("o: \t" + (int) text.charAt(8));
		System.out.println("r: \t" + (int) text.charAt(9));
		System.out.println("l: \t" + (int) text.charAt(10));
		System.out.println("d: \t" + (int) text.charAt(11));
	}

}
