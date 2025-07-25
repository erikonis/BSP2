package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = scanner.nextInt();

        int first = 1;
        int second = 1;
        int nth = 0;

        for (int i = 1; i <= n; i++) {
            if(i == 1 || i == 2){
                System.out.print("1 ");
            }else{
                nth = first-1 + second*2;
                second = first;
                first = nth;
                System.out.print(nth+" ");
            }

        }
        scanner.close();
    }
}
