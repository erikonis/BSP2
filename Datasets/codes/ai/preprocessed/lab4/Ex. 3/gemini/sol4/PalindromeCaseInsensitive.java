import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        StringBuilder textInput = new StringBuilder();
        String currentLine;

        System.out.println("Enter text (enter '0' to end input):");
        while (!(currentLine = console.nextLine()).equals("0")) {
            textInput.append(currentLine);
        }
        console.close();

        String lowerCaseInput = textInput.toString().toLowerCase();
        String reversedLowerCase = new StringBuilder(lowerCaseInput).reverse().toString();

        if (lowerCaseInput.equals(reversedLowerCase)) {
            System.out.println("\"" + textInput.toString() + "\" is a case-insensitive palindrome.");
        } else {
            System.out.println("\"" + textInput.toString() + "\" is not a case-insensitive palindrome.");
        }
    }
}