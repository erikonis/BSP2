import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input, palindrome = "", leftcheck = "", rightcheck = "",newleft,newright;
        System.out.println("Please enter a sequence of characters: ");

        do {
            input = scanner.nextLine();
            if (input.equals("0") == false) {
                palindrome += input;
            }
        } while (input.equals("0") == false);

        System.out.println("String = " + palindrome);

        for (int i = 0, j = palindrome.length() - 1; i < palindrome.length(); i++, j--) {
            leftcheck += palindrome.charAt(i);
            rightcheck += palindrome.charAt(j);
        }
        newleft = leftcheck.toLowerCase();
        newright = rightcheck.toLowerCase();

        String result = newright.equals(newleft) && palindrome.length() > 1 ? "This is a palindrome." : "This is not a palindrome.";
        System.out.println(result);

        scanner.close();

    }
}