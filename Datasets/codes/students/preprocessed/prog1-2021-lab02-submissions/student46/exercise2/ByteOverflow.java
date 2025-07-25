public class ByteOverflow {

	public static void main(String[] args) {
		byte a;
		byte b;
		a = -128;
		b = 127;
		System.out.println(a);
		System.out.println(b);

		--a;
		++b;
		System.out.println(a);
		System.out.println(b);
	}
}