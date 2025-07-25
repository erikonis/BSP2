package lu.uni.programming1.lab4.exercise3;

import java.util.Scanner;

public class PalindromeCaseInsensitive {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String mots, pali = "", left = "", right = "",newleft,newright;

        System.out.println("Please enter a sequence of characters: ");

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
        newleft = left.toLowerCase();
        newright = right.toLowerCase();

        String result = newright.equals(newleft) && pali.length() > 1 ? "This is a palindrome." : "This is not a palindrome.";
        System.out.println(result);

        scan.close();

    }
}