import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		System.out.println("motorway id is 1");
		System.out.println("ordinary id is 2");
		System.out.println("town id is 3");
		System.out.println("calmed id is 4");

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Please enter road type id: ");

		int roadTypeId = scanner.nextInt();
		int speedlimit=03;
		label:if (roadTypeId==1){
		 	speedlimit=130; System.out.println(speedlimit);
			 break label;
		}
		else if (roadTypeId==2){
			speedlimit=90;
		}
		else if (roadTypeId==3){
			speedlimit=50;
		}
		else if (roadTypeId==4){
			speedlimit=30;
		}
		else {
			System.out.println("Unknown road type");
		}
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your current speed");
		int speed = scan.nextInt();

		if (speedlimit>=speed) {
			System.out.println("Your speed is OK for this road");
		}
		else {
			System.out.println("Your speed is exceeding th limit");
			if (speed<=1.05*speedlimit){
				System.out.println("you are not going to pay a fine");
			}
			else if (speed>1.05*speedlimit && speed<=1.30*speedlimit){
				System.out.println("you're fine is 50€");
			}
			else if (speed>1.30*speedlimit && speed<=1.50*speedlimit){
				System.out.println("you're fine is 150€");
			}
			else{
				System.out.println("you're fine is 500€");
			}
		}
		
		scanner.close();
		scan.close();
	}
}