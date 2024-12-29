package Week2.Arrays.LargestElement;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Using_Stream_Approach {
    
    // Create a Stream:
    // Convert the array to a stream using IntStream.of(array) for primitive integer arrays (e.g., int[]).
    // If the array is an object type (e.g., Integer[]), you can use Arrays.stream(array).

    // Apply the max() Operation:
    // Streams provide a terminal operation called max().
    // It processes all elements of the stream and returns the largest element.

    // Handle the Result:
    // The max() method returns an OptionalInt (a container object that may or may not contain a value).
    // You need to check if the value is present using isPresent() before accessing it using getAsInt().



    public static int findLargestElement(int[] array){

        // Create a Stream from the array
        IntStream stream = IntStream.of(array);

        // stream.max() iterates through the elements of the stream and keeps track of the largest value.
        OptionalInt largestElement = stream.max();

        // The max() method returns an OptionalInt:
        // If the array is empty, OptionalInt will be empty (no value).
        // Otherwise, it contains the largest element.

        // Using isPresent(), we check if the OptionalInt contains a value.
        if (largestElement.isPresent()) {
            // If it does, getAsInt() retrieves the value(the largest element).
            return largestElement.getAsInt();
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        // initializing and declaring the array
        int[] arr = { 20, 45, 23, 11, 67 };

        int largestElement = findLargestElement(arr);
        if (largestElement != 0) {
            System.out.println("The largest element in the given array is: " + largestElement);    
        }else{
            System.out.println("The array is empty");
        }
        
    }
    
}
