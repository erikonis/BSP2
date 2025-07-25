package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;
public class Kellacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer :");
        int n = scanner.nextInt();
        int nbr = n;
        int itera = 2;
        int na = 1;
        int nb = 1;
        System.out.println("K1 = 1");
        System.out.println("K2 = 1");
        while(itera < nbr){
            n = (na-1)+(nb*2);
            nb = na;
            na = n;
            ++itera;
            System.out.println("K"+itera+" = "+n);      
        }      
    }
}
