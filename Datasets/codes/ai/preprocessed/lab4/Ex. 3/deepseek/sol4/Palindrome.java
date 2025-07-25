import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Palindrome {

    public static void main(String[] args) {
        List<Character> sequence = readCharacterSequence();
        boolean isPal = isPalindrome(sequence);
        System.out.println(buildResultMessage(sequence, isPal, false));
    }

    static List<Character> readCharacterSequence() {
        Scanner sc = new Scanner(System.in);
        List<Character> chars = new ArrayList<>();
        System.out.println("Enter characters (0 to end):");

        while (true) {
            String input = sc.next();
            if (input.length() != 1) {
                System.out.println("Enter exactly one character");
                continue;
            }
            char c = input.charAt(0);
            if (c == '0') break;
            chars.add(c);
        }
        sc.close();
        return chars;
    }

    static boolean isPalindrome(List<Character> chars) {
        int left = 0, right = chars.size() - 1;
        while (left < right) {
            if (!chars.get(left++).equals(chars.get(right--))) {
                return false;
            }
        }
        return true;
    }

    static String buildResultMessage(List<Character> chars, boolean isPalindrome, boolean ignoreCase) {
        StringBuilder sb = new StringBuilder();
        for (char c : chars) sb.append(c);
        return String.format("'%s' is%s a palindrome%s",
            sb.toString(),
            isPalindrome ? "" : " not",
            ignoreCase ? " (case-insensitive)" : "");
    }
}