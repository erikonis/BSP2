package lu.uni.programming1.lab4.exercise3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String Char = "B";
        char[] myArray;
        myArray = new char[50];

        while (Char.charAt(0) != '0') {
            System.out.print("Please enter a character :");
            Char = scanner.nextLine();
            myArray[count] = Char.charAt(0);
            count++;
        }
        count--;
        scanner.close();
        Boolean isPalindrome = true;
        for (int i = 0; i < count / 2; i++) {
            if (myArray[i] != myArray[count - 1 - i]) {
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
