public class IntegerOverflow {
	
	public static void main(String[] args) {
	int c, d;
	c = Integer.MAX_VALUE;
	d = Integer.MIN_VALUE;
	System.out.println("Int Boundary values: " + c + " " + d);
	System.out.println("Incremented/Decremented values " + ++c + " " + --d + "\n");

	long e, f;
	e = Long.MAX_VALUE;
	f = Long.MIN_VALUE;
	System.out.println("Long Boundary values: " + e + " " + f);
	System.out.println("Incremented/Decremented values " + ++e + " " + --f + "\n");

	}
}