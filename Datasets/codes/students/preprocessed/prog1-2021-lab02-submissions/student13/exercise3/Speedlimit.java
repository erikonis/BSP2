import java.util.Scanner;


public class Speedlimit {

	public static void main(String[] args) {
		int roadTypeId;
		String roadType = "";
		int speedCurrentlyDriving;
		int allowed =0;
		int excess =0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter road type id: ");

		roadTypeId = scanner.nextInt();

		

		switch(roadTypeId)
		{
			case 1:
			allowed = 130;
			roadType = "motorway";
			break;

			case 2:
			allowed = 90;
			roadType = "ordinary";
			break;

			case 3:
			allowed = 50;
			roadType = "town";
			break;

			case 4:
			allowed = 30;
			roadType = "calmed";
			break;

			default:
			System.out.println("Unknown road type: " + roadTypeId);
			break;
		}


		if(roadTypeId <=4)
		{
			System.out.println("Please enter the speed you are currently driving: ");
			speedCurrentlyDriving = scanner.nextInt();
			excess = speedCurrentlyDriving - allowed;

			if(excess <0)
			{
				System.out.println("Speed OK for " + roadType + " road.");
			}
			else if(excess >0)
			{
				System.out.println("Too fast for " + roadType + " road. " 
				+ excess + " over the limit!");
			}
		}



		if(roadTypeId <=4)
		{
			double percentage = ((double)excess/allowed)*100;

			if(percentage <5)
			{
				System.out.println("Your fine is 0 Euro");
			}
			else if(percentage <30)
			{
				System.out.println("Your fine is 50 Euro");
			}
			else if(percentage <50)
			{
				System.out.println("Your fine is 150 Euro");
			}
			else
			{
				System.out.println("Your fine is 500 Euro");
			}
		}
		
		scanner.close();
	}
}