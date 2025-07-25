package lu.uni.programming1.lab3.exercise1;
import java.util.Scanner;
public class  NtoM {
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("n");
    int n=scanner.nextInt();
    System.out.println("m");
    int m=scanner.nextInt();
    if(m<n){
        System.out.println("Error");
        return;
    }
    while(n<=m){
        System.out.println(n);
        n++;   
    }
    }  
}
