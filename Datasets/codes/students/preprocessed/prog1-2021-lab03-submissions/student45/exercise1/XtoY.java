import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter starting decimal number: ");
        float x = scanner.nextFloat();
        System.out.println("Please enter ending decimal number: ");
        float y = scanner.nextFloat();
        System.out.println("Please enter decimal step: ");
        float d = scanner.nextFloat();

        for (float seq=x ; seq<=y ; seq+=d) {

            float seqdecimal = seq;

            System.out.println("Decimal sequence: ");
    
            System.out.printf("%.2f" + "\n", seqdecimal);
        }

        scanner.close();
        
    }
}
