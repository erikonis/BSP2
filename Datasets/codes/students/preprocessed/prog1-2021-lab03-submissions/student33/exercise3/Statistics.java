import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter numbers, with 0 to end");
       //creating a list.
        List<Integer> list = new ArrayList<>();

       int sum = 0;
        
        while (true) {
            int elements = scanner.nextInt();
            //calculating the sum.
          sum = sum + elements;
        
            if (elements ==0){

                break;
            
            }
             
            list.add(elements);
        } 
        Integer [] S = new Integer [list.size()];
        S = list.toArray(S);

        int smallest = S[0];
        int largest = S[0];
        
        for (int i = 1; i < S.length; ++i){
         if (S[i] < smallest)
           smallest = S[i];
         else if (S[i]> largest)
         largest = S[i];
        }

         System.out.println("smallest number = " + smallest);

         System.out.println("largest number = " + largest);
         //calculating the average.
         double average = sum/S.length;

         System.out.printf("the average = %.2f", average);
        
        
       
        scanner.close();

       
    }  
         
           
    }
 
