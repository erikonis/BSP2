import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class Statistics {  
    public static void main(String args[]) {
        
            Scanner console = new Scanner(System.in);
        // Initialise Array List, use the array list to store the input received from console
            ArrayList<Integer> anArray = new ArrayList<>();
            String zeroinput = "N";
        // Get input from the user, stop when 0 entered	
            do{  
                System.out.println("Enter a Number or 0 to stop: ");
                  int inextnum = console.nextInt();
            if (inextnum == 0){zeroinput = "Y";}
            else{anArray.add(inextnum);}
            }
            while 
            (zeroinput == "N");
        // Once data is received from the user, calculate Min, Max, Average using Arraylist functions
            float sum = 0;
            int total = 0;
            int avg = 0;
            for(int j = 0; j < anArray.size(); j++)
                {
                       total += anArray.get(j);
                        avg = total / anArray.size();
                }
        // Print output
          System.out.println("minimum : " + Collections.min(anArray));
          System.out.println("maximum: " + Collections.max(anArray));
          System.out.println("The Average IS:" + avg); 
              }
            

  		}
    
            
    
           
    

