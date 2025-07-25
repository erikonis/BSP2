import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {

        int lN, sN, num, x, sum, count;
        double average;

        lN = 0;
        sN = 0;
        sum = 0;
        count = 0;
        average = 0;
        num = 1;
        x = 1;
        Scanner scanner = new Scanner(System.in);

        while (num != 0) {
            System.out.println(x);
            x++;
            sum = sum + x + num;
            num = scanner.nextInt();
            count++;
            average = sum / (count * 2);
            if (num > lN) {
                lN = num;
            } 
            if (num < sN) {
                sN = num;
            }

            if (num == 0) {
                System.out.println("The largest number is: " + lN);
                System.out.println("The smallest number is; " + sN);
                System.out.println("The average is: " + average);
            }
        }

        scanner.close();
    }

}
