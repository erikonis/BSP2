package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter road type id: ");
		int roadTypeId = scanner.nextInt();

		System.out.print("Please enter traveling speed: ");
		int travelingSpeed = scanner.nextInt();

		scanner.close();

		boolean overSpeedLimit = false;
		int speedLimit = 0;

		if(roadTypeId==1){
			if(travelingSpeed > 130){
				overSpeedLimit = true;
				speedLimit = 130;
			}
		} else if(roadTypeId==2){
			if(travelingSpeed > 90){
				overSpeedLimit = true;
				speedLimit = 90;
			}
		} else if(roadTypeId==3){
			if(travelingSpeed > 50){
				overSpeedLimit = true;
				speedLimit = 50;
			}
		} else if(roadTypeId==4){
			if(travelingSpeed > 30){
				overSpeedLimit = true;
				speedLimit = 30;
			}
		}

		String roadType = "unknown";

		if(roadTypeId==1){
			roadType = "motorway";
		} else if(roadTypeId==2){
			roadType = "ordinary";
		} else if(roadTypeId==3){
			roadType = "town";
		} if(roadTypeId==4){
			roadType = "calmed";
		}

		int overSpeedLimitInt = travelingSpeed  - speedLimit;
		double overSpeedLimitProcent = (((double)travelingSpeed / (double)speedLimit) * 100.0) -100.0;
		int fine = 0;

		if(overSpeedLimitProcent>5){
			if(overSpeedLimitProcent>30){
				if(overSpeedLimitProcent>50){
					fine = 500;
				}else{
					fine = 150;
				}
			}else{
				fine = 50;
			}
		}

		if(roadTypeId>0){
			if(roadTypeId<5){
				if(overSpeedLimit==false){
					System.out.print("Speed OK for " + roadType + " road");
				}else{
					System.out.print("Too fast for " + roadType + " road. " + overSpeedLimitInt + "(" + overSpeedLimitProcent + "%)" + " over the limit! The fine is " + fine + "€.");
				}
			}else{
				System.out.print("Unknown road type: " + roadTypeId);
			}
		}else{
			System.out.print("Unknown road type: " + roadTypeId);
		}
	}
}