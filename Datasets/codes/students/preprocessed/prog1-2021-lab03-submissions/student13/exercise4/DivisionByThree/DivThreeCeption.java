import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {

        //this is the same code i used in the second lab.
        //I didn't put a limitation on it in the second lab so 
        //even numbers that are bigger than 1000 could be used

        Scanner scanner = new Scanner(System.in);

		int number;
		int sumOfNumbers =0;
		System.out.println("Please put in the number you want to check: ");
		number = scanner.nextInt();

		while(number > 0)
		{
			sumOfNumbers =  sumOfNumbers + number%10;
			number = number/10;

			if(sumOfNumbers >=10)
			{
				int tmp1 = sumOfNumbers%10;
				int tmp2 = sumOfNumbers/10;
				sumOfNumbers = tmp1 + tmp2;
			}
		}

		switch(sumOfNumbers)
		{
			case 3, 6, 9:

			System.out.println("Yes the number you chose is divisible by 3!");
			break;

			default:
			System.out.println("The number you chose isn't divisible by 3!");
			break;
		}

		scanner.close();
    }
}
