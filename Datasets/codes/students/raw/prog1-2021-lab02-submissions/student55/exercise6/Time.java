package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 *  Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please mention the clock type(1 for 12h one, 2 for 24h one ): ");
		int clockType= scanner.nextInt();
		int h,m,s;

		if(clockType==1)
		{ String mer="";
			
		System.out.print("Please read a value for hour:"); 
		h=scanner.nextInt();
			while (h>24||h<=0)
				{
				System.out.print("Hour has to be between 1 and 24! Please read another value: ");
				h=scanner.nextInt();
				}
			if(h>12)
		{		h=h-12;
			mer="PM";
			}
		else mer="AM";

		System.out.print("Please read a value for minute:"); 
		m=scanner.nextInt();
			while (m>59||m<0)
				{
				System.out.print("Minute has to be between 0 and 59! Please read another value: ");
				m=scanner.nextInt();
				}

		System.out.print("Please read a value for second:"); 
		s=scanner.nextInt();
		while (s>59||s<0)
			{
			System.out.print("Second has to be between 0 and 59! Please read another value: ");
			s=scanner.nextInt();
			}

	

			




		String hh,mm,ss;
		if(h<=9)
			hh="0"+h;
		else hh=""+h;
		if(m<=9)
			mm="0"+m;
		else mm=""+m;
		if(s<=9)
			ss="0"+s;
		else ss=""+s;
			System.out.println("The time now is  "+hh+":"+mm+":"+ss+" "+mer);

		if(s+5>=60)
			{s=s+5-60;
			m=m+1;
			if(m==60)
			{m=0;h++;
			if(h>=13)
			{h=1;
			if (mer=="PM")
				mer="AM";
			else mer="PM";}
			else if(h==12)
				if (mer=="PM")
				mer="AM";
				else mer="PM";}
			}
		
			else s=s+5;
		
		if(h<=9)
			hh="0"+h;
		else hh=""+h;
		if(m<=9)
			mm="0"+m;
		else mm=""+m;
		if(s<=9)
			ss="0"+s;
		else ss=""+s;
		System.out.println("The time in 5 sec is  "+hh+":"+mm+":"+ss+" "+mer);


		}

		else if(clockType==2)
		{
		System.out.print("Please read a value for hour:"); 
		h=scanner.nextInt();
			while (h>23||h<0)
				{
				System.out.print("Hour has to be between 0 and 23! Please read another value: ");
				h=scanner.nextInt();
				}

		System.out.print("Please read a value for minute:"); 
		m=scanner.nextInt();
			while (m>59||m<0)
				{
				System.out.print("Minute has to be between 0 and 59! Please read another value: ");
				m=scanner.nextInt();
				}

		System.out.print("Please read a value for second:"); 
		s=scanner.nextInt();
		while (s>59||s<0)
			{
			System.out.print("Second has to be between 0 and 59! Please read another value: ");
			s=scanner.nextInt();
			}


		String hh,mm,ss;
		if(h<=9)
			hh="0"+h;
		else hh=""+h;
		if(m<=9)
			mm="0"+m;
		else mm=""+m;
		if(s<=9)
			ss="0"+s;
		else ss=""+s;
			System.out.println("The time now is  "+hh+":"+mm+":"+ss);

		if(s+5>=60)
			{s=s+5-60;
			m=m+1;
			if(m==60)
			m=0;h++;
			if(h==24)
			h=0;}
			else s=s+5;
		
		if(h<=9)
			hh="0"+h;
		else hh=""+h;
		if(m<=9)
			mm="0"+m;
		else mm=""+m;
		if(s<=9)
			ss="0"+s;
		else ss=""+s;
		System.out.println("The time in 5 sec is "+hh+":"+mm+":"+ss);


		}

		else System.out.println("This type does not exist srry");

		scanner.close();
	}
}