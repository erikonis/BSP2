import java.util.Scanner;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class Kellaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer number : ");
        int n = scanner.nextInt();
        List<Integer> arrList = new ArrayList<Integer>();
        int k = 1;
        arrList.add(k);
        
        for(int i = 2; i <= n ;++i){
            arrList.add(k);
            k = (arrList.get(i-1)-1) + (arrList.get(i-2)*2);
        }
        Collections.sort(arrList);
        System.out.print("List of Kellacci sequence "+ arrList);
        scanner.close();
    }
}
