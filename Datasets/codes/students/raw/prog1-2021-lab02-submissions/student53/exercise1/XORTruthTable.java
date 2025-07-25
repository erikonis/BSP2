package lu.uni.programming1.lab2.exercise1;

/**
 *  Class for Exercise 1
 */
public class XORTruthTable {

	public static void main(String[] args) {
		boolean a = false;
		boolean b = false;
		//Case 1:
		if((a && !b) || (!a && b)) {
			System.out.println(a + " + " + b + " -> " + true);
		}
		else {
			System.out.println(a + " + " + b + " -> " + false);
		}
		//Case 2:
		a = true;
		b = false;
		if((a && !b) || (!a && b)) {
			System.out.println(a + " + " + b + " -> " + true);
		}
		else {
			System.out.println(a + " + " + b + " -> " + false);
		}
		//Case 3:
		a = false;
		b = true;
		if((a && !b) || (!a && b)) {
			System.out.println(a + " + " + b + " -> " + true);
		}
		else {
			System.out.println(a + " + " + b + " -> " + false);
		}
		//Case 4:
		a = true;
		b = true;
		if((a && !b) || (!a && b)) {
			System.out.println(a + " + " + b + " -> " + true);
		}
		else {
			System.out.println(a + " + " + b + " -> " + false +"\n");
		}

		//Case 1:
		a = false;
		b = false;
		if(a ^ b) {
			System.out.println(a + " + " + b + " -> " + true);
		}
		else {
			System.out.println(a + " + " + b + " -> " + false);
		}
		//Case 2:
		a = true;
		b = false;
		if(a ^ b) {
			System.out.println(a + " + " + b + " -> " + true);
		}
		else {
			System.out.println(a + " + " + b + " -> " + false);
		}
		//Case 3:
		a = false;
		b = true;
		if(a ^ b) {
			System.out.println(a + " + " + b + " -> " + true);
		}
		else {
			System.out.println(a + " + " + b + " -> " + false);
		}
		//Case 4:
		a = true;
		b = true;
		if(a ^ b) {
			System.out.println(a + " + " + b + " -> " + true);
		}
		else {
			System.out.println(a + " + " + b + " -> " + false);
		}
	}
}