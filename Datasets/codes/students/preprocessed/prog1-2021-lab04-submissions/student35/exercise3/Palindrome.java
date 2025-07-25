import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        //Scanner
        Scanner scanner = new Scanner(System.in);
        //I know ArrayList from my 1ier an do not understand the arr[] array
    
        ArrayList<String> arr = new ArrayList<>();
        boolean condition1 = true;
        System.out.println("Please enter a word (0 cancel the prozess):");
        while(condition1 != false)
        {
            arr.add(scanner.next());
            if((arr.get(arr.size()-1).equals("0")))
            {
                arr.remove((arr.get(arr.size()-1)));
                condition1 = false;
            }
        }
        boolean condition = false;
        int size = arr.size()-1;
        for(int i = 0; i<=arr.size()-1;i++)
        {
            if((arr.get(i)).equals(arr.get(size-i)))
            {
                condition = true;
            }
            else
            {
                condition = false;
                i = arr.size();
            }
        }
        if(condition == true)
        {
            System.out.println(arr.toString() + "is a palindrome");
        }
        else
        {
            System.out.println(arr.toString() + "is not a palindrome");
        }
        
        
        //scanner close
        scanner.close();
    }
}

