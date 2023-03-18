import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //use rand object from random package to get random number
        Random rand = new Random();

        //read the random number and bound it to 100 and initialize it to random number
        int num = rand.nextInt(100)+1;
        //initialize guess variable to 0 to show that initial number is != to random number
        int guess = 0;

        System.out.println("Enter the number between 1 to 100: ");

        while (guess != num) {
            guess = input.nextInt();

            if (guess < num) {
                System.out.println("Too low, try again.");
            } else if (guess > num) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations, you guessed the number!");
            }
        }
    }
}
