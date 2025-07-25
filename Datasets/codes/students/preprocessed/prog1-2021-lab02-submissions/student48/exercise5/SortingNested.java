import java.util.Scanner;

public class SortingNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 3 intergers numbers : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if ((b<=a)&&(a<=c)){
			System.out.println(b+ "≤" + a+ "≤" + c );	
			if ((c<=a)&&(a<=b)){
			System.out.println(c+ "≤" + a + "≤" + b );
			}
			if ((a<=b)&&(b<=c)){
			System.out.println(a+ "≤" + b + "≤" + c );
			}
			if ((c<=b)&&(b<=a)){
			System.out.println(c+ "≤" + b + "≤" + a );
			}
			if ((b<=c)&&(c<=a)){
			System.out.println(b+ "≤" + c+ "≤" + a );	
			}
			if ((a<=c)&&(c<=b)){
			System.out.println(b+ "≤" + c+ "≤" + a );
			}
		}
		scanner.close();
	}
}