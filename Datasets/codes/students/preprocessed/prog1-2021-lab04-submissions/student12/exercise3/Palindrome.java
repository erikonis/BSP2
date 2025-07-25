import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        String original = "";
        Boolean contains = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Type here the letters :");
        String letter = scanner.next();

        while (contains != true) {
            original = original + letter;
            System.out.println("Please Type here the letters :");
            letter = scanner.next();
            if (letter.contains("0")) {
                contains = true;
            }

        }
        System.out.println("The original word is: " + original);
        scanner.close();

        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);

        }
        System.out.println("The reverse of the original word is: " + reverse);

        if (original.equals(reverse)) {
            System.out.println("The word " + original + " is a palindrome!");
        } else {
            System.out.println("The word " + original + " is not a palindrome!");
        }

    }
}
