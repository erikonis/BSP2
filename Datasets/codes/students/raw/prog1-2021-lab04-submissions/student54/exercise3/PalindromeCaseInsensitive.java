package lu.uni.programming1.lab4.exercise3;

import java.util.Scanner;

import java.util.ArrayList;

public class PalindromeCaseInsensitive { 
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> palindrome = new ArrayList<Character>();
        
    
        System.out.print("Please enter character. 0 stops the input: ");
        while (scanner.hasNext())
        {
            char character = scanner.next().charAt(0);
            
            
            if (character != '0') { 
                palindrome.add(character);
                System.out.println(palindrome);
                System.out.print("Please enter character. 0 stops the input: ");}
                
             else{   
                System.out.println(palindrome);
                String stringPalindrome = stringBuilder(palindrome);
                System.out.println("Word in string format" +stringPalindrome);
                ArrayList<Character> reversed = reverse(palindrome);
                System.out.println("This is the reversed word: " +reversed);
                String stringReversed = stringBuilder(reversed);
                System.out.println("Reversed word in string format" +stringReversed);
          
                if (stringPalindrome.equalsIgnoreCase(stringReversed)) {System.out.println("This is a palindrome.");
                break;
                    
                } else {
                    System.out.println("This is not a palindrome.");
                    break;
                    
                }
          
                
            }
           
        }  

        
        scanner.close();
                   
      }
       public static ArrayList<Character> reverse (ArrayList<Character> characters){

        ArrayList<Character> result = new ArrayList<Character>();
        
        for(int i = characters.size()-1; i>=0; i--){
            result.add(characters.get(i));
        }
            return result;
        
       }
            
    public static String stringBuilder(ArrayList<Character> l)
    {    
        StringBuilder builder = new StringBuilder(l.size()); //declaring size is important
        
        for(Character c: l) //for each character inside the arraylist 
        {
            builder.append(c);//add it to builder
        }
        return builder.toString();//convert builder into string
    }
    }

