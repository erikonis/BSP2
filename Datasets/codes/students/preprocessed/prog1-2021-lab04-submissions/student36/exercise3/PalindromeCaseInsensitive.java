import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isPalindrome = true;

        while (isPalindrome) {
        String reverse = "";
        System.out.println("Enter a sequence of chars (0 to quit): ");
        CharSequence input = scanner.nextLine();
        int length = input.length();
        int i = length-1;

        while (i >= 0) {
            reverse = (reverse + input.charAt(i));
            i--;
        }
        if (input.equals("0")) {
            break;
        }
        if (((String) input).toLowerCase().equals(reverse.toLowerCase()) && reverse.equals(reverse)) 
            System.out.println(input + " is a palindrome.");
        else 
            System.out.println(input + " is not a palindrome.");
        }
        scanner.close();
    }
}
