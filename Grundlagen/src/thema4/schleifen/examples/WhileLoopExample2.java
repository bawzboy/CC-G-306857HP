package thema4.schleifen.examples;

import utils.IO;

public class WhileLoopExample2 {

	public static void main(String[] args) {
		

		int limit = IO.promptAndReadInt("Enter a number: ");
		int i = 0;
		
		while (i < limit) {
			System.out.println("i is: " + i);
			i++;
		}
	}
}
