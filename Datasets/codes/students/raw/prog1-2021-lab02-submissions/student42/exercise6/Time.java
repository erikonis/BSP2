package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 *  Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String isPM;

		String userstring;

		System.out.println("Type the current time in the HH:MM:SS format or the HH:MM:SS:AM or HH:MM:SS:PM format: ");

		userstring = scanner.next();

        char[] ch = new char[userstring.length()];

		for(int i=0; i<userstring.length(); i++){

			ch[i] = userstring.charAt(i);
		};

		if (  (userstring.length()!=8) && (userstring.length()!=11) ) {System.out.println("This time format is not supported. Exiting... "); System.exit(0);}

		else if (userstring.length()==8) 
		
		{
			if ((ch[2]!=':') || (ch[5]!=':'))  {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};

			boolean ccd0 = Character.isDigit(ch[0]); if (ccd0==false) {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};
			boolean ccd1 = Character.isDigit(ch[1]); if (ccd1==false) {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};
			boolean ccd3 = Character.isDigit(ch[3]); if (ccd3==false) {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};
			boolean ccd4 = Character.isDigit(ch[4]); if (ccd4==false) {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};
			boolean ccd6 = Character.isDigit(ch[6]); if (ccd6==false) {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};
			boolean ccd7 = Character.isDigit(ch[7]); if (ccd7==false) {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};

			int c1 = Character.getNumericValue(ch[0]);
			int c2 = Character.getNumericValue(ch[3]);
			int c3 = Character.getNumericValue(ch[6]);

			if ((c1>2) || (c2>5) || (c3>5)   ) {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};

			System.out.println("The time is: " + userstring);

			int rc1 = Character.getNumericValue(ch[1]);
			int rc4 = Character.getNumericValue(ch[4]);
			int rc7 = Character.getNumericValue(ch[7]);

			int clockhours = 10*c1+rc1; int clockminutes = 10*c2+rc4; int clockseconds = 10*c3+rc7;

			if (clockseconds<=54) {clockseconds += 5; System.out.println("The time after 5 seconds will be: " + clockhours + ":" + clockminutes + ":" + clockseconds); System.exit(0);}

			else {

				clockseconds = (clockseconds - 55 );

				if (clockminutes<=58) {clockminutes += 1; System.out.println("The time after 5 seconds will be: " + clockhours + ":" + clockminutes + ":" + clockseconds); System.exit(0);}

				else { 
					
					clockminutes = 0; 

					if (clockhours<=22) {clockhours += 1; System.out.println("The time after 5 seconds will be: " + clockhours + ":" + clockminutes + ":" + clockseconds); System.exit(0);}

					else {

						clockhours = 0;  System.out.println("The time after 5 seconds will be: " + clockhours + ":" + clockminutes + ":" + clockseconds); System.exit(0);};
				};

			};

		}

		else { 

			if ((ch[2]!=':') || (ch[5]!=':') || (ch[8]!=':') )  {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};

			boolean ccd20 = Character.isDigit(ch[0]); if (ccd20==false) {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};
			boolean ccd21 = Character.isDigit(ch[1]); if (ccd21==false) {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};
			boolean ccd23 = Character.isDigit(ch[3]); if (ccd23==false) {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};
			boolean ccd24 = Character.isDigit(ch[4]); if (ccd24==false) {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};
			boolean ccd26 = Character.isDigit(ch[6]); if (ccd26==false) {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};
			boolean ccd27 = Character.isDigit(ch[7]); if (ccd27==false) {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};

			int c21 = Character.getNumericValue(ch[0]);
			int c22 = Character.getNumericValue(ch[3]);
			int c23 = Character.getNumericValue(ch[6]);

			if ((c21>2) || (c22>5) || (c23>5)   ) {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};
			if (  (c21>1) && ((ch[9]=='A')  || (ch[9]=='a'))  ) {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};
			if (   (ch[9] !='a')  && (ch[9] !='A')  &&  (ch[9] !='p') &&  (ch[9] !='P')  )  {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};
			if ( (ch[10]!='m') && (ch[10]!='M')      )  {System.out.println("This time format is not supported. Exiting... "); System.exit(0);};

			System.out.println("The time is: " + userstring);

			int rc21 = Character.getNumericValue(ch[1]);
			int rc24 = Character.getNumericValue(ch[4]);
			int rc27 = Character.getNumericValue(ch[7]); 

			int clock2hours = 10*c21+rc21; int clock2minutes = 10*c22+rc24; int clock2seconds = 10*c23+rc27;
			if (   (ch[9] =='a')  || (ch[9] =='A') ) { isPM = ":AM";}
			else {isPM = ":PM";};

			if (clock2seconds<=54) {clock2seconds += 5; System.out.println("The time after 5 seconds will be: " + clock2hours + ":" + clock2minutes + ":" + clock2seconds + isPM); System.exit(0);}

			else {

				clock2seconds = (clock2seconds - 55 );

				if (clock2minutes<=58) {clock2minutes += 1; System.out.println("The time after 5 seconds will be: " + clock2hours + ":" + clock2minutes + ":" + clock2seconds + isPM); System.exit(0);}

				else { 
					
					clock2minutes = 0; 

					if ((clock2hours!=23) && (clock2hours!=11)) { System.out.println("The time after 5 seconds will be: " + clock2hours + ":" + clock2minutes + ":" + clock2seconds + isPM ); System.exit(0);}

					else {

						clock2hours = 0;  
						
						if (   (ch[9] =='a')  || (ch[9] =='A') ) { isPM = ":PM";}
						else {isPM = ":AM";};
						
						System.out.println("The time after 5 seconds will be: " + clock2hours + ":" + clock2minutes + ":" + clock2seconds + isPM ); System.exit(0);};
				};

			};

		};

		scanner.close();
	}
}