public class IntegerOverflow {
	
	public static void main(String[] args) {
		int i = 2147483647;  // or Integer.MAX_VALUE;
		System.out.println("i = " + i);
		i++;
		System.out.println("i + 1 = " + i);
		i = -2147483648; // or Integer.MIN_VALUE;
		System.out.println("i = " + i);
		i--;
		System.out.println("i - 1 = " + i);

		
		long l = Long.MAX_VALUE;
		System.out.println("l = " + l);
		l++;
		System.out.println("l + 1 = " + l);
		l = Long.MIN_VALUE;
		System.out.println("l = " + l);
		l--;
		System.out.println("l - 1 = " + l);
	}
}