package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer :");
        int nbr = scanner.nextInt();
        int choice = 0;
        int check = 0;
        do{ 
            check = 0;
            while(nbr > 0){
                check = check + (nbr % 10);
                nbr = nbr/10;
                System.out.println(check);
            }
        }while(check >10);  

        if(check%3 == 0){
            choice = 1;
        }else{
            choice = 2;
        }
        
        switch(choice){
            case 1:
                System.out.println("divisible by 3");
                break;
            case 2:
                System.out.println("not divisible by 3");
                break;
            
        }
        scanner.close();
    }
    
}
