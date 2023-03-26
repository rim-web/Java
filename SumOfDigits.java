import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;//store the values of sum in this variable
        do {
            sum += num%10;//num divided by 10 it gives the right most digit as remainder
            num /=10;//remove the right most digit from number
        }while (num!=0);
        System.out.println("The sum of digit is " + sum);
        input.close();
    }
}
