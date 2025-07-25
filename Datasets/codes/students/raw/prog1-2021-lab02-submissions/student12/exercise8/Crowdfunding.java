package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 * Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int answer;
		// TODO: put your code
		System.out.println("Enter the atom that you want to spend :");
		answer = scanner.nextInt();
		
		while (answer != 0) {
			switch (answer) {
				case 10:
					System.out.println(" 10 € Beer with TAs");
					answer = 0;
					break;
				case 20:
					System.out.println(" 20 € Your name in ASCII art");
					answer = answer - 10;
					break;
				case 50:
					System.out.println(" 50 € Public display of your donation on Moodle");
					answer = answer - 30;
					break;
				case 100:
					System.out.println(" 100 € Uni.lu USB Stick of 128GB");
					answer = answer - 50;
					break;
				case 200:
					System.out.println(" 200 € -Uni.lu Smartphone cover  ");
					System.out.println("      -Keychain 'I love Programming 1'");
					answer = answer - 100;

					break;
				case 500:
					System.out.println(" 500 € -Autograph of your professors  ");
					System.out.println("      -Five free lunches at the 'Food house'");
					answer = answer - 300;
					break;

				default:
					System.out.println(answer + " € donations are not allowed!");
					answer=0;

			}
		}

		scanner.close();
	}
}