package lu.uni.programming1.lab3.exercise6;

import java.util.Scanner;

public class GuessIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int random=(int)(Math.random()*99)+1;

        int n=0;

        while(n!=random){
            n=scanner.nextInt();
            if(random-n>0)
                System.out.println("Higher");
            else if(random-n<0)
                System.out.println("Lower");
        }
        System.out.println("YOU GUESSED IT!!!");

        scanner.close();
    }
}
