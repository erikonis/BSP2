import java.util.Arrays;
import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {

        char[] sequence = new char[256]; // we assert the sequence is shorter than 256 chars
        int charNum = 0;

        char c;

        Scanner scanner = new Scanner(System.in);

        do {
            c = scanner.next().charAt(0);
            if (c != '0') {
                sequence[charNum] = c;
                charNum++;
            }

            if (charNum >= sequence.length - 1) {
                sequence = Arrays.copyOf(sequence, sequence.length * 2);
            }

        } while (c != '0');

        scanner.close();

        // Checking for palindrome
        boolean palindrome = true;
        for (int i = 0; i <= charNum / 2; i++) {
            char c1 = sequence[i];
            char c2 = sequence[charNum - 1 - i];
            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                palindrome = false;
                break;
            }
        }

        System.out.println(
                palindrome
                        ? "Input is a palindrome"
                        : "Input is NOT a palindrome");
    }
}