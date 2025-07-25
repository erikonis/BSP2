import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {


        String sequence = "";
         
         String sequencev2 = "";
         
         char chars = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("To check if your input sequence represents a palindrome or not, insert characters one by one. In order to print out the word type '0'");
        
        while(chars != '0')
        {
            chars = scanner.next().charAt(0);
            
            if(chars == '0') {
                System.out.println("The sequence of characters you entered is: " + sequence);
                break;
            
            } else
                sequence += chars;
            }

         int howlarge = sequence.length();
        
         int a = howlarge-1;
           
        while ( a >= 0) {
          
          sequencev2 = sequencev2 + sequence.charAt(a);
          a--;
         }
        

        if (sequence.equalsIgnoreCase(sequencev2)) {
            System.out.println("I hereby declare this sequence of characters, a palindrome!");
        } else {
            System.out.println("I hereby declare this sequence of characters, NOT a palindrome!");
        }


    scanner.close();
    }
}
