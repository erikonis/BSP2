package lu.uni.programming1.lab4.exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args){
        ArrayList<Character> alChars = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a single character :");
        char input = scan.next().toLowerCase().charAt(0);
        while(input!='0'){
            alChars.add(input);
            System.out.println("Please input a single character :");
            input = scan.next().charAt(0);
        }
        scan.close();
        int index=0;
        while(alChars.get(index).equals(alChars.get(alChars.size()-1-index)) && index != (alChars.size()-1-index)){
            index++;
        }
        if(index == (alChars.size()-1-index)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }

    }
}
