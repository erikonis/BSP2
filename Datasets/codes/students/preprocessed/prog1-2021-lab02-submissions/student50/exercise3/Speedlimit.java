package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

/**
 *  Class for Exercises 3.1 and 3.2
 */
public class Speedlimit {
	
	Scanner input = new Scanner(System.in);
	
	public int roadTypeId;
	public int speedLimit;
	public double mySpeed;
	public double excessSpeed;
	public String roadType;
	public int fine;
	
	public void roadInfo() {
		switch(roadTypeId) {
		case 1:
			roadType = "motorway";
			speedLimit = 130;
			break;
		case 2:
			roadType = "ordinary";
			speedLimit = 90;
			break;
		case 3:
			roadType = "town";
			speedLimit = 50;
			break;
		case 4:
			roadType = "calmed";
			speedLimit = 30;
			break;
		default:
			System.out.println("Unknown road type: " + roadTypeId);
			return;
		}
		//speedcheck();
	}
	
	/**
	 * User input for road type id
	 */
	public void setRoadTypeId() {
		System.out.print("Please enter road type id: ");
		roadTypeId = input.nextInt();
	}
	
	/**
	 *	User input for current speed
	 */
	public void setSpeed() {
		System.out.print("Please enter current speed: ");
		mySpeed = input.nextDouble();
	}
	
	/**
	 * Setter for speed limit
	 * @param sLimit
	 */
	public void setSpeedLimit(int sLimit) {
		speedLimit = sLimit;
	}

	
	/**
	 *	Checks whether the speed is within the speed limit.
	 *	If speed is above limit, a fine is applied. 
	 */
	public void speedcheck() {
		if (mySpeed > speedLimit) {
			excessSpeed = mySpeed - speedLimit;
			System.out.printf("Too fast for %s road. %.02f km/h over the limit!", roadType, excessSpeed);
			setFine();
			if (fine == 0) {
				System.out.println("\nYou're lucky you escaped a fine.");
			} else {
				System.out.printf("\nYou've been fined %s €\n", fine);
			}
		} else {
			System.out.printf("Speed OK for %s road.\n", roadType);
		}
	}
	
	/**
	 * Sets the amount of the fine depending on percentage
	 * difference above the road type's speed limit.
	 */
	public void setFine() {
		fine = (mySpeed > 1.50*speedLimit) ? 500 : (mySpeed > (1.30*speedLimit) &&
				(mySpeed <= 1.50*speedLimit) ? 150 : (mySpeed > (1.05*speedLimit) &&
				(mySpeed <= 1.30*speedLimit) ? 50 : 0));
	}
	
	/**
	 * Runs all fine/non-fine possibilities automatically
	 */
	public void autoRun() {
		double mul;
		for (int i = 1; i <= 5; i++) {
			System.out.printf("\n########## ITERATION %s ##########\n", i);
			mul = ( (i == 1) ? 1 : (i == 2) ? 1.05 : (i == 3) ? 1.30 : (i == 4) ? 1.50 : 1.55 );
			System.out.printf("Multiplier: %.2fx the limit\n", mul);
			
			for (int j = 1; j <= 4; j++) {
				roadTypeId = j;
				roadInfo();
				mySpeed = speedLimit * mul;
				System.out.printf("\nID: %s - My Speed: %.2f km/h\n", j, mySpeed);
				speedcheck();
			}
		}
	}
	
	/**
	 * Runs code manually with user input
	 */
	public void manualRun() {
		setRoadTypeId();
		setSpeed();
		roadInfo();
		speedcheck();
	}

	public static void main(String[] args) {

		Speedlimit s = new Speedlimit();
		
		// Run code with manual user input
		 s.manualRun();
		
		// Run code automatically
//		s.autoRun();
		
		System.out.println("\nEnd...");
	}
}