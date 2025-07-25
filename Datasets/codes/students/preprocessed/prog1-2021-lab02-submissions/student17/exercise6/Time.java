import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.print("Enter hours :");
		int  hours= Math.max(0, Math.min(scanner.nextInt(), 23));

		System.out.print("Enter minutes :");
		int  minutes= Math.max(0, Math.min(scanner.nextInt(), 59));

		System.out.print("Enter seconds :");
		int  seconds= Math.max(0, Math.min(scanner.nextInt(), 59));

		System.out.print("Enter AM mode :");
		boolean amMode=scanner.nextBoolean();

		if(amMode)
		{
			hours=hours%12;
		}

		String hoursWZeros;
		if(hours<10)
		{
			hoursWZeros= "0" + hours;
		}
		else
		{
			hoursWZeros= "" + hours;
		}

		String minutesWZeros;
		if(minutes<10)
		{
			minutesWZeros= "0" + minutes;
		}
		else
		{
			minutesWZeros= "" + minutes;
		}

		String secondsWZeros;
		if(seconds<10)
		{
			secondsWZeros= "0" + seconds;
		}
		else
		{
			secondsWZeros= "" + seconds;
		}
		
		System.out.println(hoursWZeros + ":" + minutesWZeros + ":" + secondsWZeros);
		
		if(seconds>=55)
		{
			seconds+=5;
			seconds=seconds%60;
			minutes++;
			if(minutes>59)
			{
				minutes=0;
				hours++;
				if(amMode&&hours==13)
				{
					hours=1;
				}
				else if(!amMode&&hours==24)
				{
					hours=0;
				}
			}
		}
		else
		{
			seconds+=5;
		}

		String hoursWZeros2;
		if(hours<10)
		{
			hoursWZeros2= "0" + hours;
		}
		else
		{
			hoursWZeros2= "" + hours;
		}

		String minutesWZeros2;
		if(minutes<10)
		{
			minutesWZeros2= "0" + minutes;
		}
		else
		{
			minutesWZeros2= "" + minutes;
		}

		String secondsWZeros2;
		if(seconds<10)
		{
			secondsWZeros2= "0" + seconds;
		}
		else
		{
			secondsWZeros2= "" + seconds;
		}
		
		System.out.println(hoursWZeros2 + ":" + minutesWZeros2 + ":" + secondsWZeros2);
		scanner.close();
	}
}