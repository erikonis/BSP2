import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList alLetters = new ArrayList<>();

        System.out.println("Please give a letter:");
        String a = scanner.nextLine();

        String originalWord = "";
        String wordBackwards = "";

        while(!a.equals("0")){

            System.out.println("Please give a letter:");
            alLetters.add(a);

            a = scanner.nextLine();

        }

        scanner.close();

        for(int i = 0; i <= alLetters.size()-1; i++){
            originalWord = originalWord + alLetters.get(i);
        }

        for(int i = alLetters.size()-1; i >= 0; i--){
            wordBackwards = wordBackwards + alLetters.get(i);
        }

        if(originalWord.equals(wordBackwards)){
            System.out.println("\"" + originalWord + "\"" + " is a palindrome.");
        }else{
            System.out.println("\"" + originalWord + "\"" + " is not a palindrome.");
        }
        
    }
    
}
