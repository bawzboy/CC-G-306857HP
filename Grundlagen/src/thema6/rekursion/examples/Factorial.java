package thema6.rekursion.examples;

public class Factorial {

	public static void main(String[] args) {

		int number = 3; // 3 * 2 * 1 = 6
		System.out.println(number + "! is " + factorial(number));;
	}
	
	
	public static int factorial(int number) {
		
		if(number == 1) {
			return 1;
		}
		
		return number * factorial(number - 1);
	}

}
