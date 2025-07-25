import java.util.Scanner;
import java.util.ArrayList;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        ArrayList<Character> chars = readInput();
        boolean isPalindrome = checkPalindromeCaseInsensitive(chars);
        printResult(chars, isPalindrome, true);
    }

    private static ArrayList<Character> readInput() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> chars = new ArrayList<>();
        System.out.println("Enter characters one by one (0 to finish):");

        while (true) {
            String input = scanner.next();
            if (input.length() != 1) {
                System.out.println("Please enter exactly one character.");
                continue;
            }
            char c = input.charAt(0);
            if (c == '0') break;
            chars.add(c);
        }
        scanner.close();
        return chars;
    }

    private static boolean checkPalindromeCaseInsensitive(ArrayList<Character> chars) {
        int left = 0;
        int right = chars.size() - 1;
        while (left < right) {
            if (Character.toLowerCase(chars.get(left++)) !=
                Character.toLowerCase(chars.get(right--))) {
                return false;
            }
        }
        return true;
    }

    private static void printResult(ArrayList<Character> chars, boolean isPalindrome, boolean caseInsensitive) {
        StringBuilder sb = new StringBuilder();
        for (char c : chars) sb.append(c);
        String sensitivity = caseInsensitive ? " (case-insensitive)" : "";
        System.out.printf("The sequence %s is%s a palindrome%s.%n",
            sb.toString(), isPalindrome ? "" : " not", sensitivity);
    }
}