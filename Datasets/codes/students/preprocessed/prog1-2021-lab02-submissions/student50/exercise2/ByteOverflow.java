public class ByteOverflow {

	public static void main(String[] args) {
		byte a = (byte) -128;
		byte b = (byte) 127;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		a--;
		b++;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}