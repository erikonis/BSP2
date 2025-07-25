import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.print("Do you want to use AM/PM format (True/False)? ");
		boolean formatAmPm = scanner.nextBoolean();

		System.out.print("Enter an hour: ");
		int hour = scanner.nextInt();

		System.out.print("Enter minutes: ");
		int minutes = scanner.nextInt();

		System.out.print("Enter seconds: ");
		int seconds = scanner.nextInt();
		String hourStr = "";
		String minutesStr = "";
		String secondsStr = "";

		if (formatAmPm) {
			System.out.print("Is it AM (True/False)?");
			boolean	amOrPm = scanner.nextBoolean();

			if (hour>=0 && hour<=12 && minutes>=0 && minutes<60 && seconds>=0 && seconds<60) {
				if (hour<10) {
					hourStr = String.format("%02d", hour);
				} else {
					hourStr = String.valueOf(hour);
				}
				if (minutes<10) {
					minutesStr = String.format("%02d", minutes);
				} else {
					minutesStr = String.valueOf(minutes);
				}
				if (seconds<10) {
					secondsStr = String.format("%02d", seconds);
				} else {
					secondsStr = String.valueOf(seconds);
				}
				if (amOrPm) {
					System.out.println("This is the time you entered : " + hourStr + ":" + minutesStr + ":" + secondsStr + "AM");
				} else {
					System.out.println("This is the time you entered : " + hourStr + ":" + minutesStr + ":" + secondsStr + "PM");
				}


				if (seconds>54) {
					seconds = seconds-55;
					if (minutes>58) {
						minutes = minutes-59;
						if (formatAmPm) {
							if (hour>11) {
								hour = hour-11;
							} else {
								hour = hour+1;
							}
						} else {
							if (hour>22) {
								hour = hour-23;
							} else {
								hour = hour+1;
							}
						}
					} else {
						minutes = minutes+1;
					}
				} else {
					seconds = seconds + 5;
				}

				if (hour<10) {
					hourStr = String.format("%02d", hour);
				} else {
					hourStr = String.valueOf(hour);
				}
				if (minutes<10) {
					minutesStr = String.format("%02d", minutes);
				} else {
					minutesStr = String.valueOf(minutes);
				}
				if (seconds<10) {
					secondsStr = String.format("%02d", seconds);
				} else {
					secondsStr = String.valueOf(seconds);
				}
				if (amOrPm) {
					System.out.println("This is the time you entered adding 5 seconds : " + hourStr + ":" + minutesStr + ":" + secondsStr + "AM");
				} else {
					System.out.println("This is the time you entered adding 5 seconds : " + hourStr + ":" + minutesStr + ":" + secondsStr + "PM");
				}

			} else {
				System.out.println("Please enter a valid time.");
			}
		} else {
			if (hour>=0 && hour<24 && minutes>=0 && minutes<60 && seconds>=0 && seconds<60) {
				if (hour<10) {
					hourStr = String.format("%02d", hour);
				} else {
					hourStr = String.valueOf(hour);
				}
				if (minutes<10) {
					minutesStr = String.format("%02d", minutes);
				} else {
					minutesStr = String.valueOf(minutes);
				}
				if (seconds<10) {
					secondsStr = String.format("%02d", seconds);
				} else {
					secondsStr = String.valueOf(seconds);
				}
				System.out.println("This is the time you entered : " + hourStr + ":" + minutesStr + ":" + secondsStr);


				if (seconds>54) {
					seconds = seconds-55;
					if (minutes>58) {
						minutes = minutes-59;
						if (formatAmPm) {
							if (hour>11) {
								hour = hour-11;
							} else {
								hour = hour+1;
							}
						} else {
							if (hour>22) {
								hour = hour-23;
							} else {
								hour = hour+1;
							}
						}
					} else {
						minutes = minutes+1;
					}
					
				} else {
					seconds = seconds + 5;
				}

				if (hour<10) {
					hourStr = String.format("%02d", hour);
				} else {
					hourStr = String.valueOf(hour);
				}
				if (minutes<10) {
					minutesStr = String.format("%02d", minutes);
				} else {
					minutesStr = String.valueOf(minutes);
				}
				if (seconds<10) {
					secondsStr = String.format("%02d", seconds);
				} else {
					secondsStr = String.valueOf(seconds);
				}
				System.out.println("This is the time you entered adding 5 seconds : " + hourStr + ":" + minutesStr + ":" + secondsStr);

			} else {
				System.out.println("Please enter a valid time.");
			}
		}
		
		scanner.close();
	}
}