public class IntegerOverflow {
	
	public static void main(String[] args) {
		int a = -2147483648;
		int b = 2147483647;
		System.out.println("integer = " + "[" + a + "; " + b + "]");

		long longMin = Long.MIN_VALUE;
		long longMax = Long.MAX_VALUE;
		System.out.println("long = " + "[" + longMin + "; " + longMax + "]");
	}
}