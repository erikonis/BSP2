import java.util.Scanner;

public class Speedlimit {


	public static void main(String[] args) {
		
		int roadTypeId;

		int speedlimit;

		double speed;

		double excess;

		Scanner scanner = new Scanner(System.in);		
		System.out.print("Please enter road type id: ");
		roadTypeId = scanner.nextInt();

		System.out.println("Please enter your driving speed: ");
		speed = Math.max(0, scanner.nextDouble());
	
		if(roadTypeId == 1){
			speedlimit = 130;
			if (speed > speedlimit){
				System.out.println("You are driving too fast, " + ( speed - speedlimit) + "km/h over. Please slow down!");
				excess = (speed/speedlimit)-1;
				if (excess <= 0.05) {
					System.out.println("No fine.");	
				}
				else if (excess > 0.05 && excess <= 0.3){
					System.out.println("You will have a 50€ fine.");
				}
				else if (excess > 0.3 && excess <= 0.5){
					System.out.println("You will have a 150€ fine.");
				}
				else if (excess > 0.5) {
					System.out.println("You will have a 500€ fine.");
				}
			}else if (speed <= speedlimit){
				System.out.println("Your speed is ok for this road type.");
			}
		}
		else if (roadTypeId == 2){
			speedlimit = 90;
			if (speed > speedlimit){
				System.out.println("You are driving too fast, " + ( speed - speedlimit) + "km/h over. Please slow down!");
				excess = (speed/speedlimit)-1;
				if (excess <= 0.05) {
					System.out.println("No fine.");	
				}
				else if (excess > 0.05 && excess <= 0.3){
					System.out.println("You will have a 50€ fine.");
				}
				else if (excess > 0.3 && excess <= 0.5){
					System.out.println("You will have a 150€ fine.");
				}
				else if (excess > 0.5) {
					System.out.println("You will have a 500€ fine.");
				}
			}else if (speed <= speedlimit){
				System.out.println("Your speed is ok for this road type.");
			}
		}
		else if(roadTypeId == 3){
			speedlimit = 50;
			if (speed > speedlimit){
				System.out.println("You are driving too fast, " + ( speed - speedlimit) + "km/h over. Please slow down!");
				excess = (speed/speedlimit)-1;
				if (excess <= 0.05) {
					System.out.println("No fine.");	
				}
				else if (excess > 0.05 && excess <= 0.3){
					System.out.println("You will have a 50€ fine.");
				}
				else if (excess > 0.3 && excess <= 0.5){
					System.out.println("You will have a 150€ fine.");
				}
				else if (excess > 0.5) {
					System.out.println("You will have a 500€ fine.");
				}
			}else if (speed <= speedlimit){
				System.out.println("Your speed is ok for this road.");
			}
		}
		else if(roadTypeId == 4){
			speedlimit = 30;
			if (speed > speedlimit){
				System.out.println("You are driving too fast, " + ( speed - speedlimit) + "km/h over. Please slow down!");
				excess = (speed/speedlimit)-1;
				if (excess <= 0.05) {
					System.out.println("No fine.");	
				}
				else if (excess > 0.05 && excess <= 0.3){
					System.out.println("You will have a 50€ fine.");
				}
				else if (excess > 0.3 && excess <= 0.5){
					System.out.println("You will have a 150€ fine.");
				}
				else if (excess > 0.5) {
					System.out.println("You will have a 500€ fine.");
			
				}
			}else if (speed <= speedlimit){
				System.out.println("Your speed is ok for this road.");
			}
		}
		else {
			System.out.println("Unknown road type:" + roadTypeId);
		}
		scanner.close();
	}
}