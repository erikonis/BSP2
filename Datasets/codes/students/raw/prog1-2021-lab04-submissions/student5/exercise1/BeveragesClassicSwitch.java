package lu.uni.programming1.lab4.exercise1;

import java.util.Scanner;

public class BeveragesClassicSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the selected menu id:");
		int menu = scanner.nextInt();

		System.out.print("Please enter whether the client is an adult: (true/false)");
		boolean adult = scanner.nextBoolean();

		scanner.close();
		String drink="";

		switch (menu){
			case 1,2: drink= adult? "Red Wine":"Cola";
			break;
			case 3: drink= adult? "White wine":"Lemonade";
			break;
			case 4: drink= adult? "Port wine":"Still Water";
			break;
			case 5: drink= "Sparkling Water";
			break;
			default:
				System.out.println("The restaurant does not have such a menu!");
		}
		System.out.println(drink);
	} 	
}
