import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {

;
		
		;
		try(Scanner scanner = new Scanner(System.in)){

		;
		
		
		System.out.print("Please enter road type id: ");

		int roadTypeId = scanner.nextInt();

		System.out.println("Please enter your Speed: ");
		
		int Speed = scanner.nextInt();
		
		int ExceededSpeed = Speed - 130;
		int ExceededSpeed2 = Speed - 90;
		int ExceededSpeed3 = Speed -50 ;
		int ExceededSpeed4 = Speed -30 ;

		


		
		
		if (roadTypeId == 1 && Speed>130) { System.out.println(ExceededSpeed+" km/h "+"over the limit!");

	}
		else if ( roadTypeId == 1 && Speed<=130 ) {  System.out.println("Speed OK for the motorway road");

		}

		if (roadTypeId == 2 && Speed>90) { System.out.println(ExceededSpeed2+" km/h "+"over the limit!");

	}
		else if ( roadTypeId == 2 && Speed<=90 ) {  System.out.println("Speed OK for the ordinary road");
	}

	if (roadTypeId == 3 && Speed>50) { System.out.println(ExceededSpeed3+" km/h "+"over the limit!");

	}
		else if ( roadTypeId == 3 && Speed<=50 ) {  System.out.println("Speed OK for the town road");
}


		if (roadTypeId == 4 && Speed>30) { System.out.println(ExceededSpeed4+" km/h "+"over the limit!");

	}
		else if ( roadTypeId == 4 && Speed<=30 ) {  System.out.println("Speed OK for the calmed road");


		}

		if (roadTypeId == 1 && ExceededSpeed <= 130*(5/100) && ExceededSpeed >=130*(0/100)) { System.out.println("You have no fine to pay");}
		else if (roadTypeId == 1 && ExceededSpeed <= 130*(30/100) && ExceededSpeed>130*(5/100)) {System.out.println("Your fine is 50€");}
		else if (roadTypeId == 1 && ExceededSpeed <= 130*(50/100) && ExceededSpeed> 130*(30/100)) {System.out.println("Your fine is 150€");}
		else if (roadTypeId == 1 && ExceededSpeed > 130*(50/100)) {System.out.println("Your fine is 500€");

		}


		if (roadTypeId == 2 && ExceededSpeed2 <= 90*(5/100) && ExceededSpeed2 >=90*(0/100)) { System.out.println("You have no fine to pay");}
		else if (roadTypeId == 2 && ExceededSpeed2 <= 90*(30/100) && ExceededSpeed2>90*(5/100)) {System.out.println("Your fine is 50€");}
		else if (roadTypeId == 2 && ExceededSpeed2 <= 90*(50/100) && ExceededSpeed> 90*(30/100)) {System.out.println("Your fine is 150€");}
		else if (roadTypeId == 2 && ExceededSpeed2 > 90*(50/100)) {System.out.println("Your fine is 500€");

		}
		

		if (roadTypeId == 3 && ExceededSpeed3 <= 50*(5/100) && ExceededSpeed3 >=50*(0/100)) { System.out.println("You have no fine to pay");}
		else if (roadTypeId == 3 && ExceededSpeed3 <= 50*(30/100) && ExceededSpeed3>50*(5/100)) {System.out.println("Your fine is 50€");}
		else if (roadTypeId == 3 && ExceededSpeed3 <= 50*(50/100) && ExceededSpeed3> 50*(30/100)) {System.out.println("Your fine is 150€");}
		else if (roadTypeId == 3 && ExceededSpeed3 > 50*(50/100)) {System.out.println("Your fine is 500€");

		}

		if (roadTypeId == 4 && ExceededSpeed4 <= 30*(5/100) && ExceededSpeed4 >=30*(0/100)) { System.out.println("You have no fine to pay");}
		else if (roadTypeId == 4 && ExceededSpeed4 <= 30*(30/100) && ExceededSpeed4>30*(5/100)) {System.out.println("Your fine is 50€");}
		else if (roadTypeId == 4 && ExceededSpeed4 <= 30*(50/100) && ExceededSpeed4> 30*(30/100)) {System.out.println("Your fine is 150€");}
		else if (roadTypeId == 4 && ExceededSpeed4 > 30*(50/100)) {System.out.println("Your fine is 500€");

		}


		}

		


		




		
		
	}
}
	




