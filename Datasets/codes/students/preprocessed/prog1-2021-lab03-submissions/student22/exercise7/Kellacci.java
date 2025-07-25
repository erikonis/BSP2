import java.util.Scanner;

public class Kellacci{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int number = scanner.nextInt();
        if (number > 2){
            int Kn1 = 1;
            int Kn2 = 1;
            
            for (int i = 0; i <= number; i++) {
                int Kn = Kn1 - 1  + Kn2 * 2;
                Kn2 = Kn1;
                Kn1 = Kn;
                System.out.println(Kn);
            }
        }
        scanner.close();
    }
}
