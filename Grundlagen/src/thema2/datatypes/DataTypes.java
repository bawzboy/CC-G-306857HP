package thema2.datatypes;

public class DataTypes {

	public static void main(String[] args) {
		
		byte b1 = 10, b2 = 20;
		short p = 200;
		int n = 500;
		long q = 100;
		float x = 2.5f;
		double y = 5.25;
	
		// In Java werden Operationen mit kleineren Datentypen wie byte, short oder char standardmäßig in int umgewandelt.
		System.out.println(b1 + b2); // Wert: 30, Typ: int
		
		
		System.out.println(p + b1); // Wert: 210, Typ: int
		
		System.out.println(b1 + b2); // Wert: 210, Typ: int
		
		System.out.println(q+p * (b1 + b2)); // Wert: 6100, Typ: long
		
		
		// (e)
		System.out.println(x + q * n); // Wert: 50002.5, Typ: float
		
	}

}
