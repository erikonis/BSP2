package exercise3;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;


public class Statistics {public static void main(String[] args) {
    int i = 0;
    int integer = 1;
    int large = 0;
    int small = 2147483647;
    List<Integer> arrList = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);

    while (integer!=0) {
         System.out.print("Please enter an integer: ");
         integer = scanner.nextInt();
         if(integer!= 0){
            arrList.add(integer);
            small = Math.min(small, arrList.get(i));
            large = Math.max(large, arrList.get(i));
            i=i+1;
         }else if(integer==0){
            break;
        }

    }
    
    Collections.sort(arrList); 

    Integer sum = arrList.stream()
       .mapToInt(Integer::intValue)
       .sum();
    float average = sum/i;
   

    System.out.print("\nThe smallest element is " + small );
    System.out.print("\nThe largest element is " + large );
    System.out.println("\nThe average is " + average);
    scanner.close();
}
}