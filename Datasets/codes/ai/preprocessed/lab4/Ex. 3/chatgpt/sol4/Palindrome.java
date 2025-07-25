import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("Enter characters one by one. Type '0' to stop:");

        while (true) {
            char ch = scanner.next().charAt(0);
            if (ch == '0') break;
            input += ch;
        }

        boolean isPalindrome = true;
        int len = input.length();

        for (int i = 0; i < len / 2; i++) {
            if (input.charAt(i) != input.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("This is " + (isPalindrome ? "" : "not ") + "a palindrome.");
    }
}