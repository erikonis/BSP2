package lu.uni.programming1.lab4.exercise3.1;



import java.util.Scanner;


public class Palindrome {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        char value = 0;
        String line = "";
        System.out.println("Enter a character and 0 to stop");
        
        while(value != '0')
        {
            //read the character from the input
            value = input.next().charAt(0);
            if(value == '0')
            {
                break;
            }
            else
            {
                //keep adding the char to the string
                line = line + value;
            }
            System.out.println("Enter a character and 0 to stop");
        }
        //function to check if palindrome
        boolean result = isPalindrome(line);
        if(result == true)
        {
            System.out.println(line + " is palindrome");
        }else
        {
            System.out.println(line + " is not palindrome");
        }
    }
    
    private static boolean isPalindrome(String original) {
        //reverse the original string and check if its equal to the reversed one
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
    
}
