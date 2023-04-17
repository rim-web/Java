import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers= {1, 2, 3, 4, 2, 5, 2, 6, 3};
        Arrays.sort(numbers);
        int[] uniqueNumbers = new int[numbers.length];

        int count = 0;

        for (int i=0; i<numbers.length-1; i++){
            if (numbers[i] != numbers[i+1]){
                uniqueNumbers[count++] = numbers[i];
            }
        }
        uniqueNumbers[count++] = numbers[numbers.length-1];

        for (int i = 0; i<count; i++){
            numbers[i] = uniqueNumbers[i];
        }
        System.out.println("Array with duplicates removed: " + Arrays.toString(Arrays.copyOfRange(numbers, 0, count)));
    }
}
