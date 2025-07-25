import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sequence = new StringBuilder();

        System.out.println("Enter characters one by one (enter 0 to finish):");

        // Read characters until 0 is entered
        while (true) {
            String input = scanner.next();
            if (input.length() != 1) {
                System.out.println("Please enter exactly one character at a time.");
                continue;
            }
            char c = input.charAt(0);
            if (c == '0') {
                break;
            }
            sequence.append(c);
        }

        // Check if palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < sequence.length() / 2; i++) {
            if (sequence.charAt(i) != sequence.charAt(sequence.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("The sequence " + sequence + (isPalindrome ? " is" : " is not") + " a palindrome.");
        scanner.close();
    }
}