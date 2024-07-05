package thema3.anweisungen;

public class TestAnweisungen {

	public static void main(String[] args) {
		
		int alter = 1;
		
		if(alter >= 18) {
			System.out.println("You are an adult");
		} else if (alter <18 && alter >= 2) {
			System.out.println("You are a child");
		} else {
			System.out.println("You are a baby");
		}
		
	}
}
