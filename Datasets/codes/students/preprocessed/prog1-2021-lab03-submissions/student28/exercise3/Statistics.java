import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class Statistics {

    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        double average = 0;
        int max = 0;
        int min = 0;
        System.out.println("Enter sequence of numbers and 0 to stop");
        // create an array list to store the input
        // array list has been selected as it allows for dynamic access
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        // capture user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while (number != 0) {
            // add the value to the array list
            listOfNumbers.add(number);
            System.out.println("Enter sequence of numbers and 0 to stop");
            number = input.nextInt();
        }
        // after hitting the condition let's do our statistics
        // calculate the average
        int items = listOfNumbers.size();
        for (int i = 0; i < items; i++) {
            sum = sum + listOfNumbers.get(i);
        }
        average = sum / items;
        System.out.println("The sum is " + sum + " and the average is " + average);
        // lets sort the list to get the min and max
        Collections.sort(listOfNumbers);
        min = listOfNumbers.get(0);
        max = listOfNumbers.get(items - 1);
        System.out.println("The max is " + max + " and the min is " + min);
        System.out.println("The sum is " + sum + " and the average is " + average);
    }

}
