import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n;
    int min = 0;
    int max = 0;
    double average = 0;
    int qtdNums = 0;
    do {
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        if (n <= min && n != 0)
        min = n;
        if (n >= max && n != 0)
        max = n;
        System.out.println("Your number is " + n);
        average = average + n;
        qtdNums++;
    } while (n != 0);
    if (n == 0) {
        System.out.println("The smallest number is: " + min);
        System.out.println("The largest number is: " + max);
        System.out.println("The average of all the numbers is: " + average / (qtdNums - 1));
    }
    scanner.close();
    }
}
