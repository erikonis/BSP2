import java.util.Scanner;

public class Palindrome {
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
        String reversedText = input.reverse().toString();

        if (text.equals(reversedText)) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }

        scanner.close();
    }
}