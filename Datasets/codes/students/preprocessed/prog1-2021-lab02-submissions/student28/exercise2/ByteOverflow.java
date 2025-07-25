public class ByteOverflow {

	public static void main(String[] args) {
		byte a;
		byte b;
		a = 127;
		b = -128;
		System.out.println(a);
		System.out.println(b);
		a ++;
		b --;
		System.out.println(a);
		System.out.println(b);

	}
}