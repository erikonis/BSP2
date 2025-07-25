import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		double speed = 0;
		double excess = 0;
		String roadtypes = "motorway,ordinary,town,calmed";
		String[] roadtype = roadtypes.split(",");
		int[] speedlimit = {130, 90, 50, 30};
		int[] fine = {0, 50, 150, 500};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter road type id: ");

		int roadTypeId = scanner.nextInt();


        if (roadTypeId==1||roadTypeId==2||roadTypeId==3||roadTypeId==4){
			System.out.print("Please enter the speed: ");
		    speed = scanner.nextDouble();
        }else {
			System.out.println("Unknown road type: " + roadTypeId);
			System.out.print("Please enter a valid road type id: ");
			roadTypeId = scanner.nextInt();
		}
		if (speed>speedlimit[roadTypeId-1]){
			excess = speed - speedlimit[roadTypeId-1];
			System.out.println("Too fast for " + roadtype[roadTypeId-1] + " road. \n" + excess + " over the limit!");
		}else {
			System.out.println("Speed OK for " + roadtype[roadTypeId-1] + "road.");
		}
		




		if (excess!=0){
			double excess_range = (excess / (speedlimit[roadTypeId-1]) )* 100;
			if (excess_range<=5){
				System.out.println("The fine is about " + fine[0]+".");
			}else if(excess_range>5 && excess_range<=30){
				System.out.println("The fine is about " + fine[1]+".");
			}else if(excess_range>30 && excess_range<=50){
				System.out.println("The fine is about " + fine[2]+".");
			}else{
				System.out.println("The is fine about " + fine[3]+".");
			}
		}
		scanner.close();
	}
}