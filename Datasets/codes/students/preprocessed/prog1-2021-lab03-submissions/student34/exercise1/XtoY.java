import java.util.Scanner;

public class XtoY {
    static float x,y,d,res;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("x = ?");
        x = sc.nextFloat();
        System.out.println(" y = ?");
        y = sc.nextFloat();
        System.out.println(" d= ?");
        d = sc.nextFloat();
        for (float i = x; x <= y; i++){
            res = x + d++;
            System.out.println(res  + "|");
        }
    }
}
