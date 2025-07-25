package lu.uni.programming1.lab4.exercise3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        char c;
        String word ="";
        int wordLenght =0;
        int counter =0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please put in a char: ");
        c = scanner.next().charAt(0);

        while(c != '0')
        {
            if(c != '0')
            {
                word = word + c;
                wordLenght++;
            }
            c = scanner.next().charAt(0);
        }
        scanner.close();
        System.out.println(word);

        String lowercase = word.toLowerCase();
        for (int i = 0; i < wordLenght; i++) {
            if(lowercase.charAt(i) == lowercase.charAt(wordLenght-i-1))
            {
                counter++;
            }
        }

        if(counter == wordLenght)
        {
            System.out.println("The word you put in is a palindrome");
        }
        else
        {
            System.out.println("The word is not a palindrom");
        }

    }
}
