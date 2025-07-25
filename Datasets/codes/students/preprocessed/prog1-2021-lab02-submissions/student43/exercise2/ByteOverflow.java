public class ByteOverflow {

	public static void main(String[] args) {
		byte a = -128;
		byte b = 127;
		System.out.println("A: "+a--);
		System.out.println("B: "+b++);
		System.out.println("Increment");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
	}
}