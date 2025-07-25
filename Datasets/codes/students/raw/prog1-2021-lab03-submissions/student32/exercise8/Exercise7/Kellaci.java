package lu.uni.programming1.lab3.exercise8.Exercise7;

import java.util.Scanner;
public class Kellaci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        if (count > 0){
            int n1 = 0, n2 = 1, n3, i;
            System.out.println(n1 + "\n" + n2);
            for (i = 2; i < count; ++i){
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3; 
                System.out.println(n3);
            }
        }
        scanner.close();
    }
}
