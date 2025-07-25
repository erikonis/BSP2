package lu.uni.programming1.lab4.exercise4;

import java.util.Scanner;
import java.util.Vector;

public class DotProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>();

        System.out.println("Enter how many dimensions both vectors have: ");
        int n = scanner.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.println("Please enter the coordinate number "+(i+1)+" :");
            v1.add(scanner.nextInt());
        }

        for(int i=0;i<n;i++)
        {
            System.out.println("Please enter the coordinate number "+(i+1)+" :");
            v2.add(scanner.nextInt());
        }

        int dotproduct=0;

        for(int i=0;i<n;i++)
        {
            dotproduct += Integer.valueOf(v1.get(i).toString()) * Integer.valueOf(v2.get(i).toString());
        }

        System.out.println("The doct product between both vectors is "+dotproduct);

        scanner.close();
    }
}
