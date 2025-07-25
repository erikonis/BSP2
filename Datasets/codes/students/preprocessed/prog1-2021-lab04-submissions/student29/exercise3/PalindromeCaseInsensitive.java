import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList alLetters = new ArrayList<>();

        System.out.println("Please give a letter:");
        String a = scanner.nextLine();

        String originalWord1 = "";
        String originalWord2 = "";
        String wordBackwards = "";

        while(!a.equals("0")){
            originalWord2 = originalWord2 + a;
            a = a.toLowerCase();

            System.out.println("Please give a letter:");
            alLetters.add(a);

            a = scanner.nextLine();
        }

        scanner.close();

        for(int i = 0; i <= alLetters.size()-1; i++){
            originalWord1 = originalWord1 + alLetters.get(i);
        }

        for(int i = alLetters.size()-1; i >= 0; i--){
            wordBackwards = wordBackwards + alLetters.get(i);
        }

        if(originalWord1.equals(wordBackwards)){
            System.out.println("\"" + originalWord2 + "\"" + " (all letters in lower cases: " + "\"" + originalWord1 + "\"" + ")" + " is a palindrome.");
        }else{
            System.out.println("\"" + originalWord2 + "\"" + " (all letters in lower cases: " + "\"" + originalWord1 + "\"" + ")" + " is not a palindrome.");
        }
    }
}
