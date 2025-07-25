package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

/**
 *  Class for Exercises 3.1 and 3.2
 */
public class Speedlimit {

	public static void main(String[] args) {
		// Ex3.1 - Put your speedlimit checking code here
		//         	Hint: We use a "Scanner" as seen in
		//			Exercise3 of Lab01 "Reading User Input"
		// 	        to read from standard input
		Scanner scanner = new Scanner(System.in);
		
		// Asking the user to enter the road type id
		System.out.print("Please enter road type id: ");

		// Reading the road type id from standard input
		int roadTypeId = scanner.nextInt();
        System.out.print("Please enter speed");
		int excess=0;
        int speed = scanner.nextInt();
		float excessprsanteg=0;
		if(roadTypeId ==1){ 
			if(speed>130){
				excess= speed - 130;
				System.out.print("To fast for motorway " + excess + " over the limit");	
			}else{
				System.out.print("speed OK for motorway");
			}
			 excessprsanteg= excess *100/130;
		}
		if(roadTypeId ==2){ 
			if(speed>90){
				excess= speed - 90;
				System.out.print("To fast for ordinary " + excess + " over the limit");	
			}else{
				System.out.print("speed OK for ordinary ");
			}
			excessprsanteg= excess *100/90;
		}
		if(roadTypeId ==3){ 
			if(speed>50){
			    excess= speed - 50;
				System.out.print("To fast for town " + excess + " over the limit");	
			}else{
				System.out.print("speed OK for town");
			}
			excessprsanteg= excess *100/50;
		}
		if(roadTypeId ==4){ 
			if(speed>30){
				excess= speed - 30;
				System.out.print("To fast for calmed " + excess + " over the limit");	
			}else{
				System.out.print("speed OK for calmed");
			}
			excessprsanteg= excess *100/30;
		}System.out.print(excessprsanteg);
        if (excessprsanteg>0){
			if(excessprsanteg<5){
				System.out.print("fine is 0");	
			}else if(excessprsanteg<30){
				System.out.print("the fine is 50");
			}else if(excessprsanteg<50){
				System.out.print("the fine is 150");
			}else {
				System.out.print("the fine is 500");
			}
		}
		//TODO: Extend the code here to read the current speed etc.
		//		Hint: You can reuse the existing Scanner to 
		//            read the speed as well
		//      Hint: Scanner has a method called nextDouble()
		//		      to read double valued if you wish to do so


		// TODO: Ex3.2 - Extend your code to calculate and print the fine

		
		// Streams should be closed - More details in a later class
		scanner.close();
	}
}