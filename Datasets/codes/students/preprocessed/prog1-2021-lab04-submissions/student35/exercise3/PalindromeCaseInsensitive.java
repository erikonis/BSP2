import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeCaseInsensitive {
    public static void main(String[] args) {
        
        //Scanner
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arr = new ArrayList<>();
        boolean condition1 = true;
    
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
            //while checking is covert everything to lowercase
            if((arr.get(i).toLowerCase()).equals(arr.get(size-i).toLowerCase()))
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

