package lu.uni.programming1.lab3.exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class Statistics {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> alInt = new ArrayList<>();
        boolean is0=false;
        while(is0 == false){
            System.out.println("Please enter a number :");
            int temp = scanner.nextInt();
            if(temp == 0){
                is0 = true;
                scanner.close();
            }
            else{
                alInt.add(temp);
            }
        }
        int smallest = alInt.get(0);
        int biggest = alInt.get(0);
        int sum = 0;
        for (int i : alInt) {
            if(i<smallest){
                smallest = i;
            }
            if(i>biggest){
                biggest = i;
            }
            sum += i;
        }
        int average = sum/alInt.size();
        System.out.println("This is the smallest number : " + smallest);
        System.out.println("This is the biggest number : " + biggest);
        System.out.println("This is the average number : " + average);
    }
}
