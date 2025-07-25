import java.util.Scanner;

import org.w3c.dom.css.Counter;
public class Kellacci {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n= scanner.nextInt();
        int result=1;
        int K1=1;
        int K2=1;
        int Counter=3;
        if(n<3){
            System.out.println("1");
            return;
        }
        while(Counter<=n){
            K1=K2;
            K2=result;
            result= K2 - 1 + K1 * 2;
            Counter++;
        } 
        System.out.println(result);
    }
}
