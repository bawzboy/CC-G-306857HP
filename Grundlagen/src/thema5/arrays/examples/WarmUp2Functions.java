package thema5.arrays.examples;

public class WarmUp2Functions {

	public static void main(String[] args) {

		// int[] numbers = {11, 3, 12, 19, 23, 100};
		
		sayHallo(formatFullname("Dr", "Mark", "Burger"));
	}
	
	public static void sayHallo(String name) {
		System.out.println("Hello " + name);
	}
	
	public static String formatFullname(String title, String firstname, String lastname) {
		
		String fullname = title + " " + firstname + " " + lastname;
		return fullname;
	}

}
