import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number to check if it's divisible by 3: ");
        long num = scanner.nextLong();
        long temp = num;
        long sum = 0;
        while (temp != 0){
            sum = sum + (temp%10);
            temp = temp / 10;}
        if ((sum%3 == 0)&&(sum != 0)){System.out.println("The number "+num+" is divisible by 3");}
        if (sum == 0){System.out.println("The number "+num+" is technically divisible by 3");}
        if (sum%3 != 0){System.out.println("The number "+num+" is not divisible by 3");}
        scanner.close();
    }
}
