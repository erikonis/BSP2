import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        StringBuilder sequence = new StringBuilder();
        String inputChar;

        System.out.println("Enter characters (enter '0' to finish):");
        while (!(inputChar = console.nextLine()).equals("0")) {
            sequence.append(inputChar);
        }
        console.close();

        String forward = sequence.toString();
        String backward = sequence.reverse().toString();

        if (forward.equals(backward)) {
            System.out.println("\"" + forward + "\" is a palindrome.");
        } else {
            System.out.println("\"" + forward + "\" is not a palindrome.");
        }
    }
}