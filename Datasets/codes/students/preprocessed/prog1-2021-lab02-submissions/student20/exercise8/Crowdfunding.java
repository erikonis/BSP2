import java.util.Scanner;

public class Crowdfunding {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the number that you are about to donnate (The available amounts are 10, 20, 50, 100, 200 and 500.");
		int donation = scanner.nextInt();
		String text;
		switch (donation) {
            case 10:  text = "Beer with TAs";
                     break;
            case 20:  text = "Your name in ASCII art";
                     break;
            case 50:  text = "Public display of your donation on Moodle";
                     break;
            case 100:  text = "Uni.lu USB Stick of 128GB";
                     break;
            case 200:  text = "– Uni.lu Smartphone cover \n– Keychain \"I love Programming 1\"";
                     break;
            case 500:  text = "– Autograph of your professors \n– Five free lunches at the \"Food house\"";
                     break;
            default: text = donation + "donations are not allowed!";
                     break;
        }
		System.out.println("You will obtain :\n"+text);
		scanner.close();
	}
}