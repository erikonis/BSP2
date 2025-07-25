import java.util.Scanner;
public class Time {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int minutes;
        int seconds;
		int format;
        int hours;
        System.out.println("*********************************************");
        System.out.println("Write the format of the time: ");
        System.out.println("0: am or pm ");
        System.out.println("1: 24hours ");
        format = scanner.nextInt();
        System.out.print("Write the hours of the time: ");
        hours = scanner.nextInt();
        System.out.print("Write the minutes of the time: ");
        minutes = Math.min(Math.max(scanner.nextInt(), 0), 59); //max value =>59
        System.out.print("Write the seconds of the time: ");
        seconds = Math.min(Math.max(scanner.nextInt(), 0), 59); //max value =>59
        if (format == 0)
        {
            hours = Math.min(Math.max(hours, 1), 12);
        } 
        else if (format == 1)
        {
            hours = Math.min(Math.max(hours, 0), 24);
            hours = hours == 24 ? 0 : hours;
        }
        String hStart = hours < 10 ? "0" + hours : "" + hours;
        String minStart = minutes < 10 ? "0" + minutes : "" + minutes;
        String secStart = seconds < 10 ? "0" + seconds : "" + seconds;
        String format1 = "";
        seconds=seconds+5; // add 5 seconds to the seconds => enonce
        if (seconds == 60) 
        {
            seconds = 0;
            minutes=minutes+1;
        }
        else if (minutes == 60) 
        {
            minutes = 0;
            hours=hours+1;
        }
        if (format == 0)
        {
            format1 = "am or pm";
            hours = hours == 13 ? 1 : hours;
        } 
        else if (format == 1) 
        {
            format1 = "24-hour clock";
            hours = hours == 24 ? 0 : hours;
        }
        String hZero = hours < 10 ? "0" : "";
        String mZero = minutes < 10 ? "0" : "";
        String sZero = seconds < 10 ? "0" : "";

        System.out.println(hStart + ":" + minStart + ":" + secStart + " (" + format1 + ")");
        System.out.println("After 5 seconds:");
        
        System.out.println(hZero + hours + ":" + mZero + minutes + ":" + sZero + seconds + " (" + format1 + ")");
        System.out.print("*********************************************");

        
		scanner.close();
	}
}