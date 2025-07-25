package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
System.out.println("Enter your fund in € : ");
		int Fund = scanner.nextInt();

		String reward1 = "Beer with TAs";
		String reward2 = " ;Your name in ASCII Art";
		String reward3 = " ;Public display of your donation on Moodle";
		String reward4 = " ;Uni.lu USB Stick of 128GB";
		String reward5 = " ;Uni.lu Smartphone cover + Keychain ´I love Programming 1´";
		String reward6 = " ;Autograph of your professors + Five free lunches at the ´Food house´";

		System.out.println("Your rewards for your fund of " + Fund + "€ are: ");
 
		switch (Fund) {
			case 10 : System.out.println(reward1);
			break;
			case 20 : System.out.println(reward1 +reward2);
			break;
			case 50 : System.out.println(reward1 + reward2 + reward3);
			break;
			case 100 : System.out.println(reward1 + reward2 + reward3 + reward4);
			break;
			case 200 : System.out.println(reward1 + reward2 + reward3 + reward4 + reward5);
			break;
			case 500 : System.out.println(reward1 + reward2 + reward3 + reward4 + reward5 + reward6);
			break;
			default : System.out.println(" Error, you cannot donate this amount of money");
		}

		

		scanner.close();
	}
}