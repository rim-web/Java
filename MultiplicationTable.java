//scanner is a class in java which is used to read input from different sources.
//we can use this object with different methods.
//Here we use System.in & nextInt
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
//line create a new instance of scanner class that is associated with input stream System.in
// This means that any input entered from the keyboard will be read by the 'Scanner' object 'table'.
        Scanner table = new Scanner(System.in);
        System.out.println("Enter the number for multiplication ");
//nextInt is a method of scanner object used to read an integer from user
//here number has int data type
        int number = table.nextInt();
        for (int i=1; i<=10; i++) {
//The first %d represents the value of the variable number,
// the second %d represents the value of the loop variable i,
// and the third %d represents the product of number and i.
// The \n at the end of the string is a newline character
            System.out.printf("%d x %d = %d\n", number, i, number * i);
        }
    }
}
