package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        long value = scanner.nextLong();
        long sum = 0;
        while (value > 0) {

			sum = sum + value % 10;

			value = value / 10;
		}
        if(sum%3 == 0){
            System.out.println("Divisible by 3!");
        }else{
            System.out.println("Not divisible by 3!");
        }
        scanner.close();
    }
}
