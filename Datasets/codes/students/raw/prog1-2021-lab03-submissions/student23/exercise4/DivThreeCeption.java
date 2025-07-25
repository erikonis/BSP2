package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input a number :");
        long nb = scan.nextLong();
        long nb2 = nb;

        long sum = nb;

        while (sum > 10){
            sum = 0;
            while (nb > 10){
                
                sum += nb%10;

                nb = nb/10;
            }   
            sum += nb;
            
            nb = sum;
        }

        

        if (nb == 3 || nb == 6 || nb == 9) {System.out.format("\nThe number %d is divisible by 3", nb2);}
        else {System.out.format("\nThe number %d is not divisible by 3", nb2);}


        scan.close();
        }
    }   

