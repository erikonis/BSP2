package lu.uni.programming1.lab4.exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        ArrayList<Character> charlist = new ArrayList<>();

        boolean zeroPressed = false;
        
        while(!zeroPressed)
        {
            System.out.println("Next char:");
            charlist.add(scanner.next(".").charAt(0));
            if(charlist.get(charlist.size()-1)=='0') {zeroPressed = true ; charlist.remove(charlist.size()-1);}
        }

        ArrayList<Character> reversedlist = new ArrayList<>();

        for(int i=charlist.size()-1; i>=0 ; i--)
        {
            charlist.set(i, Character.toLowerCase(charlist.get(i)));
            reversedlist.add(charlist.get(i));
        }

        System.out.println(charlist.equals(reversedlist)?"true":"false");

        scanner.close();
    }
}
