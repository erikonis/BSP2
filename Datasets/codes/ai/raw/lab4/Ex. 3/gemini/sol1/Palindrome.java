package lab04.Ex. 3.gemini.sol1;

public package ex3;

import java.util.Scanner;

public class Palindrome {

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

        String str = input.toString();
        String reversed = input.reverse().toString();

        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
} {
    
}
