public // PalindromeCaseInsensitive.java
import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sequence of characters: ");
        String input = sc.nextLine();

        // Remove non-alphabetic characters and check for palindrome (case-insensitive)
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();

        if (cleanedInput.equals(reversedInput)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }
}
 {
    
}
