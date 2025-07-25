package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class NtoM {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter n: ");
        int first = scanner.nextInt();
        System.out.println("Please enter m: ");
        int second = scanner.nextInt();

        for (int seq=first ; seq<=second ; seq+=1) {

            int seqint = seq;
    
            System.out.println(seqint);
        }

        scanner.close();
    }
}
