import java.util.Scanner;

class PalindromeCaseInSensitive {

public static boolean isPalindrome(String str){
        
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
}
public static void main(String[] args){
    // Input string
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    input = input.replaceAll("[^a-zA-Z]+","").toLowerCase();
    // passing bool function till holding true
    if (isPalindrome(input))

        // It is a pallindrome
        System.out.print("Yes");
    else

        // Not a pallindrome
        System.out.print("No");
    scanner.close();
}
}

