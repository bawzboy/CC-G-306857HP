package Rekursion;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};
        int sum = sumOfArrayIndex(numbers, 0);
        System.out.println("Sum of all elements in this array is: " + sum);
    }

    // public static int sumOfArray(int [] numbers, int arrayLength) {
    //     if (arrayLength == 0) { // base - if array is empty there is no sum / no more numbers to add
    //         return 0;
    //     }
    //     return numbers[arrayLength - 1] + sumOfArray(numbers, arrayLength - 1); // return number then check if there is more numbers to add
    // }

    public static int sumOfArrayIndex(int [] numbers, int index) {
        if (index >= numbers.length) {
            return 0;
        }
        return numbers[index] + sumOfArrayIndex(numbers, index + 1);
    }
}
