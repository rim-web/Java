import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = input.nextInt();
        int [] numbers = new int[size];

        System.out.println("Enter "+ size + " numbers: ");
        int i = 0;
        while (i<size){
            numbers[i] = input.nextInt();
            i++;
        }
        int largest = numbers[0];
        int smallest = numbers[0];
        i=1;
        while (i<size){
            if (numbers[i]>largest){
                largest = numbers[i];
            }
            if (numbers[i]<smallest){
                smallest = numbers[i];
            }
            i++;
        }
        System.out.println("The largest number is: " +largest);
        System.out.println("The smallest number is: " +smallest);
    }
}
