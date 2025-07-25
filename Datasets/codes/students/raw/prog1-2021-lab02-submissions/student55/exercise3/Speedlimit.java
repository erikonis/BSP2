package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

/**
 *  Class for Exercises 3.1 and 3.2
 */
public class Speedlimit {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
	
		System.out.print("Please enter road type id: ");

	
		int roadTypeId = scanner.nextInt();
		int speedlimit=0;
		String roadType="";

		switch(roadTypeId)
			{case 1:
				roadType= "motorway";
				speedlimit=130; 
				break;

			case 2:
				roadType= "ordinary";
				speedlimit=90; 
				break;

			case 3:
				roadType= "town";
				speedlimit=50; 
				break;

			case 4:
				roadType= "calmed";
				speedlimit=30; 
				break;
		default:
			}

	System.out.print("Please enter driver's speed:");
	double driverspeed=scanner.nextDouble();

	if(roadTypeId>=5|| roadTypeId<=0)
		System.out.println("Unknown road type: "+ roadTypeId);
	
	else
		if(driverspeed>speedlimit)
		{
		double excess= driverspeed-speedlimit;
		System.out.println("Too fast for "+  roadType + " road. "+ excess +" over the limit!" );

		double excessrate= excess/speedlimit*100;
		int fine;
		if (excessrate<=5)
			fine=0;
		else if(excessrate<=30)
			fine=50;
			else if(excessrate<=50)
			fine=150;
			else fine=500;
		System.out.println("The fine received is " + fine +" Euros :(");

		
		} 
		else System.out.println("Speed OK for "+roadType+" road.");




		scanner.close();
	}
}