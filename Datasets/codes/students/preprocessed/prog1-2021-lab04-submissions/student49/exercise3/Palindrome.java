import java.util.Scanner;
public class Palindrome {

    static boolean isPalindrome(String str){

        int i = 0, j = str.length() - 1;
 

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
 
        return true;
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = ""; //String reverse = "";
        char c = ' ';
        System.out.println("Please enter a sequence of characters, type 0 to stop: ");
        
        do{
            c = sc.next().charAt(0);
           str += c;
            } while (c != '0');
       
        
        
        for (int i = 0; i < str.length();i++){
            if (str.charAt(i) == '0'){
                str = str.replace("0", "");
            }
        }
        System.out.print("The word " + str);

        sc.close();
        if (isPalindrome(str))
            System.out.print(" is a palindrome");
        else
            System.out.print(" is not a palindrome");
 

        System.out.println();

    }
}
