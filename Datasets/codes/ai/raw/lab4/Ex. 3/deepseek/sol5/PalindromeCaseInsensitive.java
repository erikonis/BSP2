import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        Deque<Character> sequence = readInputSequence();
        boolean isPalindrome = checkPalindromeCaseInsensitive(sequence);
        printResult(sequence, isPalindrome, true);
    }

    private static Deque<Character> readInputSequence() {
        Scanner scanner = new Scanner(System.in);
        Deque<Character> sequence = new ArrayDeque<>();
        System.out.println("Enter characters one by one (0 to finish):");
        
        while (true) {
            String input = scanner.next();
            if (input.length() != 1) {
                System.out.println("Please enter exactly one character.");
                continue;
            }
            char c = input.charAt(0);
            if (c == '0') break;
            sequence.addLast(c);
        }
        scanner.close();
        return sequence;
    }

    private static boolean checkPalindromeCaseInsensitive(Deque<Character> sequence) {
        while (sequence.size() > 1) {
            char first = Character.toLowerCase(sequence.removeFirst());
            char last = Character.toLowerCase(sequence.removeLast());
            if (first != last) {
                return false;
            }
        }
        return true;
    }

    private static void printResult(Deque<Character> sequence, boolean isPalindrome, boolean caseInsensitive) {
        StringBuilder sb = new StringBuilder();
        sequence.forEach(sb::append);
        String sensitivity = caseInsensitive ? " (case-insensitive)" : "";
        System.out.printf("\"%s\" is%s a palindrome%s.%n",
            sb.toString(), isPalindrome ? "" : " not", sensitivity);
    }
}