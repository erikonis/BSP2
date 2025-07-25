package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here

		System.out.print("Enter the amount of your donation (10, 20, 50, 100, 200 or 500: ");
		int donation = scanner.nextInt();
        String rewards;

        rewards = switch (donation) {
            case 10 -> "Beer with TAs";
            case 20 -> "Beer with TAs, your name in ASCII art";
			case 50 -> "Beer with TAs, your name in ASCII art, public display of your donation on Moodle";
			case 100 -> "Beer with TAs, your name in ASCII art, public display of your donation on Moodle, Uni.lu 128GB USB stick";
			case 200 -> "Beer with TAs, your name in ASCII art, public display of your donation on Moodle, Uni.lu 128GB USB stick, Uni.lu smartphone case, keychain 'I love programming 1'";
			case 500 -> "Beer with TAs, your name in ASCII art, public display of your donation on Moodle, Uni.lu 128GB USB stick, Uni.lu smartphone case, keychain 'I love programming 1', autograph of your professors, five free lunches at the 'Food House'";
            default -> {
                System.out.println("Please enter a valid donation amount");
                yield "no rewards";
            }
        };
        System.out.println("Here are your rewards regarding your donation amount: " + rewards);

		scanner.close();
	}
}