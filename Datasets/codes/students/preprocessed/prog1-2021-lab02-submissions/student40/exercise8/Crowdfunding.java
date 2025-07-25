import java.util.Scanner;

public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int money = 0;
		String reward = "";

		System.out.print("The available amounts are 10€,20€,50€,100€,200€ and 500€ :");
		money = scanner.nextInt();

		switch (money) {
			case 500:
				reward = "Your reward is : Autograph of your professors– \nFive free lunches at the Food house";
				break; 
			case 200:
				reward = "Your reward is : Uni.lu Smartphone cover– \nKeychain I love Programming 1";
				break; 
			case 100:
				reward = "Your reward is : Uni.lu USB Stick of 128GB";
				 break; 
			case 50:
				reward = "Your reward is : Public display of your donation on Moodle";
				 break; 
			case 20:
				reward = "Your reward is : Your name in ASCII art";
				 break; 
			case 10:
				reward = "Your reward is : Coca Cola (instead of beer) with TAs";
				break;
			default:
				reward =  "You have selected a non-existent amount = Invalid amount ";
				break;
		}
		System.out.println(reward);

		scanner.close();
	}
}