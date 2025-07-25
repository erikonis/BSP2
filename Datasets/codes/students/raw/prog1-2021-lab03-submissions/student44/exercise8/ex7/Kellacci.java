package lu.uni.programming1.lab3.exercise8.ex7;
import java.util.*;
public class Kellacci {
    public static void main(String[] args) {

        int count, num1 = 1, num2 = 1;
        System.out.println("How may numbers you want in the sequence:");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        scanner.close();
        System.out.print("Kellacci Series of "+count+" numbers: \n ");

        int i=1;
        while(i<=count)
        {
            System.out.print("N"+i+":"+num1+"\n ");
            int fonction = (num2-1)+(num1*2);
            num1 = num2;
            num2 = fonction;
            i++;
        }
    }
}
