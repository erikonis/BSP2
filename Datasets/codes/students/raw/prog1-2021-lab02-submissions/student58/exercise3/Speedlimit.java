package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter road type id: ");

		int roadTypeId = scanner.nextInt();

		String roadType = "";

		double maxSpeedLimit = 0;

		double fine = 0;

		System.out.println("Please enter speed: ");

		double speed = scanner.nextDouble();

		//defining roadtype ids with speedlimit
			//roadtypeid1
		if (roadTypeId == 1)
		{maxSpeedLimit = 130;
			roadType = "motorway";}
			//roadtypeid2
		else if (roadTypeId == 2)
		{maxSpeedLimit = 90;
			roadType = "ordinary";}
			//roadtypeid3
		else if (roadTypeId == 3)
		{maxSpeedLimit = 50;
			roadType = "town";}
			//roadtypeid4
		else if (roadTypeId == 4)
		{maxSpeedLimit = 30;
			roadType = "calmed";}
			//unknown road type
		else {
			System.out.println("Unknown road type " + roadTypeId);}

			//seeing if speedlimit is ok
			if (roadTypeId >= 1 && roadTypeId <= 4)			
				if (speed <= maxSpeedLimit)
				{System.out.println("Ok for " + roadType + " road.");}
			//speedlimit not ok
			else {
			System.out.println("Too fast for " + roadType + " road." + (speed - maxSpeedLimit) + " over the limit!");}

			//speedlimit below 5%
		if ((speed - maxSpeedLimit) / maxSpeedLimit * 100 <= 5)
		{fine = 0;
			System.out.println("No fine");}
			// 5% < speedlimit <=30% 
		else if 
		((speed - maxSpeedLimit) / maxSpeedLimit * 100 > 5 && (speed - maxSpeedLimit) / maxSpeedLimit * 100 <= 30)
		{fine = 50;
			System.out.println("The fine is" + fine);}
			// 30% < speedlimit <=35% 
		else if 
		((speed - maxSpeedLimit) / maxSpeedLimit * 100 > 30 && (speed - maxSpeedLimit) / maxSpeedLimit * 100 <= 50)
		{fine = 150;
			System.out.println("The fine is" + fine);}
			//speedlimit > 50% 
		else if 
		((speed - maxSpeedLimit) / maxSpeedLimit * 100 > 50)
		{fine = 500;
			System.out.println("The fine is" + fine);}

		scanner.close();
	}
}
