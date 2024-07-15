package thema5.arrays.examples;

public class LargestElement {

	public static void main(String[] args) {

		int[] numbers = {11, 3, 12, 19, 23, 23, 23, 10, 11, 23};
		
		int largestElement = findLargestElement(numbers);
		System.out.println("The largest element is: " + largestElement + " at index: " + findLargestElementIndex(numbers));
		
		System.out.println("Die Position aller größten Elemente  im Array: ");
		for( int index : findIndicesOfLargestElements(numbers)) {
			System.out.println(index);
		}
	}
	
	/**
	 * Methode to find the largest element from a list of numbers.
	 * @param numbers any list of numbers
	 * @return the largest element
	 */
	public static int findLargestElement(int[] numbers) {

		int max = numbers[0];
		
		for(int i =1; i< numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		
		return max;
	}
	
	public static int findLargestElementIndex(int[] numbers) {
		int max = numbers[0];
		int maxIndex = 0;
		
		for(int i =1; i< numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
				maxIndex = i;
			}
		}
		
		return maxIndex;	
	}
	
	
	public static int[] findIndicesOfLargestElements(int[] numbers) {
		
		int max = numbers[0];
		int count = 0;
		
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
				count = 1;
			} else if (numbers[i] == max) {
				count++;
			}
		}
		
		
		int[] indices = new int[count];
		
		int index = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == max) {
				indices[index++] = i;
			}
		}
		
		return indices;
	}
}
