public class XORTruthTable 
{

	public static void main(String[] args) 
	{
		boolean a;
		boolean b; 

		boolean xor;
		boolean operatorXOR;

		
		 
		a = false; b = false; 
		xor = (!a && b) || (a && !b); // formula found given the symmetry of the XOR operation
		operatorXOR = a ^ b; // truth value calculated with built-in operator
		System.out.println("For a = " + a + " and for b = " + b + ", the result is " + xor + " (" + operatorXOR + ")");

		a = true;
		xor = (!a && b) || (a && !b);
		operatorXOR = a ^ b;
		System.out.println("For a = " + a + " and for b = " + b + ", the result is " + xor + " (" + operatorXOR + ")");

		a = false; b = true;
		xor = (!a && b) || (a && !b);
		operatorXOR = a ^ b;
		System.out.println("For a = " + a + " and for b = " + b + ", the result is " + xor + " (" + operatorXOR + ")");

		a = true;
		xor = (!a && b) || (a && !b);
		operatorXOR = a ^ b;
		System.out.println("For a = " + a + " and for b = " + b + ", the result is " + xor + " (" + operatorXOR + ")");

	}
}