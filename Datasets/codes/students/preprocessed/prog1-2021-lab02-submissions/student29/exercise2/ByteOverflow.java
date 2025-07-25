public class ByteOverflow {

	public static void main(String[] args) {
	byte a, b;
	a = Byte.MAX_VALUE;
	b = Byte.MIN_VALUE;
	System.out.println("Byte Boundary values: " + a + " " + b);
	System.out.println("Incremented/Decremented values " + ++a + " " + --b + "\n");
	}
}