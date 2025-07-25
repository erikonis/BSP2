import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        StringBuilder word = new StringBuilder();
        String line;

        System.out.println("Enter characters (type '0' to finish):");
        while (!(line = reader.nextLine()).equals("0")) {
            word.append(line);
        }
        reader.close();

        String original = word.toString();
        String reversed = word.reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }
    }
}