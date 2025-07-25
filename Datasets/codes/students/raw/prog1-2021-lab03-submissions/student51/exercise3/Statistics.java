package lu.uni.programming1.lab3.exercise3;

import java.util.*;

public class Statistics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> stats = new ArrayList<>();

        System.out.println("Enter the numbers (0 will stop the count):");
        int n;
        do{
            n = sc.nextInt();
            stats.add(n);
        }
        while(n != 0);
        stats.remove(stats.size()-1);

        // Get smallest
        int smallest = stats.get(0);
        for(int j = 0; j <stats.size()-1; j++){
            if(smallest > stats.get(j)){
                smallest = stats.get(j);
            }
        }
        System.out.println("Smallest: " + smallest);

        // Get largest
        int largest = stats.get(0);
        for(int i = 0; i <stats.size(); i++){
            if(largest < stats.get(i)){
                largest = stats.get(i);
            }
        }
        System.out.println("Largest: " + largest);

        // Get average
        int sum = 0;
        for(int k = 0; k < stats.size(); k++){
            sum += stats.get(k);
        }
        System.out.println("Average: " + sum/stats.size());

        sc.close();
    }

}
