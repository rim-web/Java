import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 7, 8, 5};
        int k = 3;
        //print original array
        System.out.println("Original array; " + Arrays.toString(arr));
        rotate(arr, k);
        //print rotated array
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
    public static void rotate(int[] arr, int k){
        //This line calculates the actual number of positions to rotate by taking k % arr.length.
        // This ensures that k is not larger than the length of the array.
        k = k% arr.length;//in case k is larger than array(k has a value of index in array)
        //This line calls the reverse method to reverse the entire array. The method is passed
        // the arr array, and the indices 0 and arr.length-1 to indicate the range of elements to reverse.
        reverse(arr, 0, arr.length-1);
        //This line calls the reverse method to reverse the first k elements of the array. The method is
        // passed the arr array, and the indices 0 and k-1 to indicate the range of elements to reverse.
        reverse(arr, 0 , k-1);
        //This line calls the reverse method to reverse the remaining elements of the array. The method
        // is passed the arr array, and the indices k and arr.length-1 to indicate the range of elements to reverse.
        reverse(arr, k, arr.length-1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
