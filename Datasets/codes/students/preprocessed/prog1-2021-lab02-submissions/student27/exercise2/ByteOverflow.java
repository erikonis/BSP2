public class ByteOverflow {

	public static void main(String[] args) {

		byte a, b;

		a = -128;
		b = 127;

		System.out.println("\na : " + a-- + "\nb : " + b++);

		System.out.println("\na : " + a + "\nb : " + b);


	}
}