import java.util.Scanner;

public class Crowdfunding {

	public static void main(String[] args) {

		int amount;
		String amountString;

		Scanner scanner = new Scanner(System.in);
		System.out.println("How much money do you want to donate? We accept 10€, 20€, 50€, 100€, 200€, 500€.");
		amount = scanner.nextInt();

			switch(amount) {

				amount = 10 :   
				amountString = "Beer with TAs";
			
				amount = 20 :	
				amountString = "Beer with TAs + Your name in ASCII art";


		}
		System.out.println(amountString);

		scanner.close();
	}
}