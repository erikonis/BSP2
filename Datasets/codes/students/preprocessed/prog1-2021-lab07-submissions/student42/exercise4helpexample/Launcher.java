public class Launcher {

	public static void main(String[] args) {

		IntegerSet s1 = new IntegerSet(new int[] { 62, 32, -42, -50, 3, -25, 7, 21, 15, -17, -10, -1, 9 });
		IntegerSet s2 = s1.applyFilter(new EvenFilter());
		IntegerSet s3 = s2.applyFilter(new PositiveFilter());
		IntegerSet s4 = s1.applyFilter(new NegativeFilter());

		s1.printSet();
		s2.printSet();
		s3.printSet();
		s4.printSet();
	}
}