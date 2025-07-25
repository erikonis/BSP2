public class IntegerOverflow {
	
	public static void main(String[] args) {

		int a = 2147483647;
		int b = -2147483648;

		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is :" + b);

		a += 1;
		b -= 1;
		
		System.out.println("The new value of a is: " + a);
		System.out.println("The new value of b is :" + b);


		System.out.println("Doing the same with long variables");

		long c = 2147483647;
		long d = -2147483648;

		System.out.println("The value of c is: " + c);
		System.out.println("The value of d is :" + d);

		c += 1;
		d -= 1;
		
		System.out.println("The new value of c is: " + c);
		System.out.println("The new value of d is :" + d);
	}
}