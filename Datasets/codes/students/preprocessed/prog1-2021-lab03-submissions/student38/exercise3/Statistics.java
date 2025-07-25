import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Statistics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sequence = new ArrayList<>();
        int number = 0;
        int sum = 0;
        int average = 0;

        System.out.println("Please enter a number for sequence, if the user enters 0, the sequence will stop ");
        do {
            number = sc.nextInt();
            sequence.add(number);

        } while (number != 0);
        sequence.remove(sequence.size() - 1);

        int max = Collections.max(sequence);
        int min = Collections.min(sequence);

        for (int i = 0; i < sequence.size(); i++) {
            sum += sequence.get(i);
        }

        average = sum / sequence.size();

        System.out.println("You entered 0 and the sequence stopped ");
        System.out.println("The largest number of sequence is: " + max + " The smallest number of sequence is " + min
                + " The average number of sequence is: " + average);

        sc.close();
    }

}
