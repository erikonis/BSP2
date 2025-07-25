package lu.uni.programming1.lab4.exercise3;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars=  new char[100];
        int pointer=0;
        while (true){
            System.out.print("Please enter the next char:");
            char Char = scanner.next().toCharArray()[0];
            System.out.println(Char);
            if (Character.toString(Char).equals("0")) {
                break;
            }
            chars[pointer] = Char;
            pointer++;
        }
        int forward= 0;
        int backward= pointer-1;
        while (backward > forward) {
            char forwardChar = chars[forward];
            char backwardChar = chars[backward];
            if (forwardChar != backwardChar) {
                System.out.println("No palindrome");
                return;
            }
            forward++;
            backward--;
        }
        System.out.println("Yes, palindrome");

    } 
    
}
