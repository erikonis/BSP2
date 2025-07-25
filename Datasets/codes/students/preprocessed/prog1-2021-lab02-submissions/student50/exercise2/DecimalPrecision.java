public class DecimalPrecision {

	public static void main(String[] args) {
		
		float f1 = 54321;
		float f2 = 1;
		double d1 = 1.54321;
		double d2 = 1.000000001;
		
		System.out.println(f1+d1);
		System.out.println(f2+d2);
		System.out.println();
		System.out.println(f1+f2);
		System.out.println(d1+d2);
		
	}
}