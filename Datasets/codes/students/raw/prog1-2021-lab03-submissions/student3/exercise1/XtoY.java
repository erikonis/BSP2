package lu.uni.programming1.lab3.exercise1;
import java.util.Scanner;
public class XtoY {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("x");
        int x=scanner.nextInt();
        System.out.println("y");
        int y=scanner.nextInt();
        System.out.println("d");
        int d=scanner.nextInt();
        if(y<x){
            System.out.println("Error");
            return;
        }
        while(x<=y){
            System.out.println(x);
            x=x+d;   
        }
        }  
}
