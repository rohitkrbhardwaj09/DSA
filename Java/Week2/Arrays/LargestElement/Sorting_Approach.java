package Week2.Arrays.LargestElement;

import java.util.Arrays;

public class Sorting_Approach {

    // Sort the array in ascending order.
    // Return the last element as the largest.

    private static int findLargestElement(int[] arr) {
        
        Arrays.sort(arr);   
        int largestElement = arr[arr.length - 1];

        return largestElement;
    }

    public static void main(String[] args) {
        // initializing and declaring the array
        int[] arr = { 20, 45, 23, 11, 67 };

        int largestElement = findLargestElement(arr);
        System.out.println("The largest element in the given array is: " + largestElement);
    }

    
}
