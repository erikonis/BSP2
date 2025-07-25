import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        StringBuilder wordSequence = new StringBuilder();
        String characterInput;

        System.out.println("Enter characters (type '0' to stop):");
        while (!(characterInput = userInput.nextLine()).equals("0")) {
            wordSequence.append(characterInput);
        }
        userInput.close();

        String originalWord = wordSequence.toString();
        String reversedWord = wordSequence.reverse().toString();

        if (originalWord.equals(reversedWord)) {
            System.out.println("\"" + originalWord + "\" is a palindrome.");
        } else {
            System.out.println("\"" + originalWord + "\" is not a palindrome.");
        }
    }
}