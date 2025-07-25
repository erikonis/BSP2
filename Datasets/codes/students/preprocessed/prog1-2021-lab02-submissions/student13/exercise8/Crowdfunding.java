import java.util.Scanner;

public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int money;

		System.out.println("Please give us some money so you can get a price: ");
		money = scanner.nextInt();

		switch(money)
		{
			case 10:
			System.out.println("Beer with TAs");
			break;

			case 20:
			System.out.print("Your name in ASCII art \nBeer with TAs");
			break;

			case 50:
			System.out.println("Public display of your donation on Moodle\nYour name in ASCII art \nBeer with TAs");
			break;

			case 100:
			System.out.println("Uni.lu USB Stic of 128GB\nPublic display of your donation on Moodle\nYour name in ASCII art \nBeer with TAs");
			break;

			case 200:
			System.out.println("Uni.lu Smartphone cover\nKeychain 'I love Programming 1'\nUni.lu USB Stic of 128GB\nPublic display of your donation on Moodle\nYour name in ASCII art \nBeer with TAs");
			break;

			case 500:
			System.out.println("Autograph of your professors\nFive free lunches at the 'Food house'\nUni.lu Smartphone cover\nKeychain 'I love Programming 1'\nUni.lu USB Stic of 128GB\nPublic display of your donation on Moodle\nYour name in ASCII art \nBeer with TAs");
			break;

			default:
			System.out.println(money + "€ donations are not allowed!\nAutograph of your professors\nFive free lunches at the 'Food house'\nUni.lu Smartphone cover\nKeychain 'I love Programming 1'\nUni.lu USB Stic of 128GB\nPublic display of your donation on Moodle\nYour name in ASCII art \nBeer with TAs");
			break;
		}

		scanner.close();
	}
}