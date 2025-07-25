import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        char[] myArray = new char[count];
        
        do {
            count ++;
            for (int i = 0; i < myArray.length; i++)
            {
                System.out.println("Enter a letter (or 0 to stop): ");
                myArray[i] = scanner.next().charAt(0);
            }
            }
         while (myArray[i] != 0);

      
        int size = myArray.length;
        char[] original = new char[myArray.length];
        for (int x = 0; x < myArray.length; x++) {
		 original[x] = myArray[x];
         System.out.println(original[x]);
        }
        
  
        for (int i = 0; i < size; i++) {
           char temp = myArray[i];
           myArray[i] = myArray[size-i-1];
           myArray[size-i-1] = temp;
           System.out.println(myArray[i]);
        }

       if (myArray==original){
         System.out.println("The word is PALINDROME!");
        }
        else {System.out.println("The word is NOT PALINDROME!");
        }

        scanner.close();



    }
    
}
