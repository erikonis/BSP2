import java.util.Scanner;

public class Kellacci {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please give a number:");
        int number = scanner.nextInt();

        scanner.close();

        if(number < 3){
            number = 3;
        }

        int endNumber = 0;
        int k1 = 1;
        int k2 = 1;

        for(int i = 2; i < number; i++){
            endNumber = (k1 - 1) + (k2 * 2);
            k2 = k1;
            k1 = endNumber;
        }

        System.out.println("The Kellacci sequence is " + endNumber + ", when n equals " + number + ".");
    }
}
