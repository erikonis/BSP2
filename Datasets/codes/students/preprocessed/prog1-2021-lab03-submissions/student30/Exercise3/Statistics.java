import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = 0;
        int min = number;
        int max = number;

        while(number != 0){
            sum = sum + number;
            if(min>number){
                min = number;
            }
            number = scanner.nextInt();
            if(max<number){
                max = number;
            }
        }

        
        scanner.close();

        System.out.println("Sum: " + sum + ", min: " + min + ", max: " + max);
    }
}
