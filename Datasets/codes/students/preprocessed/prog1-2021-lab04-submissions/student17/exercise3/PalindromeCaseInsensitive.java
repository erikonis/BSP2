import java.util.Scanner;

public class PalindromeCaseInsensitive {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.print("Enter word: ");
        String letter= scanner.next();

        while(letter!="0")
        {
            if(isPalindrome(letter))
            {
                System.out.println("is a palindrome");
            }
            else
            {
                System.out.println("is not a palindrome");
            }
            System.out.print("Enter word: ");
            letter= scanner.next();
        }

        scanner.close();
    }

    public static boolean isPalindrome(String s)
    {
        String sBackwards="";
        for(int i=s.length()-1; i>=0;i--)
        {
            sBackwards = sBackwards + s.charAt(i);
        }
        
        if(sBackwards.equalsIgnoreCase(s))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
