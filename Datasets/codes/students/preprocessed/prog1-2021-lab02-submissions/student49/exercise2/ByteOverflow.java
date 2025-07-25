public class ByteOverflow {

	public static void main(String[] args) {
		byte b = 127;
		System.out.println("b = " + b);
		b++;
		System.out.println("b + 1 = " + b);
		b = -128;
		System.out.println("b = " + b);
		b--;
		System.out.println("b - 1 = " + b);
	}
}