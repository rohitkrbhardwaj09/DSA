package Week2.Arrays.LargestElement;

public class DivideAndConquer_Approach {

    // Divide the array into two halves.
    // Recursively find the largest element in each half.
    // Compare the largest elements from both halves.

    public static int findLargestElement(int[] array, int min, int max) {

        if (min == max) {
            return array[min];
        }

        int mid = (min + max) / 2;
        int leftMax = findLargestElement(array, min, mid);
        int rightMax = findLargestElement(array, mid + 1, max);
        return Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {
        // initializing and declaring the array
        int[] arr = { 20, 45, 23, 11, 67 };
        int max = arr.length - 1;

        int largestElement = findLargestElement(arr, 0, max);
        System.out.println("The largest element in the given array is: " + largestElement);
    }
}
