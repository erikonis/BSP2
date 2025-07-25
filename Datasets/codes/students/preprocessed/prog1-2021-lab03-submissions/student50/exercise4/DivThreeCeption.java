import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please a number to be checked if it's divisible by 3: ");
		long num = sc.nextInt();
		long tmp,sum = 0;

		while (num> 0){

			tmp = num % 10;
			sum = sum + tmp;
			num = num /10;

		}
        tmp = 0;
        num = sum;
    
        do{
            tmp = sum % 10;
            num = sum / 10;
            sum = tmp + num;
            
        }while (sum>9);
        
        System.out.println("Sum: "+sum);

        String result;
        switch((int) sum){
            case 3: case 6: case 9: result = "The sum of your number is divisible by 3";
            break;
            default: result = "The sum of your number is not divisible by 3";
        }


		System.out.print(result);

		sc.close();
	}
}
