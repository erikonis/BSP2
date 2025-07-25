import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter hour: ");
		
		 int hours = scanner.nextInt();

		System.out.print("Please enter minute: ");

		 int minutes = scanner.nextInt();

		System.out.print("Please enter second: ");

		 int seconds = scanner.nextInt();

		 

		System.out.println("The time you entered is: " + hours + ":" + minutes + ":" + seconds);


		 int seconds5 = seconds + 5;

		 int restsec = seconds5 - 60;
		
		if (seconds5 > 59) {
			System.out.println(seconds5 = restsec);
		}

		int minutes1 = minutes + 1;
		
		if (seconds5 > 59) {
			System.out.println(minutes = minutes1);
		}

		


	
		


		 int restmin = minutes - 60;
		
		if (minutes > 59) {
			System.out.println(minutes = restmin);
		}

		


		 int resthours = hours - 24;

		if (hours > 24) {
			System.out.println(hours = resthours);
		 }


		 
 
		 
		 System.out.print("The time you entered advanced by 5 seconds is: " + hours + ":" + minutes + ":" + seconds5);

		

		





		scanner.close();
	}
}