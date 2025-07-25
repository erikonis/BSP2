package lu.uni.programming1.lab4.exercise3;
import java.util.*;
public class Palindrome {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        ArrayList<Character> anArray = new ArrayList<Character>();
        String zeroinput = "N";
        char ifEnd = 0 ;
        char inextnum ;
    
    // while(zeroinput == "N")
    do
        {  
            System.out.println("Enter a Letter or 0 to stop: ");
             inextnum = console.next().charAt(0);
    //inextnum = console.next();
        if ( inextnum == '0') {zeroinput = "Y";}
        else{anArray.add(inextnum);}
        }
        while(zeroinput == "N");
    int Strlength = anArray.size();
    boolean isPalindrome = true;

    for(int i=0;i<Strlength/2;i++) {
                if(anArray.get(i)!=anArray.get(Strlength-1-i)) {
                    isPalindrome = false;
                    break;
                }
            }
    if(isPalindrome) {
                System.out.println("String is Palindrome.");
            } else {
                System.out.println("String is not Palindrome.");
            }
            }
    }

