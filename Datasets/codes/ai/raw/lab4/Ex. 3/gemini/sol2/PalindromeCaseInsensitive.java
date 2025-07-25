import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        char currentChar;

        System.out.println("Enter a sequence of characters (enter 0 to stop):");

        while (true) {
            String line = scanner.nextLine();
            if (line.length() == 1 && line.charAt(0) == '0') {
                break;
            }
            input.append(line);
        }

        String text = input.toString();
        String lowerCaseText = text.toLowerCase();
        String reversedLowerCaseText = new StringBuilder(lowerCaseText).reverse().toString();

        if (lowerCaseText.equals(reversedLowerCaseText)) {
            System.out.println("\"" + text + "\" is a case-insensitive palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a case-insensitive palindrome.");
        }

        scanner.close();
    }
}