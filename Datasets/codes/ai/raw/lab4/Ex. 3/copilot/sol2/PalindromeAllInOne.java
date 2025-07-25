package exercise3;

import java.util.Scanner;

public class PalindromeAllInOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        char ch;

        System.out.println("Enter characters one by one (enter '0' to finish):");
        while ((ch = scanner.next().charAt(0)) != '0') {
            input.append(ch);
        }

        String original = input.toString();
        String reversed = input.reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("The sequence is a palindrome.");
        } else {
            System.out.println("The sequence is not a palindrome.");
        }
    }
}