import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

        System.out.println(" Please enter a number: ");
        int ivalue  = console.nextInt();
	if(ivalue%3 == 0)
        	System.out.println("The number " + ivalue + " is divisible by 3.");
	else
		System.out.println("The number " + ivalue + " is NOT divisible by 3.");

		console.close();
	}
}