import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number to check if it's divisible by 3: ");
        long num = scanner.nextLong();
        long temp = num;
        long sum = 0;
        do{sum = 0;
            while (temp != 0){
            sum = sum + (temp%10);
            temp = temp / 10;}
            temp = sum;
        }while(sum >= 10);
        sum = temp;
        int sumint = (int)temp;
        String fin;
        fin = switch(sumint){
            case 3, 6, 9 -> " is divisible by 3";
            case 0 -> " is technically divisible by 3";
            default -> " is not divisible by 3";
        };

        System.out.println("The number "+num+""+fin);
        scanner.close();
    }
}