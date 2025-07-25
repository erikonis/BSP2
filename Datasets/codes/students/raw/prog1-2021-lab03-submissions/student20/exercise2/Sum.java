package lu.uni.programming1.lab3.exercise2;

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a POSTIVE integer (superior to 1):");
        Integer number = -1;
        while(number < 1){
            number = scanner.nextInt();
        }
        int result = 1;
        for (int I = number; I > 1; I--){
            result = result + I;
        }
        System.out.println(result);

        scanner.close();
    }

}
