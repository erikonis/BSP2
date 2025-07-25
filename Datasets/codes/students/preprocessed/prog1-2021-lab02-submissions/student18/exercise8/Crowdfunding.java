import java.util.Scanner;
public class Crowdfunding {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write your donation number");
		System.out.println("Your donate options are 10$,20$, 50$ 100$, 200$ and 500$");
        int donate = scanner.nextInt();
        switch (donate) {
            case 10:
                System.out.println("Your Reward will be a beer with tas");
                break;
            case 20:
                System.out.println("Your Reward will be your name in ASCII art");
                break;
				case 50:
                System.out.println("Your Reward will be a public display of your donation on Moodle ! Congrats");
                break;
				case 100:
                System.out.println("Your Reward will be a uni USB Stick of 128GB");
				break;
            case 200:
                System.out.println("Your Reward will be a uni.lu Smartphone case + Keychain I love Programming1");
				break;
				case 500:
                System.out.println("Your Reward will be an autograph of your professors+ 5 free lunches at the Food house");
                break;
            default:
                System.out.println("Your donation value is wrong");
                break;
        }
		scanner.close();
	}
}