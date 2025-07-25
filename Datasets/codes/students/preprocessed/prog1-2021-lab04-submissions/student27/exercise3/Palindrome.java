import java.util.Scanner;

public class Palindrome {

    public static boolean palindrome(String usrInput) {

        int strLength = usrInput.length() - 1; // -1 because charAt start count at 0

        for (int i = 0; i < strLength; i++) {
            if (usrInput.charAt(i) != usrInput.charAt(strLength)) {
                return false;
            }
            strLength--;
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = "";
        System.out.print("Enter a word: (enter 0 to stop) ");
        do {
            word = scanner.nextLine();
            if (word.equals("0")) {
                break;
            }
            if (palindrome(word)) {
                System.out.println("This word is a palindrome");
            } else {
                System.out.println("This word is not a palindrome");
            }
        } while (!word.equals("0"));

        scanner.close();
    }
}
