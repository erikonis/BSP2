import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any string : ");

        // Original string
        String original = "";
        String input = "";
        while (true) {
            System.out.print("Enter any string : ");
            input = scanner.nextLine();
            if(!input.equals("0")){
                original = original + input;
            }else{
                break;
            }
        }

        scanner.close();

        // Convert String into char
        char[] charOriginal = original.toCharArray();
        int length = charOriginal.length;

        boolean isPalindrome = true;

        for (int i = 0; i < length; i++) {
            if (charOriginal[i] != charOriginal[length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Word is a palindrome.");
        } else {
            System.out.println("Word is not a palindrome.");
        }
    }
}
