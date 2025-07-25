import java.util.Scanner;
public class XtoY {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x,y,b;
        x = scanner.nextInt();
        y = scanner.nextInt();
        b = scanner.nextInt();
        
        for (int i = x ; x <= y; x += b){
                System.out.println(x);
        }
        scanner.close();
    }
}

