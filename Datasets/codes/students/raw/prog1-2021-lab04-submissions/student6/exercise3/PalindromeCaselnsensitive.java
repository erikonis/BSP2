package lu.uni.programming1.lab4.exercise3;

import java.util.*;

public class PalindromeCaselnsensitive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char array[];
        array = new char[100];
        int counter = 0;
        String right = "", left = "";

        System.out.println("Please type works one-by-one: 0 stops the Palindrome: ");
        char num = scanner.next().charAt(0);

        while (num != '0') {
            array[counter] = num;
            System.out.println("Please type words : 0 stops the Palindrome");
            num = scanner.next().charAt(0);
            ++counter;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
        for (int i = 0, j = counter - 1; i < counter / 2; i++, j--) {
            left = left + array[i];
            right = right + array[j];
        }
        if (left.equalsIgnoreCase(right) && counter > 1) {
            System.out.println("It is a Palindrome :)");
        } else {
            System.out.println("It is not a Palindrome :(");
        }

        scanner.close();
    }
}
