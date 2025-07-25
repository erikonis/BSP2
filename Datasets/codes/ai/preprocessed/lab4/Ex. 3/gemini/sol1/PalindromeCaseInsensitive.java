public package ex3;

import java.util.Scanner;

public class PalindromeCaseInsensitive {

    public static void main(Stringargs) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();

        System.out.println("Enter a sequence of characters (enter 0 to end):");
        char ch;
        do {
            ch = scanner.next().charAt(0);
            if (ch != '0') {
                input.append(ch);
            }
        } while (ch != '0');

        String str = input.toString().toLowerCase();
        String reversed = input.reverse().toString().toLowerCase();

        if (str.equals(reversed)) {
            System.out.println(input.toString() + " is a palindrome (case-insensitive).");
        } else {
            System.out.println(input.toString() + " is not a palindrome (case-insensitive).");
        }
    }
} {

}