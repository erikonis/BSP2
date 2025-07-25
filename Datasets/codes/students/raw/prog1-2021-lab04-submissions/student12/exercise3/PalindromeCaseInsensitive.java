package lu.uni.programming1.lab4.exercise3;

import java.util.Scanner;

public class PalindromeCaseInsensitive {
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
            reverse = reverse + original.toLowerCase().charAt(i);

        }
        System.out.println("The reverse of the original word is: " + reverse);

        if (original.toLowerCase().equals(reverse)) {
            System.out.println("The word " + original + " is a palindrome!");
        } else {
            System.out.println("The word " + original + " is not a palindrome!");
        }
        

    }
}
