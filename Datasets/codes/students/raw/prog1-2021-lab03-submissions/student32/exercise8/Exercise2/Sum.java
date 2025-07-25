package lu.uni.programming1.lab3.exercise8.Exercise2;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("input a positive number: ");
        int n = scanner.nextInt();
        if (n < 0){
            do {
                System.out.println("input incorrect: ");
                n = scanner.nextInt();
            } while(n < 0);
        }
        else {
            do { 
                double sum = n* (n+ 1) / 2;
                for (int i = 1; i<= n; i++){
                    System.out.println(i);
                }
            System.out.println(sum);
            break;
            } while (n > 0);
        }
        scanner.close();
    }
}
