public class ByteOverflow {

	public static void main(String[] args) {
		
		byte overflow = Byte.MAX_VALUE;

		System.out.println("byte max value: " + overflow);
		System.out.println("after adding 1: " + ++overflow);
		System.out.println("after removing 1 again: " + --overflow);
	}
}