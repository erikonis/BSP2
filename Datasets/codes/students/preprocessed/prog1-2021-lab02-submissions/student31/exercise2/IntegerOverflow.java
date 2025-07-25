public class IntegerOverflow {
	
	public static void main(String[] args) {
		static void Finecheck2()
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
