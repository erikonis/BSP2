package lu.uni.programming1.lab4.exercise4;

import java.util.Scanner;
import java.util.Vector;

public class Norm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vector<Integer> v = new Vector<>();

        System.out.println("Enter how many dimensions the vector has: ");
        int n = scanner.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.println("Please enter the coordinate number : "+(i+1));
            v.add(scanner.nextInt());
        }

        int normSquared = 0;

        for(int i=0;i<v.size();i++)
        {
            normSquared += Math.pow(Integer.valueOf(v.get(i).toString()),2);
        }

        double norm = Math.sqrt(normSquared);
        
        System.out.println("The norm is "+String.format("%.2f", norm));

        scanner.close();

    }
}
