package thema5.arrays.examples;

public class WarmUp {

	public static void main(String[] args) {

		/*
		 * Integer[] array_numbers = new Integer[5]; array_numbers[0] = 1;
		 * array_numbers[1] = 12; array_numbers[2] = 33; array_numbers[3] = 504;
		 * array_numbers[4] = 50;
		 * 
		 * for(int i=0; i < array_numbers.length; i++) {
		 * System.out.println(array_numbers[i]); }
		 * 
		 * String[] names = new String[3]; names[0] = "John"; names[1] = "Paul";
		 * names[2] = "Peter";
		 */

		int[] random_values;
		random_values = new int[50];

		for (int i = 0; i < random_values.length; i++) {
			random_values[i] = (int) (Math.random() * 10);
		}

		// Ausgabe 1
		/*
		 * for (int j=0; j<random_values.length; j++) {
		 * System.out.println(random_values[j]); }
		 */

		/*
		 * // Ausgabe 2 for (int value : random_values) { System.out.println(value); }
		 */

		String[] names = { "Peter", "Eva", "Kim" };
		for (String value : names) {
			System.out.println(value);
		}
	}

}
