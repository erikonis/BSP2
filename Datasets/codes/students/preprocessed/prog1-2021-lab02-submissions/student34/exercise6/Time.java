import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int hour, min, sec;
	
	System.out.println("AM mode? (print true or false)");
	boolean AM = scanner.nextBoolean();
     System.out.println("24h mode?");
	  boolean h = scanner.nextBoolean();
		System.out.println("enter the hour: ");
     hour = scanner.nextInt();
	System.out.println("enter the minutes: ");
	min = scanner.nextInt();
	System.out.println("enter the seconds: ");
	sec = scanner.nextInt();
	
 
	  if (hour<12 && AM == true)
	   System.out.printf("%02d:%02d:%02d AM ",hour , min , sec);
	  if (hour<12 && AM == false)
	   System.out.printf("%02d:%02d:%02d PM ",hour , min , sec);
	   if (hour >12 && h == true)
	   System.out.printf("%02d:%02d:%02d ",hour , min , sec);
	   sec +=5;
	   if (sec >59 ) { 
		   sec = sec%60;
		   min +=1;
		   
	}      
	   if (min >59) {
		   min = min%60;
		   hour +=1;
	}
	
			

	System.out.println("the new time is:");
	if (hour<12 && AM == true)
	System.out.printf("%02d:%02d:%02d AM ",hour , min , sec);
   if (hour<12 && AM == false)
	System.out.printf("%02d:%02d:%02d PM ",hour , min , sec);
	if (hour >12 && h == true)
	System.out.printf("%02d:%02d:%02d ",hour , min , sec);
	
	
	
			
			
	
		
			
		scanner.close();
	}
}