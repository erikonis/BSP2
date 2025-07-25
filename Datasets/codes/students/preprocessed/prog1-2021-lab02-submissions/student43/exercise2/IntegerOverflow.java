public class IntegerOverflow {
	
	public static void main(String[] args) {
		int a = -2147483648;
		int b = 2147483647;
		System.out.println("A: "+a--);
		System.out.println("B: "+b++);
		System.out.println("Increment");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		long c = -2147483648;
		long d = 2147483647;
		System.out.println("C: "+c--);
		System.out.println("D: "+d++);
		System.out.println("Increment");
		System.out.println("C: "+c);
		System.out.println("D: "+d);
	}
}