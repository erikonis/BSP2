package lu.uni.programming1.lab4.exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    ArrayList<Character> characters = new ArrayList<>();

    char acter; 
    boolean may = true;

    System.out.println("Please enter a sequence of characters (one after the other). Enter 0 to launch Palindrome verification.");
    
    do { 
        acter = scanner.next().charAt(0);
        if (acter == '0') {may = false;}
        characters.add(acter);
        
    } while (may != false);

    characters.remove(Character.valueOf('0'));

    ArrayList<Character> lindrome = new ArrayList<>(characters);

    Collections.reverse(lindrome);

    boolean isit = characters.equals(lindrome);

    if (isit == true) {System.out.println("Palindrome !");}
    else {System.out.println("Not a Palindrome !");}
    

    scanner.close();

        
    }

}
