package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 *  Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here
		//		Hint: you can read whether we want to
		//			  use AM mode as a boolean using the
		//			  nextBoolean() method of Scanner
		System.out.println("Please type in 'True' if you want the 12h format or 'False' if you want the 24h format");
		
		boolean form=scanner.nextBoolean();
		
		
		System.out.println("Give the time in this format: 'HHMMSS'");
		int time=scanner.nextInt();
		int s=time%100;
		int m=((time%10000)-s)/100;
		int h=(time-m-s)/10000;
		
		if(form){
			System.out.println("Type '1' for AM and '2' for PM.");
			int f=scanner.nextInt();
			
			System.out.println("Five seconds later, the time is:");
			s = s+5;
			if(s>59){
				s=s-60;
				if (m<59){
					m++;
				}
				else if (m==59){
					m=0;
					h++;
					if (h==12){
						if(f==1){
							f=2;
						}else if(f==2){
							f=1;
						}
					}
					else if (h>12){	
						h=1;
					}
				}
			}
			
			String form2 = (f==1)? "AM":"PM";
			String hours = String.format("%02d",h);
			String minutes = String.format("%02d",m);
			String seconds = String.format("%02d",s);
			System.out.println(hours+":"+minutes+":"+seconds + " " + form2);
			
		}else{
			System.out.println("Five seconds later, the time is:");
			if (h==24){h=0;}
			s = s+5;
			if(s>59){
				s=s-60;
				if (m<59){
					m++;
				}
				else if (m==59){
					m=0;
					h++;
					if (h==24){h=0;}
				}
			}
			
			String hours = String.format("%02d",h);
			String minutes = String.format("%02d",m);
			String seconds = String.format("%02d",s);
			System.out.println(hours+":"+minutes+":"+seconds + " ");
		}

		scanner.close();
	}
}