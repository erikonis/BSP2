import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> characters = new ArrayList<>();

        System.out.println("Enter characters one by one. Enter '0' to finish input:");

        while (true) {
            char ch = scanner.next().charAt(0);
            if (ch == '0') break;
            characters.add(ch);
        }

        boolean isPalindrome = true;
        int n = characters.size();

        for (int i = 0; i < n / 2; i++) {
            if (characters.get(i) != characters.get(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Sequence: " + characters);
        System.out.println(isPalindrome ? "This is a palindrome." : "This is NOT a palindrome.");
    }
}