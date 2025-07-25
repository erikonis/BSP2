package lu.uni.programming1.lab3.exercise8.ex1;
import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        float d = 0;
        System.out.println("enter value of X, Y and d");
        float X = scanner.nextFloat();
        float Y = scanner.nextFloat(); 
        d = scanner.nextFloat();
        for (float i=X; i<Y+1; i=i+d){
            System.out.println(i);
        }
    scanner.close();
    }
}
