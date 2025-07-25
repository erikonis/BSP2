import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder inputSequence = new StringBuilder();

        System.out.println("Enter characters one-by-one. Enter '0' to finish:");

        while (true) {
            char ch = scanner.next().charAt(0);
            if (ch == '0') {
                break;
            }
            inputSequence.append(ch);
        }

        scanner.close();

        String input = inputSequence.toString();
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The input sequence is a palindrome.");
        } else {
            System.out.println("The input sequence is not a palindrome.");
        }
    }
}
