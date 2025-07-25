public class XORTruthTable {

	public static void main(String[] args) {
		boolean a,b, myXOR;
		a=false;
		b=false;
		myXOR = (a&&!b)||(!a&&b);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("My XOR : " + myXOR);
		System.out.println("Implemented XOR : " + (a!=b));
		
		a=false;
		b=true;
		myXOR = (a&&!b)||(!a&&b);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("My XOR : " + myXOR);
		System.out.println("Implemented XOR : " + (a!=b));
		
		a=true;
		b=false;
		myXOR = (a&&!b)||(!a&&b);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("My XOR : " + myXOR);
		System.out.println("Implemented XOR : " + (a!=b));
		
		a=true;
		b=true;
		myXOR = (a&&!b)||(!a&&b);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("My XOR : " + myXOR);
		System.out.println("Implemented XOR : " + (a!=b));
	}
}