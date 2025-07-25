package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number that you wish to know if it´s divisble by 3 :");

        long n=scanner.nextLong();

        long sum=0;

        while(n!=0){
            sum = sum + n%10;
            n= n/10;
        }
        System.out.println(sum);
        while(sum>10){
            n=sum;
            sum=0;
            while(n!=0){
                sum = sum + n%10;
                n= n/10;
            }
            System.out.println(sum);
        }
        scanner.close();

        switch((int) sum){
            case 3:
                System.out.println("Is divisible by 3");
                break;
            case 6:
                System.out.println("Is divisible by 3");
                break;
            case 9:
                System.out.println("Is divisible by 3");
                break;
            default:
                System.out.println("Not divisble by 3");
        }
    }
}
