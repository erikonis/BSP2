import java.util.Scanner;

public class PalindromeCaseInsesitive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String initial = "";
        String last = "";

        System.out.println("Please enter a word to check if it's a palindrome: ");
        initial = scanner.nextLine();

        int length = initial.length();

        for(int i=length-1; i>=0; i--){
            last += initial.charAt(i);
        }

        if(initial.toLowerCase().equals(last.toLowerCase())){
            System.out.println("The word '"+initial+"' is a palindrome");
        }else{
            System.out.println("The word '"+initial+"' is not a palindrome");
        }

        scanner.close();
    }

}
