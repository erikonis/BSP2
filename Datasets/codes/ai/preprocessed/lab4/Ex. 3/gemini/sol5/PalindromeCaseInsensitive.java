import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        StringBuilder inputText = new StringBuilder();
        String lineOfInput;

        System.out.println("Enter text (type '0' to finish):");
        while (!(lineOfInput = userInput.nextLine()).equals("0")) {
            inputText.append(lineOfInput);
        }
        userInput.close();

        String lowerCaseInputText = inputText.toString().toLowerCase();
        String reversedLowerCaseText = new StringBuilder(lowerCaseInputText).reverse().toString();

        if (lowerCaseInputText.equals(reversedLowerCaseText)) {
            System.out.println("\"" + inputText.toString() + "\" is a case-insensitive palindrome.");
        } else {
            System.out.println("\"" + inputText.toString() + "\" is not a case-insensitive palindrome.");
        }
    }
}