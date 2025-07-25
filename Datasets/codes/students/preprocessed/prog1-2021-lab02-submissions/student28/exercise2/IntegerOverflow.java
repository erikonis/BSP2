public class IntegerOverflow {
	
	public static void main(String[] args) {
		int a;
		int b;
		a = 2147483647;
		b = -2147483648;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a++);
		System.out.println(b--);
		long c;
		long d;
		c = 2147483647;
		d = -2147483648;
		System.out.println(++c);
		System.out.println(--d);
	}
}