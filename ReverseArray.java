import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5};
        System.out.println("Original array "+ Arrays.toString(arr));
        //Reverse the array
        for (int i = 0; i< arr.length/2; i++){
            //use temporary variable to keep track of the swap value
            int temp = arr[i];
            //arr.length is the total number of elements in the array.
            //i is the current index we're iterating over.
            //Subtracting i from arr.length gives us the index of the element at the opposite end
            // of the array, if we imagine the array as if it were folded in half at the center.
            //Subtracting 1 more from this result gives us the index of the corresponding element at
            // the opposite end, since array indices are 0-based in Java.
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println("Reversed array: " +Arrays.toString(arr));
    }
}
