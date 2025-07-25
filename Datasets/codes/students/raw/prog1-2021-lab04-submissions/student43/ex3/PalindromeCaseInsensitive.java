package lu.uni.programming1.lab4.ex3;
import java.util.*;
public class PalindromeCaseInsensitive {
    public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      original = in.nextLine();
      int length = original.length();   

      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);
      if (original.equalsIgnoreCase(reverse))  
         System.out.println("your word is a palindrome.");  
      else  
         System.out.println("your word isn't a palindrome.");   

    in.close();
   }  
}
