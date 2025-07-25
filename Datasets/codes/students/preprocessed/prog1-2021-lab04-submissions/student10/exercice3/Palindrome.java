import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Word: ");
        String word= scanner.next(), drow="";
        char ch;

        scanner.close();
        
        for (int i=0; i<word.length(); i++){
            ch= word.charAt(i);
            drow= ch+drow; 
      }
        if(word.equals(drow))
            System.out.println("It´s a palindrome");
        else
            System.out.println("It´s NOT a palindrome");

    }
    

}
