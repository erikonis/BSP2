import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a positive number of maximum 4 digits: ");
		int a = scanner.nextInt();
		
		if (a <= 9999 && a > 0){
			int w = a/1000;
			int x = (a-(w*1000))/100;
			int y = (a-(w*1000)-(x*100))/10;
			int z = (a-(w*1000)-(x*100)-(y*10));
			String out;
			out = (w+x+y+z)%3 == 0 ? "Yes":"No";
			System.out.println("Your number is divisible by 3: "+out);
		}
		else {System.out.println("Your number can not be processed. ONLY POSITIVE NUMBERS OF MAX.4 DIGITS ARE ALLOWED");
		}

		scanner.close();
	}
}