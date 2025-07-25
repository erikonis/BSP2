import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();

        System.out.println("Enter characters one by one. Enter '0' to stop:");

        while (true) {
            char ch = scanner.next().charAt(0);
            if (ch == '0') break;
            input.append(Character.toLowerCase(ch));
        }

        String original = input.toString();
        String reversed = input.reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("This is a case-insensitive palindrome.");
        } else {
            System.out.println("This is NOT a palindrome.");
        }
    }
}
