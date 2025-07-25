import java.util.Scanner;

public class PalindromeOptimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        char ch;

        System.out.println("Enter characters one by one (enter '0' to finish):");
        while ((ch = scanner.next().charAt(0)) != '0') {
            input.append(ch);
        }

        String original = input.toString();
        boolean isPalindrome = true;
        int length = original.length();

        for (int i = 0; i < length / 2; i++) {
            if (original.charAt(i) != original.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The sequence is a palindrome.");
        } else {
            System.out.println("The sequence is not a palindrome.");
        }
    }
}