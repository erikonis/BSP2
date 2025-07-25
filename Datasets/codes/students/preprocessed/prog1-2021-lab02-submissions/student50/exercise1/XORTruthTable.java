public class XORTruthTable {
	
	boolean a;
	boolean b;
	boolean xor;
	
	public void a_XOR_b() {
		System.out.println("==============\n a    b   a^b\n--------------");
		for (int i = 0; i < 4; i++) {
			a = (i >= 2) ? true : false;
			b = (i % 2 == 1) ? true : false;
			xor = (a != b);
			int inta = a ? 1 : 0;
			int intb = b ? 1 : 0;
			int intx = xor ? 1 : 0;
			System.out.printf(" %s    %s    %s\n", inta, intb, intx);
		}
		System.out.println("==============");
	}
	
	public void a_XOR_b_2() {
		for (int i = 0; i < 4; i++) {
			a = (i >= 2) ? true : false;
			b = (i % 2 == 1) ? true : false;
			xor = (a ^ b);
			int inta = a ? 1 : 0;
			int intb = b ? 1 : 0;
			int intx = xor ? 1 : 0;
			System.out.printf(" %s    %s    %s\n", inta, intb, intx);
		}
		System.out.println("==============");
	}

	public static void main(String[] args) {
		
		XORTruthTable x = new XORTruthTable();
		x.a_XOR_b();
		x.a_XOR_b_2();
		
	}
}