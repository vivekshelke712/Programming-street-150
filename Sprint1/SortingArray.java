package Sprint1;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        // Sort an Array in an Ascending Order using Bubble Sort
        int arr[] = { 12, 13, 24, 45, 99 };

        for (int i = 0; i < arr.length - 1; i++) { // Outer loop for passes
            for (int j = 0; j < arr.length - 1 - i; j++) { // Inner loop for comparison
                if (arr[j] > arr[j + 1]) { // Swap if next element is smaller
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
