import java.util.Scanner;

public class Speedlimit {
	static int fine = 0;
	static int speedLimitHighway = 130;
	static int speedLimitDepartmental = 90;
	static int speedLimitTown = 50;
	static int speedLimitArea = 30;	
	static float percentage;
	public static void main(String[] args) {
		AskUser();
	}

	public static int AskUser() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter road type id: \n" +
				"1 - Motorway \n" +
				"2 - Ordinary \n" +
				"3 - Town \n" +
				"4 - Calmed");

		int roadTypeId = scanner.nextInt();
		System.out.println("Your speed ?");
		Scanner _speed = new Scanner(System.in);
		int speed = _speed.nextInt();
		switch (roadTypeId) {
			case 1:
				System.out.println("Road type ID: " + roadTypeId + "(Motorway)");
				if (speed > speedLimitHighway) {
					System.out.println("Put your hands up ! ("+speed+"/130 km/h)");
					CalculateFine(speed, roadTypeId);
				} else {
					System.out.println("Speed OK for road " + roadTypeId);
				}
				break;
			case 2:
				System.out.println("Road type ID: " + roadTypeId + "(Ordinary)");
				if (speed > speedLimitDepartmental) {
					System.out.println("Put your hands up ! ("+speed+"/90 km/h)");
					CalculateFine(speed, roadTypeId);
				} else {
					System.out.println("Speed OK for road " + roadTypeId);
				}
				break;
			case 3:
				System.out.println("Road type ID: " + roadTypeId + "(Town)");
				if (speed > speedLimitTown) {
					System.out.println("Put your hands up ! ("+speed+"/50 km/h)");
					CalculateFine(speed, roadTypeId);
				} else {
					System.out.println("Speed OK for road " + roadTypeId);
				}
				break;
			case 4:
				System.out.println("Road type ID: " + roadTypeId + "(Calmed)");
				if (speed > speedLimitArea) {
					System.out.println("Put your hands up ! ("+speed+"/30 km/h)");
					CalculateFine(speed,roadTypeId);
				} else {
					System.out.println("Speed OK for road " + roadTypeId);
				}
				break;
			default:
				System.out.println("Unknown road type :" + roadTypeId);
				break;
		}
		_speed.close();
		scanner.close();
		return speed;
	}

	public static float CalcPercent(int roadTypeId, int speed){
		switch(roadTypeId){
			case 1:
				int diffHighway = speed - speedLimitHighway;
				percentage = (diffHighway * speed) / 100;
				return percentage;
			case 2:
				int diffDepartmental = speed - speedLimitDepartmental;
				percentage = (diffDepartmental * speed) / 100;
				return percentage;
			case 3:
				int diffTown = speed - speedLimitTown;
				percentage = (diffTown * speed) / 100;
				return percentage;
			case 4:
				int diffArea = speed - speedLimitArea;
				percentage = (diffArea * speed) / 100;
				return percentage;
		}
		return percentage;
	}
	public static int CalculateFine(int speed, int roadTypeId) {
		int _speed = speed;
		CalcPercent(roadTypeId,_speed);
		if(percentage >= 0 && percentage <= 5){fine = 0;}
		else if(percentage > 5 && percentage <= 30){fine = 50;}
		else if(percentage > 30 && percentage <= 50){fine = 150;}
		else{fine = 500;}

		PrintFine();
		return fine;
	}
	public static void PrintFine(){
        System.out.println("Fine :" + fine + "EUR. ("+percentage+"% exceeded)");
	}
}
