package lu.uni.programming1.lab3.exercise1;
import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) { 
        System.out.println("Enter the first number:");

        Scanner number1 = new Scanner(System.in);

        System.out.println("Enter the second number:");

        Scanner number2 = new Scanner(System.in);

        int first= number1.nextInt();
        int second= number2.nextInt();

        for(int i = first; i <= second; i++){
            System.out.println(i);
        }
        number1.close();
        number2.close();
    }
}
