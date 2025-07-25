import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder inputSequence = new StringBuilder();

        System.out.println("Enter characters oneAt(0);
            if (ch == '0') {
                break;
            }
            inputSequence.append(ch);
        }

        scanner.close();

        String input = inputSequence.toString().toLowerCase();
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
           .out.println("The input sequence is a palindrome.");
        } else {
            System.out.println("The input sequence is not a palindrome.");
        }
    }
}