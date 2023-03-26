import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non-negative integer:");
        int n = input.nextInt();

        //check if a number is non-negative
        if (n<0){
            System.out.println("Invalid input. Please enter a non-negative integer");
            return;
        }
        //calculate the factorial of a given number
        int fact = 1, i=1;
        while (i<=n){
            fact *= i;
            i++;
        }
        //Print the result
        System.out.printf("The factorial of %d is %d\n" ,n, fact);
    }
}
