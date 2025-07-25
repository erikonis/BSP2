public class IntegerOverflow {
	
	public static void main(String[] args) {
		int a = 2147483647;
		int b = -2147483648;
		
		System.out.println("====== Integer Limits ======");
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		a++;
		b--;
		System.out.println(a);
		System.out.println(b);
		System.out.println();

		
		long al = 9223372036854775807L;
		long bl = -9223372036854775808L;
		
		System.out.println("====== Long Limits ======");
		System.out.println(al);
		System.out.println(bl);
		System.out.println();
		al++;
		bl--;
		System.out.println(al);
		System.out.println(bl);
	}
}