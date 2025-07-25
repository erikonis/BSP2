import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Statistics {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Integer> numbers = new ArrayList<Integer>();
    static int num;
    public static void main(String[] args) {
        getNumbers();
    }
    private static ArrayList<Integer> getNumbers(){
        do{
            System.out.println("Please input a number :");
            num = scanner.nextInt();
            numbers.add(num);
        }while(num != 0);
        if(num == 0){
            numbers.remove(numbers.size()-1);
            findMin(numbers);
            findMax(numbers);
            CalculateAverage(numbers);
        }
        return numbers;
    }
    private static int findMin(ArrayList<Integer> numbers) {
        int min = numbers.get(0);
        int n = numbers.size();
        for (int i = 1; i < n; i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        System.out.println("Min value : " + min);
        return min;
    }

    private static int findMax(ArrayList<Integer> numbers) {
        int max = numbers.get(0);
        int n = numbers.size();
        for (int i = 1; i < n; i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.println("Max value : " + max);
        return max;
    }
    private static int CalculateAverage(ArrayList<Integer> numbers){
        int n = numbers.size() - 1;
        int av = (numbers.get(n))/n;

        System.out.println("Average : " + av);
        return av;
    }
}

