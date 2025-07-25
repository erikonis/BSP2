package lu.uni.programming1.lab3.exercise4;


import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number: ");
        long number = scanner.nextLong();
        int sum = 0;
        while(number > 0){
             sum +=  number % 10;
             number = number/10;
             while(sum > 9){
                 if (number == 0){
                     number = sum;
                     sum = 0;
                 }
                sum +=  number % 10;
                number = number/10;
             }
        }
        switch (sum%3) {
            case 0:
            System.out.println("The number is divisble by 3");
                break;
        
            default:
            System.out.println("The number is not divisble by 3");
                break;
        }
       
        
        scanner.close();
    }
}





