import java.util.Scanner;

public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your amount of donation : ");
		int amount = scanner.nextInt();
		String rewards = "Congratulations! You've earned : \n-Beer with TAs,\n-your name in ASCII art,\n-public display of your donation on Moodle,\n-Uni.lu USB Stick of 128GB,\n-Uni.lu smartphone cover,\n-keychain 'I love Programming 1',\n-autograph of your professors,\n-five free lunches at the 'Food house' .";
		String[] reward = rewards.split(",");
		switch(amount){
			case 10:
			    System.out.println(reward[0]);
			break;
			case 20:
			    System.out.println(reward[0]+reward[1]);
			break;
            case 50:
			    System.out.println(reward[0]+reward[1]+reward[2]);
			break;
			case 100:
			    System.out.println(reward[0]+reward[1]+reward[2]+reward[3]);
			break;
			case 200:
			    System.out.println(reward[0]+reward[1]+reward[2]+reward[3]+reward[4]); 
			break;
			case 500:
			    System.out.println(reward[0]+reward[1]+reward[2]+reward[3]+reward[4]+reward[5]);
			break;
			default: System.out.println(amount+"e donations are nor allowed!");
		}
		scanner.close();
	}
}