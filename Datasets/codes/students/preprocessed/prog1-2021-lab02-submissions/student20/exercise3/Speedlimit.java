import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter road type id: ");
		int roadTypeId = scanner.nextInt();

		System.out.print("Please enter your speed: ");
		float speed = scanner.nextFloat();

		if (roadTypeId == 1) {
			if (speed < 130){
				System.out.print("Speed OK for motorway road");
			}else if (speed <= 1.05*130){
				System.out.print("Too fast for motorway road. " +(speed-130)+" over the limit!\n");
				System.out.print("You will not receive a fine, but be carefull the next time.");

			}else if (speed <= 1.3*130){
				System.out.print("Too fast for motorway road. " +(speed-130)+" over the limit!\n");
				System.out.print("You will receive a fine of 50 euros.");

			}else if (speed <= 1.5*130){
				System.out.print("Too fast for motorway road. " +(speed-130)+" over the limit!\n");
				System.out.print("You will receive a fine of 150 euros.");

			}else{
				System.out.print("Too fast for motorway road. " +(speed-130)+" over the limit!\n");
				System.out.print("You will receive a fine of 500 euros.");

			}
		}else if(roadTypeId == 2){
			if (speed < 90){
				System.out.print("Speed OK for ordinary road");
			}else if (speed <= 1.05*90){
				System.out.print("Too fast for ordinary road. " +(speed-90)+" over the limit!\n");
				System.out.print("You will not receive a fine, but be carefull the next time.");

			}else if (speed <= 1.3*90){
				System.out.print("Too fast for ordinary road. " +(speed-90)+" over the limit!\n");
				System.out.print("You will receive a fine of 50 euros.");

			}else if (speed <= 1.5*90){
				System.out.print("Too fast for ordinary road. " +(speed-90)+" over the limit!\n");
				System.out.print("You will receive a fine of 150 euros.");

			}else{
				System.out.print("Too fast for ordinary road. " +(speed-90)+" over the limit!\n");
				System.out.print("You will receive a fine of 500 euros.");

			}

		}else if(roadTypeId == 3){
			if (speed < 50){
				System.out.print("Speed OK for town road");
			}else if (speed <= 1.05*50){
				System.out.print("Too fast for town road. " +(speed-50)+" over the limit!\n");
				System.out.print("You will not receive a fine, but be carefull the next time.");

			}else if (speed <= 1.3*50){
				System.out.print("Too fast for town road. " +(speed-50)+" over the limit!\n");
				System.out.print("You will receive a fine of 50 euros.");

			}else if (speed <= 1.5*50){
				System.out.print("Too fast for town road. " +(speed-50)+" over the limit!\n");
				System.out.print("You will receive a fine of 150 euros.");

			}else{
				System.out.print("Too fast for town road. " +(speed-50)+" over the limit!\n");
				System.out.print("You will receive a fine of 500 euros.");

			}
		
		}else if(roadTypeId == 4){
			if (speed < 50){
				System.out.print("Speed OK for calmed road");
			}else if (speed <= 1.05*30){
				System.out.print("Too fast for calmed road. " +(speed-30)+" over the limit!\n");
				System.out.print("You will not receive a fine, but be carefull the next time.");

			}else if (speed <= 1.3*30){
				System.out.print("Too fast for calmed road. " +(speed-30)+" over the limit!\n");
				System.out.print("You will receive a fine of 50 euros.");

			}else if (speed <= 1.5*30){
				System.out.print("Too fast for calmed road. " +(speed-30)+" over the limit!\n");
				System.out.print("You will receive a fine of 150 euros.");

			}else{
				System.out.print("Too fast for calmed road. " +(speed-30)+" over the limit!\n");
				System.out.print("You will receive a fine of 500 euros.");

			}
			
		}else{
			System.out.print("Unknown road type : "+roadTypeId);
		}
		scanner.close();
	}
}