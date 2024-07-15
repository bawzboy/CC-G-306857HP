package thema7.oop.grundlagen;

public class MatheUtils {

	public static final double PI = 3.14159; 			// Klassenattribut kann also mit MatheUtils.PI zugegriffen werden
	
	public static double kreisFlaeche(double radius) { 	// Klassenmethode also aufrufbar mit MatheUtils.kreisFlaeche(...)
		return PI * radius * radius;
	}
}
