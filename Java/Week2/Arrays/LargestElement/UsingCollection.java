package Week2.Arrays.LargestElement;

import java.util.Arrays;
import java.util.Collections;

public class UsingCollection {

    // If the array is not primitive (e.g., Integer[]), you can use Collections.max().

    // Algorithm:

    // Convert the array to a list using Arrays.asList.
    // Use Collections.max to find the largest element.
    
    public static Integer findLargestElement(Integer[] array){

        Integer largestElement = Collections.max(Arrays.asList(array));

        return largestElement;
    }

    public static void main(String[] args) {
        // initializing and declaring the array
        Integer[] arr = { 20, 45, 23, 11, 67 };

        Integer largestElement = findLargestElement(arr);
        System.out.println("The largest element in the given array is: " + largestElement);
    }
}
