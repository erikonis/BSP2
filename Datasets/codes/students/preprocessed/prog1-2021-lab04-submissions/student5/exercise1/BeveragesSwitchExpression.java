import java.util.Scanner;

public class BeveragesSwitchExpression {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the selected menu id:");
		int menu = scanner.nextInt();

		System.out.print("Please enter whether the client is an adult: (true/false)");
		boolean adult = scanner.nextBoolean();

		scanner.close();

		String suggestion = switch (menu){
			case 1,2 -> adult? "Red Wine":"Cola";
			case 3 -> adult? "White wine":"Lemonade";
			case 4 -> adult? "Port wine":"Still Water";
			case 5 -> "Sparkling Water";
			default -> "ERROR";
		};

		System.out.println("we suggest: " + suggestion);
	}
}
