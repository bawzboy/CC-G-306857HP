package Arrays;

import java.util.Arrays;

public class LoeschenVonArrayElementen {
    public static void main(String[] args) {
        
        Integer [] arr = {3, 4, 1, 9, -5, 4};
        int w = 3; // Zu löschendes Element: 9     Index: 3
        System.out.println("Originales Array: " + Arrays.toString(arr));
        System.out.println("Das zu löschende Element ist: " + arr[w]);

        Integer [] newArr = deleteArrayElement(arr, w);

        System.out.println("Neues Array: " + Arrays.toString(newArr));
    }

    public static Integer [] deleteArrayElement(Integer []a, int w) {
        Integer [] a2 = new Integer[a.length - 1];
        System.arraycopy(a, 0, a2, 0, w); // copy array up to deleted element
        System.arraycopy(a, (w + 1), a2, w, (a.length - w - 1)); // copy rest of array after deleted element
        return a2;
    }
}
