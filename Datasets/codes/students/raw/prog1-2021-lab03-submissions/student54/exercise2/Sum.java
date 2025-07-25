package lu.uni.programming1.lab3.exercise2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        
        int n=0, i = 1, sum = 0, tmp = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number for n:");
        
        while(scanner.hasNext()){
            n=scanner.nextInt();
            if(n<0){
                System.out.println("Please enter a valid number for n:");
            }else{
                break;
            }
        }
        
        while (i <= n) {
            tmp = (i * (i + 1)) / 2;
            sum = sum + tmp;
            i++;
        }
        System.out.println(sum);
        scanner.close();
    }
}
