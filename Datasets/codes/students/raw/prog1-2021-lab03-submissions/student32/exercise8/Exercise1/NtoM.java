package lu.uni.programming1.lab3.exercise8.Exercise1;
import java.util.Scanner;
public class NtoM {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n,m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int i = n ; n <= m; n++){
                System.out.println(n);
        }
        scanner.close();
    }
}
