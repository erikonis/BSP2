import java.util.Scanner;

public class Crowdfunding {

	public static void main(String[] args) {

		int donation = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("How much do you like to donate to us (available amounts: 10€, 20€, 50€, 100€, 200€, 500€): ");
		donation = scanner.nextInt();

		while(donation != 10 && donation != 20 && donation != 50 && donation != 100 && donation != 200 && donation != 500){

			if(donation != 10 && donation != 20 && donation != 50 && donation != 100 && donation != 200 && donation != 500){

				System.out.print(donation + "€ donations are not allowed! Please choose an diffrent amout to donate (available amounts: 10€, 20€, 50€, 100€, 200€, 500€): ");
				donation = scanner.nextInt();

			} 
		}

		scanner.close();

		if(donation >= 10){

			System.out.println("Reward: ");
			System.out.println("-Beer with TAs");

			if(donation >= 20){

				System.out.println("-Your name in ASCII art");

				if(donation >= 50){

					System.out.println("-Public display of your donation on Moodle");

					if(donation >= 100){

						System.out.println("-Uni.lu USB Stick of 128GB");

						if(donation >= 200){

							System.out.println("-Uni.lu Smartphone cover");
							System.out.println("-Keychain \"I love Programming 1\"");

							if(donation == 500){

								System.out.println("-Autograph of your professors");
								System.out.println("-Five free lunches at the \"Food house\"");

							}
						}
					}
				}
			}
		}
	}
}