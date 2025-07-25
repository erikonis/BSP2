import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter road type id: ");
		int roadTypeId = scanner.nextInt();
		System.out.print("Please enter your current speed: ");
		double speed = scanner.nextDouble();
		double excess=0;
		double excessRange = 0;
		switch(roadTypeId){
			case 1: 
				if(speed<=130){
					System.out.println("Speed OK for motorway road.");
				}
				else{
					excess = speed-130.0;
					System.out.println("Too fast for motorway road. "+excess+" over the limit!");
				}
				break;
			case 2: 
				if(speed<=90){
					System.out.println("Speed OK for ordinary road.");
				}
				else{
					excess = speed-90.0;
					System.out.println("Too fast for ordinary road. "+excess+" over the limit!");
				}
				break;
			case 3: 
				if(speed<=50){
					System.out.println("Speed OK for town road.");
				}
				else{
					excess = speed-50.0;
					System.out.println("Too fast for town road. "+excess+" over the limit!");
				}
				break;
			case 4: 
				if(speed<=30){
					System.out.println("Speed OK for calmed road.");
				}
				else{
					excess = speed-30.0;
					System.out.println("Too fast for calmed road. "+excess+" over the limit!");
				}
				break;
			default : System.out.println("Unknown road type: "+roadTypeId);
		}
		if(excess!=0){
			excessRange = 100*(excess/speed);
				if(excessRange<5){
					System.out.println("Still slow enough to avoid a fine.");
				}
				else if(excessRange< 30){
					System.out.println("You will receive a 50 euro fine !");
				}
				else if(excessRange< 50){
					System.out.println("You will receive a 150 euro fine !");
				}
				else
					System.out.println("You will receive a 500 euro fine !");
				}
		scanner.close();
	}
}