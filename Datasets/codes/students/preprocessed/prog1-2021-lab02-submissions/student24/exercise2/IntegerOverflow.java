public class IntegerOverflow {
	
	public static void main(String[] args) {
		int a0 = -2147483648;
		int b0 = 2147483647;
		System.out.println("int a : "+a0);
		System.out.println("int b : "+b0 +"\n");
		a0--;
		b0++;
		System.out.println("int a : "+a0);
		System.out.println("int b : "+b0 +"\n");
		long a1 = -2147483648;
		long b1 = 2147483647;
		System.out.println("long a : "+a1);
		System.out.println("long b : "+b1 +"\n");
		a1--;
		b1++;
		System.out.println("long a : "+a1);
		System.out.println("long b : "+b1 +"\n");
	}
}