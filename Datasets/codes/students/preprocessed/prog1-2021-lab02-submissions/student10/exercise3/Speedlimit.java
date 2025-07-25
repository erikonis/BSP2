import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter road type id: ");

		int roadTypeId = scanner.nextInt();
		String roadType = ""+roadTypeId;
		double speedLimit=0;

		if(roadTypeId==1){
			roadType="motorway";
			speedLimit=130;
		}
		else if(roadTypeId==2){
			roadType="ordinary";
			speedLimit=90;
		}
		else if(roadTypeId==3){
			roadType="town";
			speedLimit=50;
		}
		else if(roadTypeId==4){
			roadType="calmed";
			speedLimit=30;
		}


		System.out.print("Please enter your current speed: ");
		double speed = scanner.nextDouble();

		double speedDif=speed-speedLimit;
		
		if(speedDif==speed)
			System.out.println("Unknown roadtype : "+roadType);
		else if(speedDif>0){
			System.out.println("Too fast for "+roadType+" road. "+speedDif+" km/h over the limit");


			double excessRange = speed/speedLimit-1;
			
			if(excessRange<=0.05)
				System.out.println("Your fine got discarded");
			else if(excessRange<=0.3)
				System.out.println("Your fine is 50 euro");
			else if(excessRange<=0.5)
				System.out.println("Your fine is 150 euro");
			else
				System.out.println("Your fine is 500 euro");
		}
		else if(speedDif<=0)
			System.out.println("speed OKAY for "+roadType+" road");

		
		scanner.close();
	}
}