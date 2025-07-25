package lu.uni.programming1.lab2.exercise3;
import java.util.Scanner;
public class Speedlimit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter road type id: ");
		// define some int an double variables
		// always use golbal variables if possible
		int roadTypeId = scanner.nextInt();
		double speedlimit=0; // simply the speed limit
		double speeddifference=0; // this double gives use for each szenario the speed difference
		double toFast=0; // gives use the correct value back => ex. 190-170=20 => 20 to fast
		//if user enters the id 1
		//scanner.hasNextDouble() => 2 value
		if (roadTypeId == 1 && scanner.hasNextDouble())
		{
			speedlimit=scanner.nextDouble();
			System.out.println();
			if (speedlimit>130) //check if the given number is bigger than 130
			{
				toFast= (speedlimit-130); // check the difference between the numbers
				speeddifference= ((speedlimit -130)*100/speedlimit); //calculate the percent ex. ((190-130)*100/130)=600/13=46,15
				//then you are 46% to fast
				//output
				System.out.println("You are to fast for the motorway road " +  toFast + " to fast.");
			}
			if (5> speeddifference) // you are 5% above, but there isn't a fine
			{
				System.out.println("So, there isn't any fine");
			}
			else if (30>speeddifference) // you are 30% above, there will be a 50$ fine
			{
				System.out.println("So, the fine is about 50 $");
			}
			else if (50>speeddifference) // you are 50 % above, there will be a 500$ fine
			{
				System.out.println("So, the fine is about 500 $");
			}
			else // your speedlimit is under 130 , so it's ok
			{
				System.out.println("Thanks God, the speed limit is ok");
			}
		}
		//
		//the comments woule be equal for other if and else szenarios
		//
		//if the user enters the id 2
		else if (roadTypeId == 2 && scanner.hasNextDouble())
		{
			speedlimit=scanner.nextDouble();
			if (speedlimit>90)
			{
				toFast= (speedlimit-90);
				speeddifference= ((speedlimit -90)*100/speedlimit);
				System.out.println("You are to fast for the motorway road" +  toFast + "to fast.");
			}
			if (5> speeddifference)
			{
				System.out.println("So, there isn't any fine");
			}
			else if (30>speeddifference)
			{
				System.out.println("So, the fine is about 50$");
			}
			else if (50>speeddifference)
			{
				System.out.println("So, the fine is about 150$");
			}
			else
			{
				System.out.println("Thanks God, the speed limit is ok");
			}
		}
		//if the users enters the id 3
		else if (roadTypeId == 3 && scanner.hasNextDouble())
		{
			speedlimit=scanner.nextDouble();
			if (speedlimit>50)
			{
				toFast= (speedlimit-50);
				speeddifference= ((speedlimit -50)*100/speedlimit);
				System.out.println("You are to fast for the town road " +  toFast + " to fast.");
			}
			if (5> speeddifference)
			{
				System.out.println("So, there isn't any fine");
			}
			else if (30>speeddifference)
			{
				System.out.println("So, the fine is about 50$");
			}
			else if (50>speeddifference)
			{
				System.out.println("So, the fine is about 150$");
			}
			else{
				System.out.println("Thanks God, the speed limit is ok");
			}
		}
		// if the id is 4
		else
		{
			speedlimit=scanner.nextDouble();
			if (speedlimit>30)
			{
				toFast= (speedlimit-30);
				speeddifference= ((speedlimit -30)*100/speedlimit);
				System.out.println("You are to fast for the calmed road " +  toFast + " to fast.");
			}
			if (5> speeddifference)
			{
				System.out.println("So, there isn't any fine");
			}
			else if (30>speeddifference)
			{
				System.out.println("So, the fine is about 50$");
			}
			else if (50>speeddifference)
			{
				System.out.println("So, the fine is about 150$");
			}
			else
			{
				System.out.println("Thanks God, the speed limit is ok");
			}
		}



		
		scanner.close();
	}
}