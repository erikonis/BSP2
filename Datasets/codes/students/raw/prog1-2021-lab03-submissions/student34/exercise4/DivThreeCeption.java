package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption
{
    static int num, sum;
    public static void main(String[] args) {
        Ask();
    }
    public static int Ask(){
        for(int i = 0; i < 4; i++) {
            System.out.println("Please input a number :");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            num += sum;
        }
        DivBy3(sum);
        return sum;
    }

    public static void DivBy3(int num)
    {
        while (num >= 0)
        {
            num -= 3;
        }

        switch (num){
            case -3 :
                System.out.println("Is divisible by 3.");
                break;
            default:
                System.out.println("Is not divisible by 3");
                break;
        }
    }
}

