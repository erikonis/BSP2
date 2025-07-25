package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;


public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter 'true' for 24 hour clock or 'false' for 12 hour clock.");

		boolean clocktype = scanner.nextBoolean();
		String clockset = clocktype == true?"24":"12";
		System.out.println("You chose: " + clockset + " hour clock.");

		System.out.println("Please enter hours: ");
		int hour = scanner.nextInt();
		

		System.out.println("Please enter minutes: ");
		int min = scanner.nextInt();
		min = Math.max(min, 0);
		min = Math.min(min, 59);

		System.out.println("Please enter seconds: ");
		int sec = scanner.nextInt();
		sec = Math.max(sec, 0);
		sec = Math.min(sec, 59);

		if (clocktype == true) {
			hour = Math.max(hour, 0);
		    hour = Math.min(hour, 23);

			if (hour < 10 && min < 10 && sec < 10) {
            System.out.println("0" + hour + ":0" + min + ":0" + sec);
			sec = sec + 5;
			if (sec >= 10) {System.out.println("0" + hour + ":0" + min + ":" + sec);}
			else {System.out.println("0" + hour + ":0" + min + ":0" + sec);}
		}

			else if (hour < 10 && min < 10) {
				System.out.println("0" + hour + ":0" + min + ":" + sec);
				sec = sec + 5;

				if (sec > 59) {sec = sec - 60; min = min + 1;
				   if (min >= 10) {System.out.println("0" + hour + ":" + min + ":0" + sec);}
				   else {System.out.println("0" + hour + ":0" + min + ":0" + sec);}}
				else {System.out.println("0" + hour + ":0" + min + ":" + sec);}
			}

			else if (hour < 10 && sec < 10) {
				System.out.println("0" + hour + ":" + min + ":0" + sec);
				sec = sec + 5;
				if (sec >= 10) {System.out.println("0" + hour + ":" + min + ":" + sec);}
				else {System.out.println("0" + hour + ":" + min + ":0" + sec);}
			}

			else if (min < 10 && sec < 10) {
				System.out.println(hour + ":0" + min + ":0" + sec);
				sec = sec + 5;
				if (sec >= 10) {System.out.println(hour + ":0" + min + ":" + sec);}
				else {System.out.println(hour + ":0" + min + ":0" + sec);}
			}

			else if (hour < 10) { 
				System.out.println("0" + hour + ":" + min + ":" + sec);
				sec = sec + 5;
				if (sec > 59) {sec = sec - 60; min = min + 1;
				  if (min > 59) {min = min - 60; hour = hour + 1;
					 if (hour == 10) {System.out.println(hour + ":0" + min + ":0" + sec);} 
					 else {System.out.println("0" + hour + ":0" + min + ":0" + sec);}}
				  else {System.out.println("0" + hour + ":" + min + ":0" + sec);}}
				else {System.out.println("0" + hour + ":" + min + ":" + sec);}
			}

			else if (min < 10) {
				System.out.println(hour + ":0" + min + ":" + sec);
				sec = sec + 5;

				if (sec > 59) {sec = sec - 60; min = min + 1;
				   if (min >= 10) {System.out.println(hour + ":" + min + ":0" + sec);}
				   else {System.out.println(hour + ":0" + min + ":0" + sec);}}
				else {System.out.println(hour + ":0" + min + ":" + sec);}
			}

			else if (sec < 10) {
				System.out.println(hour + ":" + min + ":0" + sec);
				sec = sec + 5;
				if (sec >= 10) {System.out.println(hour + ":" + min + ":" + sec);}
				else {System.out.println(hour + ":" + min + ":0" + sec);}
			}

			else {System.out.println(hour + ":" + min + ":" + sec);
			sec = sec + 5;
			if (sec > 59) {sec = sec - 60; min = min + 1;
			  if (min > 59) {min = min - 60; hour = hour + 1;
				 if (hour > 23) {hour = hour - 24; System.out.println("0"+ hour + ":0" + min + ":0" + sec);} 
				 else {System.out.println(hour + ":0" + min + ":0" + sec);}}
			  else {System.out.println(hour + ":" + min + ":0" + sec);}}
			else {System.out.println(hour + ":" + min + ":" + sec);}
		}

		}

		else if (clocktype == false) {
			hour = Math.max(hour, 0);
		    hour = Math.min(hour, 11);
			System.out.println("Enter 1 for AM or 2 for PM");
			int mornoon = scanner.nextInt();

			if (mornoon == 1) {

				if (hour < 10 && min < 10 && sec < 10) {
					System.out.println("0" + hour + ":0" + min + ":0" + sec + " AM");
				    sec = sec + 5;
				    if (sec >= 10) {System.out.println("0" + hour + ":0" + min + ":" + sec + " AM");}
				    else {System.out.println("0" + hour + ":0" + min + ":0" + sec + " AM");}}

				else if (hour < 10 && min < 10) {
						System.out.println("0" + hour + ":0" + min + ":" + sec + " AM");
					    sec = sec + 5;

					    if (sec > 59) {sec = sec - 60; min = min + 1;
						   if (min >= 10) {System.out.println("0" + hour + ":" + min + ":0" + sec + " AM");}
						   else {System.out.println("0" + hour + ":0" + min + ":0" + sec + " AM");}}
						else {System.out.println("0" + hour + ":0" + min + ":" + sec + " AM");}}

				else if (hour < 10 && sec < 10) {
						System.out.println("0" + hour + ":" + min + ":0" + sec + " AM");
					    sec = sec + 5;
				        if (sec >= 10) {System.out.println("0" + hour + ":" + min + ":" + sec + " AM");}
				        else {System.out.println("0" + hour + ":" + min + ":0" + sec + " AM");}}

				else if (min < 10 && sec < 10) {
						System.out.println(hour + ":0" + min + ":0" + sec + " AM");
					    sec = sec + 5;
				        if (sec >= 10) {System.out.println(hour + ":0" + min + ":" + sec + " AM");}
				        else {System.out.println(hour + ":0" + min + ":0" + sec + " AM");}}

				else if (hour < 10) { 
						System.out.println("0" + hour + ":" + min + ":" + sec + " AM");
					    sec = sec + 5;
					    if (sec > 59) {sec = sec - 60; min = min + 1;
						  if (min > 59) {min = min - 60; hour = hour + 1;
						     if (hour == 10) {System.out.println(hour + ":0" + min + ":0" + sec + " AM");} 
							 else {System.out.println("0" + hour + ":0" + min + ":0" + sec + " AM");}}
						  else {System.out.println("0" + hour + ":" + min + ":0" + sec + " AM");}}
						else {System.out.println("0" + hour + ":" + min + ":" + sec + " AM");}}

				else if (min < 10) {
						System.out.println(hour + ":0" + min + ":" + sec + " AM");
						sec = sec + 5;

					    if (sec > 59) {sec = sec - 60; min = min + 1;
						   if (min >= 10) {System.out.println(hour + ":" + min + ":0" + sec + " AM");}
						   else {System.out.println(hour + ":0" + min + ":0" + sec + " AM");}}
						else {System.out.println(hour + ":0" + min + ":" + sec + " AM");}}

				else if (sec < 10) {
						System.out.println(hour + ":" + min + ":0" + sec + " AM");
					    sec = sec + 5;
				        if (sec >= 10) {System.out.println(hour + ":" + min + ":" + sec + " AM");}
				        else {System.out.println(hour + ":" + min + ":0" + sec + " AM");}}

				else {System.out.println(hour + ":" + min + ":" + sec + " AM");
				sec = sec + 5;
				if (sec > 59) {sec = sec - 60; min = min + 1;
				  if (min > 59) {min = min - 60; hour = hour + 1;
					 if (hour > 11) {hour = hour - 12; System.out.println("0"+ hour + ":0" + min + ":0" + sec + " PM");} 
					 else {System.out.println(hour + ":0" + min + ":0" + sec + " AM");}}
				  else {System.out.println(hour + ":" + min + ":0" + sec + " AM");}}
				else {System.out.println(hour + ":" + min + ":" + sec + " AM");}}
			}

			else if (mornoon == 2) {

				if (hour < 10 && min < 10 && sec < 10) {
					System.out.println("0" + hour + ":0" + min + ":0" + sec + " PM");
					sec = sec + 5;
				    if (sec >= 10) {System.out.println("0" + hour + ":0" + min + ":" + sec + " PM");}
				    else {System.out.println("0" + hour + ":0" + min + ":0" + sec + " PM");}
				}

				else if (hour < 10 && min < 10) {
						System.out.println("0" + hour + ":0" + min + ":" + sec + " PM");
						sec = sec + 5;

					    if (sec > 59) {sec = sec - 60; min = min + 1;
						   if (min >= 10) {System.out.println("0" + hour + ":" + min + ":0" + sec + " PM");}
						   else {System.out.println("0" + hour + ":0" + min + ":0" + sec + " PM");}}
						else {System.out.println("0" + hour + ":0" + min + ":" + sec + " PM");}
					}

				else if (hour < 10 && sec < 10) {
						System.out.println("0" + hour + ":" + min + ":0" + sec + " PM");
						sec = sec + 5;
				        if (sec >= 10) {System.out.println("0" + hour + ":" + min + ":" + sec + " PM");}
				        else {System.out.println("0" + hour + ":" + min + ":0" + sec + " PM");}
					}

				else if (min < 10 && sec < 10) {
						System.out.println(hour + ":0" + min + ":0" + sec + " PM");
						sec = sec + 5;
				        if (sec >= 10) {System.out.println(hour + ":0" + min + ":" + sec + " PM");}
				        else {System.out.println(hour + ":0" + min + ":0" + sec + " PM");}
					}

				else if (hour < 10) { 
						System.out.println("0" + hour + ":" + min + ":" + sec + " PM");
						sec = sec + 5;
					    if (sec > 59) {sec = sec - 60; min = min + 1;
						  if (min > 59) {min = min - 60; hour = hour + 1;
						     if (hour == 10) {System.out.println(hour + ":0" + min + ":0" + sec + " PM");} 
							 else {System.out.println("0" + hour + ":0" + min + ":0" + sec + " PM");}}
						  else {System.out.println("0" + hour + ":" + min + ":0" + sec + " PM");}}
						else {System.out.println("0" + hour + ":" + min + ":" + sec + " PM");}
					}

				else if (min < 10) {
						System.out.println(hour + ":0" + min + ":" + sec + " PM");
						sec = sec + 5;

					    if (sec > 59) {sec = sec - 60; min = min + 1;
						   if (min >= 10) {System.out.println(hour + ":" + min + ":0" + sec + " PM");}
						   else {System.out.println(hour + ":0" + min + ":0" + sec + " PM");}}
						else {System.out.println(hour + ":0" + min + ":" + sec + " PM");}
					}

				else if (sec < 10) {
						System.out.println(hour + ":" + min + ":0" + sec + " PM");
						sec = sec + 5;
				        if (sec >= 10) {System.out.println(hour + ":" + min + ":" + sec + " PM");}
				        else {System.out.println(hour + ":" + min + ":0" + sec + " PM");}
					}

				else {System.out.println(hour + ":" + min + ":" + sec + " PM");
				sec = sec + 5;
				if (sec > 59) {sec = sec - 60; min = min + 1;
				  if (min > 59) {min = min - 60; hour = hour + 1;
					 if (hour > 11) {hour = hour - 12; System.out.println("0"+ hour + ":0" + min + ":0" + sec + " AM");} 
					 else {System.out.println(hour + ":0" + min + ":0" + sec + " PM");}}
				  else {System.out.println(hour + ":" + min + ":0" + sec + " PM");}}
				else {System.out.println(hour + ":" + min + ":" + sec + " PM");}}
			}
		}

		scanner.close();
	}
}