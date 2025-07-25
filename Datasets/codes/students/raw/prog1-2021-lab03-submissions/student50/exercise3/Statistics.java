package lu.uni.programming1.lab3.exercise3;

import java.util.Scanner;
import java.util.*;

public class Statistics {
    public static void main(String[] args){
         Scanner sc =new Scanner(System.in);
		
		System.out.println("Consecutively give positive integers; to stop type '0'.");
		int n;int sum = 0; double ref = 0;
		ArrayList<Integer> arrlist
            = new ArrayList<Integer>(1);
		do{
			n=sc.nextInt();
			arrlist.add(n);
		}while(n!=0);
		
		int l = arrlist.size() -1;
		//System.out.println(arrlist);

		arrlist.remove(l);
		//System.out.println(arrlist);
		l = arrlist.size()-1;
		for (int i=0;i<l+1;i++){
		sum = sum + arrlist.get(i);
		}
		double sum2 = sum;
		double l2 = l+1;
		ref = sum2 / l2;
		//System.out.println(sum);
		l = arrlist.size()-1;
		Collections.sort(arrlist);
		//System.out.println(arrlist);
		System.out.println("The largest number is: " + arrlist.get(l) );
		System.out.println("The smallest number is: " + arrlist.get(0) );
		System.out.printf("Your average is: %.2f ", ref);

		sc.close(); 
    }
  
}
