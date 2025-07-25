public class XORTruthTable {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = true;

		boolean c = !(a&&b)&&(a||b);

		System.out.println(c);

	}
}