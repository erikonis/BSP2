import java.util.Scanner;

public class DivisibleByThree {
	
		static int sum = 0;
		static int n;
		public static void division()
		{
			for(int i = 0;i<n;i++)
				{
					Scanner sc= new Scanner(System.in);
					int number = sc.nextInt();
					sum = sum + number;
				}
			System.out.println("total sum is:"+sum);
			System.out.println((sum % 3 == 0) ? "number is divisible by three": "number is not divisible by three");
			
		}
		public static void main(String [] args)
		{
			
			Scanner sc= new Scanner(System.in);
			System.out.print("how many digits do you want to enter :  ");  
			 n = sc.nextInt();
			int value = (n <= 4) ? 1: 0;
			switch(value)
			{
				case 0: System.out.println(" enter atmost four digits...");
				break;
				case 1: division();
				break;
			}
	
			
	
		}
	}
	
	