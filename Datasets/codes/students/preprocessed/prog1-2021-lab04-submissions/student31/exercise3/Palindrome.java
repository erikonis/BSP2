import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sequence = "";
        char input = ' ';

        do {
            System.out.print("Please enter one charcter (if there are mulitple, the first one is counted).\nTo end, enter \"0\": ");
            input = scanner.nextLine().charAt(0);
            System.out.println(input);

            //0 isn't accounted into the palindrome
            if (input != '0') {
                sequence += input;
            }
        
        } while (input != '0');

        scanner.close();

        //getting first half of numbers in reversed order
        String half1 = "";

        int i;

        for (i = 0; i < sequence.length()/2; ++i) {
            half1 = sequence.charAt(i) + half1;
        }

        //already counted number of characters -1 if even, 0 if odd)
        int i2 = 0;
        
        if (sequence.length()%2 == 0) {
            i2 = i;
        } else {
            i2 = i+1;
        }

        //getting second half of numbers in reversed order
        String half2 = "";

        for (i = 0; i < sequence.length()/2; ++i) {
            half2 += sequence.charAt(i+i2);
        }

        //checks if first half is the same as the second one
        if (half1.equals(half2)) {
            System.out.println(sequence + " is a palindrome.");
        } else {
            System.out.println(sequence + " is not a palindrome.");
        }
    }
}