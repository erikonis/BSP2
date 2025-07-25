import java.util.Scanner;

public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the amount of € you wish to donate: ");

		 int money = scanner.nextInt();

		  if ( 10 > money ) {
			System.out.print("The amount you entered (" + money +  "€" + ") is not on the list. Please choose one of the following values: 10, 20, 50, 100, 200, 500");
		  
		} else if (money == 20) {
			System.out.println("The amount you entered in on the list!");
		
		} else if (money == 10) {
			System.out.println("The amount you entered in on the list!");
		
		} else if (money == 50) {
			System.out.println("The amount you entered in on the list!");
		
		} else if (money == 100) {
			System.out.println("The amount you entered in on the list!");
		
		} else if (money == 200) {
			System.out.println("The amount you entered in on the list!");
		
		} else if (money == 500) {
			System.out.println("The amount you entered in on the list!");
		
		} else if (10 < money) {
			System.out.print("The amount you entered (" + money + ") is not on the list. Please choose one of the following values: 10, 20, 50, 100, 200, 500"); 
		  
		} else if (20 > money) {
			System.out.print("The amount you entered (" + money + ") is not on the list. Please choose one of the following values: 10, 20, 50, 100, 200, 500"); 
		
		} else if (20 < money) {
			System.out.print("The amount you entered (" + money + ") is not on the list. Please choose one of the following values: 10, 20, 50, 100, 200, 500"); 
		
		} else if (50 > money) {
			System.out.print("The amount you entered (" + money + ") is not on the list. Please choose one of the following values: 10, 20, 50, 100, 200, 500"); 
		
		} else if (50 < money) {
			System.out.print("The amount you entered (" + money + ") is not on the list. Please choose one of the following values: 10, 20, 50, 100, 200, 500"); 
		
		} else if (100 > money) {
			System.out.print("The amount you entered (" + money + ") is not on the list. Please choose one of the following values: 10, 20, 50, 100, 200, 500"); 
		
		} else if (100 < money) {
			System.out.print("The amount you entered (" + money + ") is not on the list. Please choose one of the following values: 10, 20, 50, 100, 200, 500"); 
		
		} else if (200 > money) {
			System.out.print("The amount you entered (" + money + ") is not on the list. Please choose one of the following values: 10, 20, 50, 100, 200, 500"); 
		
		} else if (200 < money) {
			System.out.print("The amount you entered (" + money + ") is not on the list. Please choose one of the following values: 10, 20, 50, 100, 200, 500"); 
		
		} else if (500 > money) {
			System.out.print("The amount you entered (" + money + ") is not on the list. Please choose one of the following values: 10, 20, 50, 100, 200, 500"); 
		
		} else if (500 < money) {
			System.out.print("The amount you entered (" + money + ") is not on the list. Please choose one of the following values: 10, 20, 50, 100, 200, 500"); 
		
		} 



		switch (money) {
			case 10:
			 System.out.println("For " + money + " €, you will have an apportunity for a beer with TAs!" );
			 break;
			
			case 20:
			 System.out.println("For " + money + " €, you will have an apportunity for a beer with TAs AND your name will be in ASCII art!" );
			 break;
			
			case 50:
			 System.out.println("For " + money + " €, you will have an apportunity for a beer with TAs AND your name will be in ASCII art AND your donation will be publically displayed on Moodle!" );
			 break;

			case 100:
			 System.out.println("For " + money + " €, you will have an apportunity for a beer with TAs AND your name will be in ASCII art AND your donation will be publically displayed on Moodle AND you will receive a USB stick with a capacity of 128 GB!" );
			 break;

			case 200:
			 System.out.println("For " + money + " €, you will have an apportunity for a beer with TAs AND your name will be in ASCII art AND your donation will be publically displayed on Moodle AND you will receive a USB stick with a capacity of 128 GB AND you will be gifted an UNI.LU Smartphone cover along with a I love Programming 1 keychain!" );
			 break;

			case 500:
			 System.out.println("For " + money + " €, you will have an apportunity for a beer with TAs AND your name will be in ASCII art AND your donation will be publically displayed on Moodle AND you will receive a USB stick with a capacity of 128 GB AND you will be gifted an UNI.LU Smartphone cover along with a I love Programming 1 keychain AND you will be eligible for a autograph of your professors with five free lunches at the Food house in the package!" );
			 break;
			 
		}
		
		
		

		scanner.close();
	}
}