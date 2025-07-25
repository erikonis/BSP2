package lu.uni.programming1.lab3.exercise3;

import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter multiple integers. If you wish to stop, type in 0.");

            int n = scanner.nextInt();
                if (n == 0)
                {
                    System.out.println("Smallest number = \t0");
                    System.out.println("Biggest number = \t0");
                    System.out.println("Average = \t\t0");
                    System.exit(0);
                }
            int sum = 0;
            int counter = 0;
            int high = n;
            int low = n;

            while (n != 0)
                {
                    sum = sum + n;
                    counter++;

                    if (n > high)
                        {
                            high = n;
                        }
                    
                    if (n < low)
                        {
                            low = n;
                        }
                        
                    n = scanner.nextInt();
                }
        
        scanner.close();

        double average = sum/counter;

        System.out.println("Smallest number = \t" + low);
        System.out.println("Biggest number = \t" + high);
        System.out.println("Average = \t\t" + average);

    }
    
}
