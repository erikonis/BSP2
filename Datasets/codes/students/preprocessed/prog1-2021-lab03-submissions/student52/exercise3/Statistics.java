import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> seq = new ArrayList<>();
        int n = 0;
        int sum = 0;
        int average = 0;

        System.out.println("Enter numbers for a sequence, number 0 will stop the sequence:");
        do{
            n = scanner.nextInt();
            seq.add(n);
        }while(n!=0);
        seq.remove(seq.size()-1);
        

        int max = Collections.max(seq);
        int min = Collections.min(seq);

        for(int i=0; i<seq.size(); i++){
            sum+=seq.get(i);
        }

        average = sum/seq.size();

        System.out.println("--------");

        System.out.println("The largest number in the sequence is: "+max+"\nThe smallest number in the sequence is: "+min+"\nThe average is: "+average);

        scanner.close();
    }
    
}
