
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String currentChar = "B";// Case sensitive
        char[] myArray;
        myArray = new char[50];

        while (currentChar.charAt(0) != '0') {
            System.out.print("Please enter a character :");
            currentChar = scanner.nextLine();
            myArray[count] = currentChar.charAt(0);
            count++;
        }
        count--;// We ignore the last character the zero
        scanner.close();
        Boolean isPalindrome = true;
        for (int i = 0; i < count / 2; i++) {
            if (myArray[i] != myArray[count - 1 - i]) { // We find a mismatch
                isPalindrome = false;
            }
        }
        if (isPalindrome) {
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("The word is not a palindrome");
        }
    }
}
