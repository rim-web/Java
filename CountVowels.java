import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = input.nextLine().toLowerCase();
        int vowelCount = 0;//keep track of the vowels in string
        int index = 0;// \keep track of the letters in the index. Every letter has its own index

        do {
            char currentChar = text.charAt(index);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o'|| currentChar == 'u'){
                vowelCount++;
            }
            index++;
        } while (index < text.length());
        System.out.println("Number of vowels in the string is: " + vowelCount);
    }
}
