import java.util.Scanner;

public class Crowdfunding {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount you wish to donate: ");
		int donation = scanner.nextInt();
		scanner.close();
		System.out.println("For " + donation + " EUR, your rewards are:");
		switch (donation) {
		case 500:
			System.out.println("- Five free lunches at the \"Food house\"");
			System.out.println("- Autograph of your professors");
		case 200:
			System.out.println("- Keychain \"I love Programming 1\"");
			System.out.println("- Uni.lu Smartphone cover");
		case 100:
			System.out.println("- Uni.lu USB Stick of 128GB");
		case 50:
			System.out.println("- Public display of your donation on Moodle");
		case 20:
			System.out.println("- Your name in ASCII art");
		case 10:
			System.out.println("- Beer with TAs");
			break;
		default:
			System.out.println("- This amount is not available!");
			break;
		}
	}
}