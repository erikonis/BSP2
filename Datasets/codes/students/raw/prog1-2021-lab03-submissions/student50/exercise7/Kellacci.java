package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Give an integer n:");
	    int n=sc.nextInt();
	    int a=1;int b=1;
		if(n<3){
			System.out.println("The '"+n+"'-th number of the Kellacci sequence is: 1");
		}else{
			int kell;int i=3;
            System.out.println("The Kellacci sequence K until the "+n+"th term K"+n +" is: ");
			while(i<=n){
				kell=(a-1)+(b*2);
				b=a;a=kell;
				i++;
                System.out.println("K"+(i-1)+" = "+kell);
			}
			
		}
		sc.close();
	}
}
