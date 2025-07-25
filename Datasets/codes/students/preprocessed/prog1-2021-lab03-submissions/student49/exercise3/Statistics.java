import java.util.Scanner;

import java.util.ArrayList;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> alInt = new ArrayList<>();

        int lastInput=1;
        while(lastInput!=0)
        {
            System.out.println("Please enter a new number:");
            int temp = scanner.nextInt();
            lastInput = temp;
            if(lastInput!=0) alInt.add(lastInput);
        }

        int min = alInt.get(0);
        for(int i=1;i<alInt.size();i++)
        {
            if(alInt.get(i)<min) min = alInt.get(i);
        }
        System.out.println("The smallest number is: "+min );

        int max = alInt.get(0);
        for(int i=1;i<alInt.size();i++)
        {
            if(alInt.get(i)>max) max = alInt.get(i);
        }
        System.out.println("The largest number is: "+max );

        double sum = 0;
        for(int i=0;i<alInt.size();i++)
        {
            sum += alInt.get(i);

        }
        double average = sum/alInt.size();
        System.out.println("The average is: "+average );

        scanner.close();
    }
}
