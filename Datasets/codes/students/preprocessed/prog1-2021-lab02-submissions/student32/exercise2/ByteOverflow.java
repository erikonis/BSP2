public class ByteOverflow {

	public static void main(String[] args) {
		byte a = 127;
		byte b = -128;
		
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is :" + b);

		a += 1;
		b -= 1;
		
		System.out.println("The new value of a is: " + a);
		System.out.println("The new value of b is :" + b);

	}
}