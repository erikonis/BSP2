package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits
{
    static long num, sum;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
            System.out.println("Please input a number :");
            num = sc.nextLong();
        }
        if(sum % 3 == 0){
            System.out.println(sum + " is divisible by 3");
        }
        else {
            System.out.println(sum + " is not divisible by 3 !");
        }
    }
}
