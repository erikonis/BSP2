package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;
/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {

		// Initialization
		Scanner scanner = new Scanner(System.in);
		Integer[] nums = {10, 20, 50, 100, 200, 500};
		boolean valid = false;
		String reward1 = "- Beer with TAs\n";
		String reward2 = "- Your name in ASCII art\n";
		String reward3 = "- Public display of your donation on Moodle\n";
		String reward4 = "- Uni.lu USB Stick of 128GB\n";
		String reward5 = "- Uni.lu Smartphone cover \n- Keychain 'I love Programming 1'\n";
		String reward6 = "- Autograph of your professors\n- Five free lunches at the 'Food house'";

		// Asks for the right input by checking if donation is valid
		System.out.println("Please enter your donation (10€, 20€, 50€, 100€, 200€, 500€):");
		int donation = scanner.nextInt();
		while(!valid){
			for(int i = 0; i < 6; i++){
				if(donation == nums[i]){
					valid = true;
					break;
				}
				else{
					donation = scanner.nextInt();
				}
			}
		}

		// Outputs rewards
		switch(donation){
			case 10:
				System.out.println(reward1);
				break;
			case 20:
				System.out.println(reward1+reward2);
				break;
			case 50:
				System.out.println(reward1+reward2+reward3);
				break;
			case 100:
				System.out.println(reward1+reward2+reward3+reward4);
				break;
			case 200:
				System.out.println(reward1+reward2+reward3+reward4+reward5);
				break;
			case 500:
				System.out.println(reward1+reward2+reward3+reward4+reward5+reward6);
				break;
			default:
				System.out.println("ERROR! Try again.");
		}

		scanner.close();
	}
}