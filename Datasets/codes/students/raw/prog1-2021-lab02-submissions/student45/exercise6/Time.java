package lu.uni.programming1.lab2.exercise6;

import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Time {


/**
 *  Class for Exercise 6
 */
public Time ClassBody;

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

        System.out.println(" Please enter hours in HH : ");
        int ihh  = console.nextInt();
	
 System.out.println(" Please enter Minutes in MM : ");
        int imm  = console.nextInt();
	
 System.out.println(" Please enter Seconds in SS : ");
        int iss  = console.nextInt();
	String itime = "00:00:00" ;

String ierr = "N";
if (ihh < 0 || ihh > 24) {
    String ohherror = "HH Invalid" ;
    System.out.println(ohherror);
    ierr = "Y";
}

if (imm < 0 || imm > 60) {
    String ommerror = "MM Invalid" ;
    System.out.println(ommerror);
    ierr = "Y";
}
if (iss < 0 || iss > 60) {
    String osserror = "SS Invalid" ;
    System.out.println(osserror);
    ierr = "Y";
}

if (ierr == "N")
{

String myTime ;
myTime = ihh + ":" + imm + ":" + iss ;
 SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
//(Date d = df.parse(myTime); 
 Calendar cal = Calendar.getInstance();
 cal.setTime(myTime);
 cal.add(Calendar.SECOND, 5);
 String newTime = df.format(cal.getTime());

        System.out.println("Time in AM/PM "+newTime);
        String ampm = console.nextLine();

		Calendar cal = Calendar.getInstance();
		  cal.setTime();
		  cal.add(Calendar.SECOND, seconds);
		  return cal.getTime();
  }

		console.close();
	}
}