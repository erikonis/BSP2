import java.util.Scanner;

public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insert donation amount (10/20/50/100/200/500): ");
		int value = scanner.nextInt();
		if ((value == 10) || (value == 20) || (value == 50) || (value == 100) || (value == 200) || (value == 500)){
			System.out.println("Backer Rewards Obtained for " +value+"€ donation:");
			if (value >= 10){
				System.out.println("- Beer with TAs");}
			if (value >= 20){
				System.out.println("- Your name in ASCII art");}
			if (value >= 50){
				System.out.println("- Public display of your donation on Moodle");}
			if (value >= 100){
				System.out.println("- Uni.lu USB Stick of 128 GB");}
			if (value >= 200){
				System.out.println("- Uni.lu Smartphone cover");
				System.out.println("- Keychain 'I love Programming 1'");}
			if (value == 500){
				System.out.println("- Autograph of your professors");
				System.out.println("- Five free lunches at the 'Food house'");}}
		else{System.out.println(value+"€ donations are not allowed!");}

		scanner.close();
	}
}