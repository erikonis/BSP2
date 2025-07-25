import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sequence = new StringBuilder();
        
        System.out.println("Enter characters one by one (enter 0 to finish):");
        
        // Read characters until 0 is entered
        while (true) {
            String input = scanner.next();
            if (input.length() != 1) {
                System.out.println("Please enter exactly one character at a time.");
                continue;
            }
            char c = input.charAt(0);
            if (c == '0') {
                break;
            }
            sequence.append(c);
        }
        
        // Check if palindrome (case-insensitive)
        boolean isPalindrome = true;
        String lowerSequence = sequence.toString().toLowerCase();
        for (int i = 0; i < lowerSequence.length() / 2; i++) {
            if (lowerSequence.charAt(i) != lowerSequence.charAt(lowerSequence.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println("The sequence " + sequence + (isPalindrome ? " is" : " is not") + " a palindrome (case-insensitive check).");
        scanner.close();
    }
}