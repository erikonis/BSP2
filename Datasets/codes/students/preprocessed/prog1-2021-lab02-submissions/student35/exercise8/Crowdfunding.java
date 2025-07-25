import java.util.Scanner;

public class Crowdfunding {
	static Scanner scanner = new Scanner(System.in);
	static int bal;
	static String rew;
	public static void main(String[] args) {
		AskTheUser();
		GetPledgeAmount(bal);
	}
	public static int AskTheUser(){
		System.out.println("Please enter the amount to pledge :");
		bal = scanner.nextInt();
		scanner.close();
		return bal;
	}
	public static void GetPledgeAmount(int bal){
		switch (bal){
			case 500:
				rew = "You got :\n– Autograph of your professors\n" +
						"– Five free lunches at the \"Food house\"";
			case 200:
				rew += "- Keychain\"I love Programming\"";
			case 100:
				rew += "- Uni.lu 128Go USB stick\n";
			case 50:
				rew += "- Public display of the donation on Moodle\n";
			case 20:
				rew += "- Your name in ASCII art\n";
			case 10:
				rew += "- Beer with TAs \n";
				break;
			default:
				throw new Error("Invalid donation !");
		}
		System.out.println(rew);
	}
}