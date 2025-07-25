import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = new ArrayList<>();
        double average = 0;
        int number = 1;

        while (number > 0) {

            System.out.println("Please enter your number to calculate the average:");
            number = scanner.nextInt();
            if (number > 0) {
                integerList.add(number);
            }

        }

        System.out.println("the smallest number is:");
        int smallest = integerList.get(0);
        for (int i = 1; i < integerList.size(); i++) {
            if (smallest > integerList.get(i)) {
                smallest = integerList.get(i);
            }
        }
        System.out.println(smallest);

        System.out.println("the largest number is:");
        int largest = integerList.get(0);
        for (int i = 1; i < integerList.size(); i++) {
            if (largest < integerList.get(i)) {
                largest = integerList.get(i);
            }
        }
        System.out.println(largest);

        System.out.println("the average of all the numbers:");
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            sum = sum + integerList.get(i);
        }
        average = sum / integerList.size();
        System.out.println(average);
        scanner.close();

    }

}
