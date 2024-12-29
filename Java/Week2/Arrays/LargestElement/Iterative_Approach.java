package Week2.Arrays.LargestElement;

public class Iterative_Approach {

        // 1.) Initialize a variable LargestElement to store the largest value, setting it to the
        // first element of the array.
        // 2.) Traverse the array starting from the second element.
        // 3.) For each element, compare it with LargestElement . If the current element is
        // greater, update LargestElement .
        // 4>) By the end of the traversal, LargestElement will contain the largest element.

    public static int findLargestElement(int arr[]){
    
            int largestElement = arr[0];
    
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > largestElement) {
                    largestElement = arr[i];
                }
            }

            return largestElement;
        }
    
        public static void main(String[] args) {
            // initializing and declaring the array
            int[] arr = { 20, 45, 23, 11, 67 };
    
            int largestElement = findLargestElement(arr);
            System.out.println("The largest element in the given array is: "+ largestElement);
    }
}