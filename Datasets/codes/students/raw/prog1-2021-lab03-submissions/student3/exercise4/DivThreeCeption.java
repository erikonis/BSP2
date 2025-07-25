package lu.uni.programming1.lab3.exercise4;
import java.util.Scanner;
public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int firstdigit,sum,input = 0;
		sum=0;
		System.out.print("Enter the digit:");

	    input = scanner.nextInt();
		while(input>0){
		firstdigit= input % 10;
		sum = sum + firstdigit;
		input= input / 10;
		}
		while (sum>10){
        sum=sumofdigits(sum);
		}
		System.out.println("Sum of Digits: " + sum);
        switch(sum){
            case 3:
            case 6:
            case 9:
            System.out.println("Divisible By 3.");
            break;
            default:
            System.out.println("Not Divisible By 3.");
        }
		
		scanner.close();
	}
	public static int sumofdigits(int input){
		int sum=0;
		int firstdigit;
		while(input>0){
			firstdigit= input % 10;
			sum = sum + firstdigit;
			input= input / 10;
			}
			return sum;
	}

} 

