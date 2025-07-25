import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of characters (enter 0 to stop):");

        StringBuilder sequence = new StringBuilder();
        char input;
        do {
            input = scanner.next().charAt(0);
            if (input != '0') {
                sequence.append(input);
            }
        } while (input != '0');

        String original = sequence.toString();
        String reversed = sequence.reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("The sequence is a palindrome.");
        } else {
            System.out.println("The sequence is not a palindrome.");
        }
    }
}