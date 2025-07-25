public class ByteOverflow {

	public static void main(String[] args) {
	
		byte a,b;

		 a = 127;
		 b = -127;


		System.out.print ("These are values for a " + a + " and b " + b );

		System.out.print (" These are values for a " + ++a + " and b " + --b );


	}
}