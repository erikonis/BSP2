package lu.uni.programming1.lab4.exercise3;
import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        String word = "";
        String drow = "";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter a char:");
            char a = scanner.next().charAt(0);
            if (a == (char) 48) {
                break;
            } else {
                word += a;
            }
        }
        for (int i = word.length() - 1; i >= 0; i--) {
            drow += word.charAt(i);
        }
        if (word.equalsIgnoreCase(drow)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is not a Palindrome.");
        }
        scanner.close();
    }
}
