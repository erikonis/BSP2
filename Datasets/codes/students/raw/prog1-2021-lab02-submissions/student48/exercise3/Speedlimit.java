package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// Speed
		System.out.println("Please enter the speed: ");
		int driverSpeed = scanner.nextInt();
	
		//Rules for roadType
		System.out.println("Motorway =1, ordinary=2, town=3, calmed =4 ");
		System.out.println("Please enter road type id: ");
		int roadTypeId = scanner.nextInt();

		//Sanity check : If the user is not respecting rules
		if ((roadTypeId != 1)&&(roadTypeId != 2)&&(roadTypeId != 3)&&(roadTypeId != 4)) {
			System.out.println("Unknown road type :" + roadTypeId);
		}	

		//SpeedExcess
		int speedExcess1 = driverSpeed - 130;
		int speedExcess2 = driverSpeed - 90;
		int speedExcess3 = driverSpeed - 50;
		int speedExcess4 = driverSpeed - 30;

		//Speed & Motorway
		if ((driverSpeed <=130) && (roadTypeId==1)) {
			System.out.println("Speed OK for motorway"); 
		} else if ((driverSpeed > 130) && (roadTypeId==1)) {
			System.out.println("Too fast for motorway, " + speedExcess1 + " km/h over the limit ! " );
		}
		
		// Speed & Ordinary way
		if ((driverSpeed <=90) && (roadTypeId==2)) {
			System.out.println("Speed OK for ordinary road"); 
		} else if (driverSpeed > 90 && roadTypeId==2) {
			System.out.println("Too fast for ordinary road, " + speedExcess2 + " km/h over the limit ! " );
		} 

		// Speed & Town 
		if ((driverSpeed <=50) && (roadTypeId==3)) {
			System.out.println("Speed OK for town road"); 
		} else if ((driverSpeed > 50) && (roadTypeId==3)) {
			System.out.println("Too fast for town road, " + speedExcess3 + " km/h over the limit ! " );
		} 

		// Speed & calmed 
		if ((driverSpeed <=30) && (roadTypeId==4)) {
			System.out.println("Speed OK for calmed road"); 
		} else if ((driverSpeed > 30) && (roadTypeId==4)) {
			System.out.println("Too fast for calmed road, " + speedExcess4 + " km/h over the limit ! " );
		} 

		// Excessrange
		int excessRange1= speedExcess1*100/130;
		int excessRange2 = speedExcess2*100/90;
		int excessRange3 = speedExcess3*100/50;
		int excessRange4 = speedExcess4*100/30;

		//Fine for motorway
			if (roadTypeId==1){
				if(excessRange1<=5){
					System.out.println("No fine, you are under or equal to 5% speed limit");
				}
				else if((excessRange1>5)&&(excessRange1<= 30)){
					System.out.println("Your fine will be 50 euros. Sorry :'(");
				}
				else if((excessRange1>30)&&(excessRange1<= 50)){
					System.out.println("Your fine will be 150 euros. Really sorry :'(");
				}
				else
				{
					System.out.println("Your fine will be 500 euros. Sincerely sorry :'(");
				}
			}

		//fine for ordinary road
			if (roadTypeId==2){
				if(excessRange2<=5){
					System.out.println("No fine, you are under or equal to 5% speed limit");
				}
				else if((excessRange2>5)&&(excessRange2<= 30)){
					System.out.println("Your fine will be 50 euros. Sorry :'(");
				}
				else if((excessRange2>30)&&(excessRange2<= 50)){
					System.out.println("Your fine will be 150 euros. Really sorry :'(");
				}
				else
				{
					System.out.println("Your fine will be 500 euros. Sincerely sorry :'(");
				}
			}

		//Fine for town road
			if (roadTypeId==3){
				if(excessRange3<=5){
					System.out.println("No fine, you are under or equal to 5% speed limit");
				}
				else if((excessRange3>5)&&(excessRange3<= 30)){
					System.out.println("Your fine will be 50 euros. Sorry :'(");
				}
				else if((excessRange3>30)&&(excessRange3<= 50)){
					System.out.println("Your fine will be 150 euros. Really sorry :'(");
				}
				else 
				{
					System.out.println("Your fine will be 500 euros. Sincerely sorry :'(");
				}
			}

		//Fine for calmed road
			if (roadTypeId==4){
				if(excessRange4<=5){
					System.out.println("No fine, you are under or equal to 5% speed limit");
				}
				else if((excessRange4>5)&&(excessRange4<= 30)){
					System.out.println("Your fine will be 50 euros. Sorry :'(");
				}
				else if((excessRange4>30)&&(excessRange4<= 50)){
					System.out.println("Your fine will be 150 euros. Really sorry :'(");
				}
				else 
				{
					System.out.println("Your fine will be 500 euros. Sincerely sorry :'(");
				}
			}

		scanner.close();
		
	}
 }
