import java.util.Scanner;

public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please pledge one of the following amounts :10/20/50/100/200/500");
		int money=scanner.nextInt();
		System.out.println("Your reward is:");

		switch(money){
			case 10: 
				System.out.println(" Beer with TA");
				break;
			case 20:
				System.out.println(" Beer with TA \n Your name in ASCII art");
				break;
			case 50:
				System.out.println(" Beer with TA \n Your name in ASCII art \n Public display of your donation on Moodle");
				break;
			case 100:
				System.out.println(" Beer with TA \n Your name in ASCII art \n Public display of your donation on Moodle \n Uni.lu USB stick of 128GB");
				break;
			case 200:
				System.out.println(" Beer with TA \n Your name in ASCII art \n Public display of your donation on Moodle \n Uni.lu USB stick of 128GB \n Uni.lu smartphone cover \n Keycahin ´´I love programming1´´");
				break;
			case 500:
				System.out.println(" Beer with TA \n Your name in ASCII art \n Public display of your donation on Moodle \n Uni.lu USB stick of 128GB \n Uni.lu smartphone cover \n Keycahin ´´I love programming1´´ \n Autograph of your professor \n Five free lunches at ´´Food house´´");
				break;
			default:
				System.out.println(money+" donations are not allowed");
			}

		scanner.close();
	}
}