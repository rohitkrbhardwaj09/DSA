package Week2.Arrays.LargestElement;
public class Recursive_Approach {


    // If the array size is 1, return the only element.
    // Otherwise:
    // Find the largest in the rest of the array (recursive call).
    // Compare it with the first element.
    // Return the larger of the two.

    public static int findLargestElement(int[] arr, int max) {

        if (max  == 1) {
            return arr[0];
        }

        return Math.max(arr[max], findLargestElement(arr, max-1));
    }

    public static void main(String[] args) {
        // initializing and declaring the array
        int[] arr = { 20, 45, 23, 11, 67 };
        int max = arr.length -1;

        int largestElement = findLargestElement(arr, max);
        System.out.println("The largest element in the given array is: " + largestElement);
    }
}
