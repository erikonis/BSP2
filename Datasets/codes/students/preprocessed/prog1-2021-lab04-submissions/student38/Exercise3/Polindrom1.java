import java.util.Scanner;

public class Polindrom1 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int ct = 0;
        String myChar = "A";
        char[] array;
        array = new char[100];

        while (myChar.charAt(0) != '0') {
            System.out.print("Please enter a string :");
            myChar = scanner.nextLine();
            array[ct] = myChar.charAt(0);
            ct++;
        }
        ct--;
        scanner.close();
        Boolean palindrome = true;
        for (int i = 0; i < ct / 2; i++) {
            if (array[i] != array[ct - 1 - i]) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("The word is not a palindrome");
        }
    }
};