package lu.uni.programming1.lab4.exercise1.Exercise1.Exercise1.Exercise3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Palindrome {
    public static void main(String[] args){
        ArrayList<Character> arrayList = new ArrayList<Character>();
        ArrayList<Character> reversedArrayList = new ArrayList<Character>();
        System.out.println("input character: ");
        Scanner scan = new Scanner(System.in);
        char a = '1';
        while (a != '0'){
            a = scan.next().charAt(0);
            arrayList.add(a);
        }
        scan.close();
        int index = arrayList.size() -1;
        arrayList.remove(index);
        reversedArrayList = arrayList;
        Collections.reverse(reversedArrayList);
        if (reversedArrayList == arrayList){
            System.out.println("Is a palindrome");
        }
        else {
            System.out.println("Is not a palindrome");
        }
    }
}
