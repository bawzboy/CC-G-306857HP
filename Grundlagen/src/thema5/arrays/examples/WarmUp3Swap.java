package thema5.arrays.examples;

public class WarmUp3Swap {

	public static void main(String[] args) {

		int x = 100;
		int y = 200;
		
		swap2(x, y);
		
		System.out.println(x); // 
		System.out.println(y); // 
		
		
	}
	
	public static void swap2(int a, int b) { // Call by Value
		int temp = b;
		b = a;
		a = temp;
		
		System.out.println("a: " + a + ", b: " + b);
	}
	
	public static void swap(int [] a, int i, int j) { // Call by Reference
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
