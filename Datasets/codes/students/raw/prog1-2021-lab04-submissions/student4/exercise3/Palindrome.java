package lu.uni.programming1.lab4.exercise3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String pali = "", left = "", right = "", mots;

        System.out.println("Please enter your word: ");

        do {
            mots = scan.nextLine();
            if (mots.equals("0") == false) {
                pali += mots;
            }
        } while (mots.equals("0") == false);

        System.out.println("String = " + pali);

        for (int i = 0, j = pali.length() - 1; i < pali.length(); i++, j--) {
            left += pali.charAt(i);
            right += pali.charAt(j);
        }
        String result = right.equals(left) && pali.length() > 1 ? "This is a palindrome." : "This isn't a palindrome.";
        System.out.println(result);

        scan.close(); 

    }
}