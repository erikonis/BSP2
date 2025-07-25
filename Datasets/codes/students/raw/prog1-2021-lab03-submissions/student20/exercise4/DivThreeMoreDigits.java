package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer :");
        int nbr = scanner.nextInt();

        int check = 0;
        while(nbr > 0){
			check = check + (nbr % 10);
			nbr = nbr/10;
		}
        if(check%3 == 0){
            System.out.println("divisible by 3");
        }else{
            System.out.println("not divisible by 3");
        }
        
        scanner.close();
    }
    
}
