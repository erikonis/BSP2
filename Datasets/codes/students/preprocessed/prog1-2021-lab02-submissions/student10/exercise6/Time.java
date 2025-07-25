
import java.util.Scanner;





public class Time {

	public static String toString(int value){
		if(value<10)
			return "0"+value;
		else
			return ""+value;
	}

	public static int checkTime(int hours,int minutes, int seconds, String type) {

		while(seconds>59){
			minutes++;
			seconds=seconds-60;
		}

		while(minutes>59){
			hours++;
			minutes=minutes-60;
		}

	while(hours>23){
			hours=hours-24;
		}	

		if(type=="s")
			return seconds;
		else if(type=="m")
			return minutes;
		else if(type=="h")
			return hours;
		else 
			return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		boolean amMode=false;
		System.out.print("Seconds :");
		int seconds=scanner.nextInt();
		System.out.print("Minutes :");
		int minutes=scanner.nextInt();
		System.out.print("Hour :");
		int hours=scanner.nextInt();

		hours=checkTime(hours, minutes, seconds,"h");
		minutes=checkTime(hours, minutes, seconds, "m");
		seconds=checkTime(hours, minutes, seconds, "s");

		System.out.print("AM/PM Mode :");
		amMode=scanner.nextBoolean();
		boolean am=true;

		if(amMode){
			if(hours>=1&&hours<=12)
				am=true;
			else
				am=false;
				
			hours=checkTime(hours, minutes, seconds,"h");
			minutes=checkTime(hours, minutes, seconds, "m");
			seconds=checkTime(hours, minutes, seconds, "s");

			if(am)
				System.out.println(toString(hours)+"am:"+toString(minutes)+":"+toString(seconds));
			else
				System.out.println(toString(hours)+"pm:"+toString(minutes)+":"+toString(seconds));
		}
		else
			System.out.println(toString(hours)+":"+toString(minutes)+":"+toString(seconds));
		
		seconds=seconds+5;

		hours=checkTime(hours, minutes, seconds,"h");
		minutes=checkTime(hours, minutes, seconds, "m");
		seconds=checkTime(hours, minutes, seconds, "s");
	
			if(amMode){
				if(hours==13&&minutes==0&&seconds<5||hours==1&&minutes==0&&seconds<5)
					am = !am;
				if(hours>=13)
					hours=hours-12;

				hours=checkTime(hours, minutes, seconds,"h");
				minutes=checkTime(hours, minutes, seconds, "m");
				seconds=checkTime(hours, minutes, seconds, "s");

				if(am)
					System.out.println(toString(hours)+"am:"+toString(minutes)+":"+toString(seconds));
				else
					System.out.println(toString(hours)+"pm:"+toString(minutes)+":"+toString(seconds));
			}
			else
			System.out.println(toString(hours)+":"+toString(minutes)+":"+toString(seconds));

		scanner.close();	
	}


}