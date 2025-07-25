import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        StringBuilder phrase = new StringBuilder();
        String inputLine;

        System.out.println("Enter text (type '0' to end):");
        while (!(inputLine = reader.nextLine()).equals("0")) {
            phrase.append(inputLine);
        }
        reader.close();

        String lowerCasePhrase = phrase.toString().toLowerCase();
        String reversedLowerCasePhrase = new StringBuilder(lowerCasePhrase).reverse().toString();

        if (lowerCasePhrase.equals(reversedLowerCasePhrase)) {
            System.out.println("\"" + phrase.toString() + "\" is a case-insensitive palindrome.");
        } else {
            System.out.println("\"" + phrase.toString() + "\" is not a case-insensitive palindrome.");
        }
    }
}