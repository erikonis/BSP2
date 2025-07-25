import java.util.Scanner;
public class XtoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter x :");
        Integer x = scanner.nextInt();
        System.out.println("Please enter y (which is greater than n) :");
        Integer y = x-1;
        while(y<x){
            y = scanner.nextInt();
        }
        System.out.println("Please enter d :");
        Integer d = scanner.nextInt();
        System.out.println("Integers between "+ x +" and "+ y);
        x = x - d;
        while(x < y){
            x = x + d;
            System.out.println(x);
        } 
    scanner.close();
    }
}
