public class ByteOverflow {

	public static void main(String[] args) {
		byte a = -128;
		byte b = 127;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		a--;
		b++;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}