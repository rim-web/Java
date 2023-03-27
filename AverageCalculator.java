import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int number;
        do {
            System.out.println("Enter a number (-1 to end): ");
            number = input.nextInt();
            if (number!=-1){
                count++;
                sum += number;
            }
        }while (number!=-1);
        if (count>0){
            double average = (double) sum/count;
            System.out.println("Average is " + average);
        }else {
            System.out.println("No numbers were entered");
        }
    }
}
