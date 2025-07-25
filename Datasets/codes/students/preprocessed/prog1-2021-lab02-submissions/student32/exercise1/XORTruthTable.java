public class XORTruthTable {

	public static void main(String[] args) {

		boolean a, b, xor;


		a = b = false;
		xor = (a && !b) || (b && !a);
		System.out.println("When a is " + a + " and b is " + b + ", xor is " + xor);

		a = false; b = true;
		xor = (a && !b) || (b && !a);
		System.out.println("When a is " + a + " and b is " + b + ", xor is " + xor);

		a = true; b = false;
		xor = (a && !b) || (b && !a);
		System.out.println("When a is " + a + " and b is " + b + ", xor is " + xor);

		a = b = true;
		xor = (a && !b) || (b && !a);
		System.out.println("When a is " + a + " and b is " + b + ", xor is " + xor);

		System.out.println("--------------------------------------------");
		
		a = b = false;
		xor = a ^ b;
		System.out.println("When a is " + a + " and b is " + b + ", xor is " + xor);
	
		a = false; b = true;
		xor = a ^ b;
		System.out.println("When a is " + a + " and b is " + b + ", xor is " + xor);
	
		a = true; b = false;
		xor = a ^ b;
		System.out.println("When a is " + a + " and b is " + b + ", xor is " + xor);
	
		a = b = true;
		xor = a ^ b;
		System.out.println("When a is " + a + " and b is " + b + ", xor is " + xor);
	}
}