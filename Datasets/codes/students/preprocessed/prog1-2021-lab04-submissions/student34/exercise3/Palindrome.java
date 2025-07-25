import java.util.Scanner;

public class Palindrome {
    static String __char, _char;
    static Scanner sc = new Scanner(System.in);
    static int len,forward = 0,mid,back;
    public static void main(String[] args) {
       AskUser();
    }
    private static String AskUser(){
        do{
            System.out.println("Please input a string :");
            _char += sc.next();
        }while(!__char.contains("0"));
        isPalindrome(_char);
        return _char;
    }
    private static boolean isPalindrome(String _char){
        len = _char.length();
        mid = len / 2;
        back = len - 1;
        while (back > forward){
            char forw = _char.charAt(forward++);
            char backw = _char.charAt(back--);
            if(forw !=backw){
                System.out.println("Is not a palindrome !");
                return false;
            }
        }
        System.out.println("Is a palindrome");
        return true;
    }
}
