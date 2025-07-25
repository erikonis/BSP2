public class IntegerOverflow {
	
	public static void main(String[] args) {
		int a;
		int b;
		a = -2147483648;
		b = 2147483647;
		System.out.println(a);
		System.out.println(b);
		System.out.println("     ");
		--a;
		++b;
		System.out.println(a);
		System.out.println(b);
		System.out.println("     ");
		long c = -2147483648;
		long d = 2147483647;
		--c;
		++d;
		System.out.println(c);
		System.out.println(d);

	}
}