import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter road type id: ");

		int roadTypeId = scanner.nextInt();

		System.out.println("Please enter the drivers traveling speed: ");
		int driversSpeed = scanner.nextInt();
		int excess = 0;
		if(roadTypeId == 1) {
			if(driversSpeed > 130) {
				excess = driversSpeed - 130;
				System.out.println("Too fast for motorway road. " + excess + " over the limit!");
			}else { 
				System.out.println("Speed OK for motorway road.");
			}
		}else if (roadTypeId == 2) {
			if(driversSpeed > 90) {
				excess = driversSpeed - 90;
				System.out.println("Too fast for ordinary road. " + excess + " over the limit!");
			}else {
				System.out.println("Speed OK for ordinary road.");
			}
		}else if (roadTypeId == 3) {
			if(driversSpeed > 50) {
				excess = driversSpeed - 50;
				System.out.println("Too fast for town road. " + excess + " over the limit!");
			}else {
				System.out.println("Speed OK for town road.");
			}
		}else if (roadTypeId == 4) {
			if (driversSpeed > 30) {
				excess = driversSpeed - 30;
				System.out.println("Too fast for calmed road. " + excess + " over the limit!");
			}else {
				System.out.println("Speed OK for calmed road.");
			}
		}else {
			System.out.println("Unknown road type: " + roadTypeId);
		}

		if(excess <= 5) 
			System.out.println("Excess range between 0-5 your fine is 0€.");
		if (excess >= 6 && excess <= 30) 
				System.out.println("Excess range between 5-30 your fine is 50€.");
		if (excess >= 31 && excess <= 50) 
				System.out.println("Excess range between 30-50 your fine is 150€.");
		if (excess >= 51) 
				System.out.println("Excess range > 50 your fine is 500€.");
		
	
		scanner.close();
	}
}