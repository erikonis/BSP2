package lu.uni.programming1.lab4.exercise3;

import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String currentLine = "B";
        char[] myArray;
        myArray = new char[50];

        while (currentLine.charAt(0) != '0') {
            System.out.print("Please enter a character:");
            currentLine = scanner.nextLine();
            currentLine = currentLine.toUpperCase(); 
            myArray[count] = currentLine.charAt(0);
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
