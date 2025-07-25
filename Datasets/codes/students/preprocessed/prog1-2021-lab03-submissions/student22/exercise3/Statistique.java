import java.util.ArrayList;
import java.util.Scanner;

public class Statistique {
    public static void main(String[] args) { 

        ArrayList<Integer> alnumbers = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number: ");

        int n = scanner.nextInt();

        while(n != 0){
            alnumbers.add(n);
            n = scanner.nextInt();
        }
 

        int min = alnumbers.get(0);
        int max = alnumbers.get(0);
        int sum = alnumbers.get(0);
            
        for (int i = 1; i < alnumbers.size(); i++) {
           if(min > alnumbers.get(i)){
            min = alnumbers.get(i);
           }
           if(max < alnumbers.get(i)){
            max = alnumbers.get(i);
           }
           sum += alnumbers.get(i);
        }
        double average = sum / alnumbers.size();
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + average);
        scanner.close();
    }
}
