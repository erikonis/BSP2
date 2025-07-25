import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create a word with char
        char letter;
        int j = 0;
        int i = 0;
        int h = 0;
        boolean pal = true;
        char word[] = new char[25];

        do {

            System.out.println("Give one letter : ");
            letter = scanner.next().charAt(0);
            word[j] = letter;
            ++j;

        } while (letter != '0');

        scanner.close();
        
        // Print the word

        System.out.println("Your word is :");
        for (i = 0; i < j - 1; ++i)
            System.out.print(word[i]);

        // Check if the word is a palindrom

        do {
            if (word[h] != word[j - h - 2]) {
                pal = false;
            }
            ++h;

        } while (h < j - 1);

        if (pal == true) {
            System.out.println();
            System.out.println("It's a palindrome.");
        }
        if (pal == false) {
            System.out.println();
            System.out.println("It's NOT a palindrome.");
        }
    

    }
}
