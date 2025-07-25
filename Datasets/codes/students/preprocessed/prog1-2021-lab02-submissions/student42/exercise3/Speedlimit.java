import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int roadTypeId;

		String[] roadType = {"motorway", "ordinary", "town", "calmed"}; 

		int speedlimitdef = 550; 

		double[] e = {0.05, 0.3, 0.5};

		int[] fines = {50, 150, 500};

		double speed;
		double exceededby = 0;
		double exceededbypercentage = 0;
		double exceededbypercentageprint = 0;

		System.out.print("Please enter road type id: ");
		System.out.println("for - motorway type 1: ");			
		System.out.println("    - ordinary type 2: ");
		System.out.println("    - town     type 3: ");
		System.out.println("    - calmed   type 4: ");
	
		roadTypeId = scanner.nextInt();

		if ((roadTypeId<1)|| (roadTypeId>4)) {System.out.println("Exiting... "); System.exit(0);} 
		else if (roadTypeId==1) {speedlimitdef = 130;}
		else if (roadTypeId==2) {speedlimitdef = 90;}
		else if (roadTypeId==3) {speedlimitdef = 50; }
		else {speedlimitdef = 30; };

		System.out.println("Please type the speed: ");
		speed = scanner.nextDouble();
		
		if (speed>550) {System.out.println("It's highly unlikely for a 2021 commercial car to reach this speed! "); System.exit(0);};

		if (speed==0) {System.out.println("The car is simply not moving at all... Traffic jam perhaps? "); System.exit(0);};

		if (speed<0) {speed *= -1;}
	
		if (speed<=speedlimitdef) {System.out.println("Speed OK for " + roadType[roadTypeId-1]+". "); System.exit(0);} ; 
		
		exceededby = (speed-speedlimitdef);
		exceededbypercentage = (exceededby/speedlimitdef);
		exceededbypercentageprint = (exceededbypercentage*(100));
		if (speed >= 490) {System.out.println("Congratulations on reaching the speed of " + speed + " in your 2021 Koenigsegg Jesko Absolut! However... ");};

		System.out.println("Too fast for " + (roadType[roadTypeId-1]) + " - " + exceededby + "... ("+ exceededbypercentageprint +"%) over the limit! ");

		if (exceededbypercentage<=e[0]) { System.out.print("No fine has been issued, though. ");  }
		else {

			System.out.print("The fine is: ");
			if (exceededbypercentage<=e[1]) {System.out.print(fines[0]);}
			else if (exceededbypercentage<=e[2]) {System.out.print(fines[1]);}
			else {System.out.print(fines[2]);}; 
			System.out.print(" EUR! ");

		};

		System.out.println("Please drive carefully next time! ");

		scanner.close(); };

	}

