import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();

        System.out.println("Enter characters one by one (type '0' to finish):");

        while (true) {
            char c = scanner.next().charAt(0);
            if (c == '0') break;
            input.append(c);
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