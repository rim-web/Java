import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int decimal = input.nextInt();
        //convert decimal to binary
        StringBuilder binary = new StringBuilder("        ");
        while (decimal > 0) {
            binary.insert(0, (decimal % 2));
            decimal/=2;
        }
        //print the binary equivalent of the decimal number
        System.out.println("Binary equivalent: "+binary);
    }
}