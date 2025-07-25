import java.util.Scanner;


public class Speedlimit {

	public static void main(String[] args) {
	 {

	    static int type_id;
	  	static int speed;

	  	static void Finecheck1()
	
		double excess_range = (((speed - 130)/130.0)*100);
		System.out.println("excess range percentage is: "+excess_range);
		if(excess_range >=0 && excess_range <= 5)
		{
			System.out.println("Fine is 0 euro...");
			
		}
		else if(excess_range >=5 && excess_range <= 30)
		{
			System.out.println("Fine is 50 euro...");
			
		}
		else if(excess_range >=30 && excess_range <= 50)
		{
			System.out.println("Fine is 150 euro...");
			
		}
		else if(excess_range >50)
		{
			System.out.println("Fine is 500 euro...");
			
		}

	}

		scanner.close();
	}
}static void Finecheck2()
{
	double excess_range = ((speed - 90)/90.0)*100;
	System.out.println("excess range percentage is: "+excess_range);
	if(excess_range >=0 && excess_range <= 5)
	{
		System.out.println("Fine is 0 euro...");
		
	}
	else if(excess_range >=5 && excess_range <= 30)
	{
		System.out.println("Fine is 50 euro...");
		
	}
	else if(excess_range >=30 && excess_range <= 50)
	{
		System.out.println("Fine is 150 euro...");
		
	}
	else if(excess_range >50)
	{
		System.out.println("Fine is 500 euro...");
		
	}

}

static void Finecheck3()
{
	double excess_range = ((speed - 50)/50.0)*100;
	System.out.println("excess range percentage is: "+excess_range);
	if(excess_range >=0 && excess_range <= 5)
	{
		System.out.println("Fine is 0 euro...");
		
	}
	else if(excess_range >=5 && excess_range <= 30)
	{
		System.out.println("Fine is 50 euro...");
		
	}
	else if(excess_range >=30 && excess_range <= 50)
	{
		System.out.println("Fine is 150 euro...");
		
	}
	else if(excess_range >50)
	{
		System.out.println("Fine is 500 euro...");
		
	}

}

static void Finecheck4()
{
	double excess_range = ((speed - 30)/30.0)*100;
	System.out.println("excess range percentage is: "+excess_range);
	if(excess_range >=0 && excess_range <= 5)
	{
		System.out.println("Fine is 0 euro...");
			
	}
	else if(excess_range >=5 && excess_range <= 30)
	{
		System.out.println("Fine is 50 euro...");
		
	}
	else if(excess_range >=30 && excess_range <= 50)
	{
		System.out.println("Fine is 150 euro...");
		
	}
	else if(excess_range >50)
	{
		System.out.println("Fine is 500 euro...");

	}

}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Road type id and driver travelling speed: ");
	type_id = sc.nextInt();
	speed = sc.nextInt();
	switch(type_id)
	{
		case 1:
		 if(speed <= 130)
		  {
		 System.out.println("speed ok for motorway road ");
		}
		else
		 {
		 System.out.println("Too fast for motorway road");
		 Finecheck1();
		 }
		 break;
		 case 2:
		 if(speed <= 90)
		 {
		System.out.println("speed ok for ordinary road ");
		 }
		else
		 {
		 System.out.println("Too fast for ordinary road");
		  Finecheck2();

		 }
		 break;
		 case 3:
		 if( speed <= 50)
		 {
		System.out.println("speed ok for town road ");
		 }
		else
		 {
		 System.out.println("Too fast for town road");
		  Finecheck3();

		 }
		 break;
		 case 4:
		 if( speed <= 30)
		 {
		System.out.println("speed ok for calmed road ");
		 }
		else
		 {
		 System.out.println("Too fast for calmed road");
		  Finecheck4();

		 }
		 break;
		 default:
		 System.out.println("enter type id in between 1-4 ");
		 break;
	 }
   }
}
