import java.util.Scanner;

public class PalindromeCaseInsensitive2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the word to see if it is a palindrome: ");
        String s = sc.nextLine();

        palindrome(s);

        sc.close();
    }

    public static void palindrome(String s) {
        String reverse = new StringBuffer(s).reverse().toString();
        if (s.toLowerCase().equals(reverse.toLowerCase())) {
            System.out.println("Yes, it is a palindrome");
        } else {
            System.out.println("No, it is not a palindrome");
        }
    }

}
