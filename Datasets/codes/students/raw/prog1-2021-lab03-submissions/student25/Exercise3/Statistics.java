package lu.uni.programming1.lab3.Exercise3;

import java.util.Scanner;


public class Statistics {

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 0, total = 0;
            int largest = n, smallest = n;
           
            //loop
            while (true) {
                n = sc.nextInt();
                
                if (n == 0) {
                    break;
                }
                total += n;
                count++;
                
                
                if (n % 2 == 0) {
                } else {
                }
                largest = Math.max(n, largest);
                smallest = Math.min(n, smallest);
            }


            
         
            System.out.println("The largest integer: " + largest);
            System.out.println("The smallest integer: " + smallest);
            double average = total / (double) count;
            System.out.println("The average value is: " + average);

            sc.close();


        }
    
    
}
