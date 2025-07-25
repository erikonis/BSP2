package lu.uni.programming1.lab3.exercise8.Exercise3;
import java.util.Scanner;
import java.util.ArrayList;
public class Statistic {
    
    public static void main(String[] args){
        System.out.println("input number: ");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int u = 1;

        while(u != 0){
            System.out.println("input new number: ");
            u = scan.nextInt();
            arrayList.add(u);   
        }
        int min = arrayList.get(0);
        int max = arrayList.get(0);

        for (int i = 1; i < arrayList.size()-1; i++) {
            if (min > arrayList.get(i)){
                min = arrayList.get(i);
            }
        }
        for (int i = 1; i < arrayList.size(); i++) {
            if (max < arrayList.get(i)){
                max = arrayList.get(i);
            }
        }
        int sum = arrayList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);
        scan.close();
    } 
}
