import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter road type id: ");

		int roadTypeId = scanner.nextInt();

		System.out.print("Please enter driver speed: ");
		int driverSpeed= scanner.nextInt();

		String roadType;
		int excess=0;
		int speedLimit=0;

		switch(roadTypeId)
		{
			case 1:
				roadType = "motorway";
				if(driverSpeed<=130)
				{
					System.out.println("Speed OK for " + roadType + " road.");
				}
				else
				{
					excess = driverSpeed-130;
					System.out.println("Too fast for " + roadType + " road. " + excess + " over the limit!");
				}
				speedLimit=130;
				break;
			case 2:
				roadType = "ordinary";
				if(driverSpeed<=90)
				{
					System.out.println("Speed OK for " + roadType + " road.");
				}
				else
				{
					excess = driverSpeed-90;
					System.out.println("Too fast for " + roadType + " road. " + excess + " over the limit!");
				}
				speedLimit=90;
				break;
			case 3:
				roadType = "town";
				if(driverSpeed<=50)
				{
					System.out.println("Speed OK for " + roadType + " road.");
				}
				else
				{
					excess = driverSpeed-50;
					System.out.println("Too fast for " + roadType + " road. " + excess + " over the limit!");
				}
				speedLimit=50;
				break;
			case 4:
				roadType = "calmed";
				if(driverSpeed<=30)
				{
					System.out.println("Speed OK for " + roadType + " road.");
				}
				else
				{
					excess = driverSpeed-30;
					System.out.println("Too fast for " + roadType + " road. " + excess + " over the limit!");
				}
				speedLimit=30;
				break;
			default:
				System.out.println("Unknown road type: " + roadTypeId);
				break;
		}

		if(excess<=speedLimit*5/100)
		{
			System.out.println("fine : 0€");
		}
		else if(excess<=speedLimit*30/100)
		{
			System.out.println("fine : 50€");
		}
		else if(excess<=speedLimit*50/100)
		{
			System.out.println("fine : 150€");
		}
		else
		{
			System.out.println("fine : 500€");
		}
		
		scanner.close();
	}
}