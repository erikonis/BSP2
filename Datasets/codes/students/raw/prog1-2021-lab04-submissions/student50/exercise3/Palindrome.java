package lu.uni.programming1.lab4.exercise3;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        ArrayList<Character> word = new ArrayList<Character>();
        String original = "";
        String reverse = "";
        char input =' ';
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter the chars to check if they are a palindrome (0 ends the input):");
        // Stores input until it is 0
        while(input != '0'){
            input = scanner.next().charAt(0);
            word.add(input);
        }
        // Adds characters besides last one (0)
        for(int i=0;i<word.size()-1;i++){
            original += word.get(i);
        }
        int length = original.length();
        //Reverses string
        for(int i = length - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }  
        // Checks for palindrome
        if (original.equals(reverse))  
            System.out.println("Input sequence is a palindrome.");  
        else  
            System.out.println("Input sequence isn't a palindrome.");   
        scanner.close();
    }
}
