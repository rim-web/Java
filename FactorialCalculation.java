//Java program to print the factorial of a given number
import java.util.Scanner;
public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number you want for factorial");
//Integer.parseInt(num.nextLine()) is a Java statement that converts a String
// representation of an integer to an int value using the parseInt method of the Integer class.
        int number = Integer.parseInt(num.nextLine());
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);

    }
}
