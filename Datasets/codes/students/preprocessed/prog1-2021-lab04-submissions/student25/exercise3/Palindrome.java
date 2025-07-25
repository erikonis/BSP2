import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input letters or word.\nInput '0' to stop input process.");

        String word = "";
        char l = ' ';

        while (l != '0'){
            l = scan.next().charAt(0);

            if (l != '0') {word += l;}

        }

        System.out.println("\n");

        String drow = "";

       for (int i = word.length()-1; i > -1; --i){ //For loop, but backward
           drow += word.charAt(i);
       }

       if (word.equals(drow)) {
           System.out.format("The word '%s' is a palidrome", word);
       } else {
            System.out.format("The word '%s' is not a palidrome", word);
       }


       scan.close();
    }
}
    

