public class IntegerOverflow {

	public static void main(String[] args) {
		int a, b;
		a = -2147483648;
		b = 2147483647;
		System.out.println("a= " + a + "   b= " + b);
		a = a - 1;
		b = b + 1;
		System.out.println("a= " + a + "   b= " + b);
		double d, c;
		d = (double) a;
		c = (double) b;
		System.out.println("d= " + d + "   c= " + c);
		d = d + 1;
		c = c - 1;
		System.out.println("d= " + d + "   c= " + c);
	}
}