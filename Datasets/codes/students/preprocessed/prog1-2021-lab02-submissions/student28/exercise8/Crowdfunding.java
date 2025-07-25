import java.util.Scanner;

public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String tenDollars = "Beer with TAs";
		String twentyDollars = "Your name is in ASCII art";
		String fiftyDollars = "Public display of your donation on Moodle";
		String hunderdDollars = "Uni.lu USB Stick of 128GB";
		String thundredDollars = "Uni.lu Smartphone cover"+ "\n Keychain "+ "\"I love programming\"";
		String fhundredDollars = "Autograph of your professors" + "\n" + "Five free lunches at the" + "\"Food house\"";

		int inputValue = scanner.nextInt();
		/*
		if (inputValue == 10){
			System.out.println(tenDollars);
		}
		if (inputValue == 20){
			System.out.println(tenDollars + "\n" + twentyDollars);
		}
		if (inputValue == 50) {
			System.out.println(tenDollars + "\n" + twentyDollars + "\n" + fiftyDollars);
		}
		if (inputValue == 100){
			System.out.println(tenDollars + "\n" + twentyDollars + "\n" + fiftyDollars + "\n" + hunderdDollars);
		}
		if (inputValue == 200){
			System.out.println(tenDollars + "\n" + twentyDollars + "\n" + fiftyDollars + "\n" + hunderdDollars + "\n" + thundredDollars);
		}
		if (inputValue == 500){
			System.out.println(tenDollars + "\n" + twentyDollars + "\n" + fiftyDollars + "\n" + hunderdDollars + "\n" + thundredDollars + "\n" + fhundredDollars);
		}
		else {
			System.out.println("input incorrect");
		}
		System.out.println("Choose how much to donate: ");
		switch (inputValue) {
			default: System.out.println("input invalid");
			break;

			case 500: System.out.println(fhundredDollars);
		
			case 200: System.out.println(thundredDollars);

			case 100: System.out.println(hunderdDollars);

			case 50: System.out.println(fiftyDollars);

			case 20: System.out.println(twentyDollars);
			
			case 10: System.out.println(tenDollars);
			
			
		}
	

		scanner.close();
	}
}