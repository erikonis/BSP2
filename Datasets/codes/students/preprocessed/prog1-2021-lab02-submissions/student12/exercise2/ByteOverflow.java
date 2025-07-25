public class ByteOverflow {

	public static void main(String[] args) {
		byte a, b;

		a = -128;
		b = 127;
		System.out.println("a= " + a + "   b= " + b);
		a = (byte) (a - 1);
		b = (byte) (b + 1);

		System.out.println("a= " + a + "   b= " + b);
	}
}