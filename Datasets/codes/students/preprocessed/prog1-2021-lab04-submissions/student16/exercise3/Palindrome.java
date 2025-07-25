import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;



public class Palindrome {public static void main(String[] args) {
    
    char letter = '1';
    char letter2;
    List<Character> word = new ArrayList<Character>();
    List<Character> word2 = new ArrayList<Character>();

    Scanner scanner = new Scanner(System.in);

  
    System.out.print("Please enter a letter :");

    while(!scanner.hasNext("0")){    
       System.out.print("Please enter a letter :");
       letter = scanner.next().charAt(0);
    
       word.add(letter);
    }

    for(int i=word.size()-1;i>=0;--i){
        letter2 = word.get(i);
        word2.add(letter2);
    
        //word2.add(word.get(i));
    }
    boolean boolval = word.equals(word2);
    if(boolval==true){
        System.out.print("The word " + word + " is a palindrome.");
    }else{
        System.out.print("The word " + word + " is not a palindrome.");
    }
    

    scanner.close();
}
    
}
