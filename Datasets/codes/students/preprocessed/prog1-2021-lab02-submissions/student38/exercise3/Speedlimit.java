import java.util.Scanner;

public class Speedlimit {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter road type id: ");

		int roadTypeId = scanner.nextInt();
		
		System.out.print("Please enter your speed: ");

		double speed = scanner.nextDouble();


        if  (roadTypeId==1) {
            if (speed<= 130){
            System.out.println("Speed OK for motorway road");
            } else {
            System.out.println("Too fast for motorway road. " + (speed - 130) + " over the limit!");
            }
        } else if (roadTypeId==2){
			if (speed <= 90) {
			System.out.println("Speed OK for ordinary road");
			} else {
			System.out.println("Too fast for ordinary road. " + (speed - 90) + " over the limit!");
				}
        } else if (roadTypeId==3){
			if (speed<=50) {
			System.out.println("Speed OK for town road");
			} else {
			System.out.println("Too fast for town road. " + (speed - 50) +  " over the limit!");
			}
		} else if (roadTypeId==4){
			if (speed<=30) {
			System.out.println("Speed OK for calmed road");
			} else {
			System.out.println("Too fast for calmed road. " + (speed - 30) + " over the limit!");
				}
			}
		else {
		System.out.println("Unknown road type: " + roadTypeId );
		}



		if  (roadTypeId==1 && speed > 130) {
			if((speed-130)<=(130*0.05)){
			System.out.println("Your fine is 0 Eur ");
			} else if((speed-130)>(130*0.05) && (speed-130)<=(130*0.30)) {
			System.out.println("Your fine is 50 Eur ");
			} else if((speed-130)>(130*0.3) && (speed-130)<=(130*0.5)) {
			System.out.println("Your fine is 150 Eur ");
			} else if((speed-130)>(130*0.5)){
			System.out.println("Your fine is 500 Eur ");				
			}
        } else if (roadTypeId==2 && speed > 90) {
			if((speed-90)<=(90*0.05)){
			System.out.println("Your fine is 0 Eur ");
			} else if((speed-90)>(90*0.05) && (speed-90)<=(90*0.30)) {
			System.out.println("Your fine is 50 Eur ");
			} else if((speed-90)>(90*0.3) && (speed-90)<=(90*0.5)) {
			System.out.println("Your fine is 150 Eur ");
			} else if((speed-90)>(90*0.5)){
			System.out.println("Your fine is 500 Eur ");
			}
		} else if (roadTypeId==3 && speed > 50) {
			if((speed-50)<=(50*0.05)){
			System.out.println("Your fine is 0 Eur ");
			} else if((speed-50)>(50*0.05) && (speed-50)<=(50*0.30)) {
			System.out.println("Your fine is 50 Eur ");
			} else if((speed-50)>(50*0.3) && (speed-50)<=(50*0.5)) {
			System.out.println("Your fine is 150 Eur ");
			} else if((speed-50)>(50*0.5)){
			System.out.println("Your fine is 500 Eur ");
			}	
		} else if (roadTypeId==4 && speed > 30) {
			if((speed-30)<=(30*0.05)){
			System.out.println("Your fine is 0 Eur ");
			} else if((speed-30)>(30*0.05) && (speed-30)<=(30*0.30)) {
			System.out.println("Your fine is 50 Eur ");
			} else if((speed-30)>(30*0.3) && (speed-30)<=(30*0.5)) {
			System.out.println("Your fine is 150 Eur ");
			} else if((speed-30)>(30*0.5)){
			System.out.println("Your fine is 500 Eur ");
				}}									
									
		scanner.close();
	}
}