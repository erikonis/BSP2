public class DecimalPrecision {

	public static void main(String[] args) {
		float fBig = 1e1f; // 1*10^1
		float fSmall = 1e-1f; // 1*10^-1
		System.out.println(String.format("fBig = %f ; fSmall = %f ; Sum: %f", fBig, fSmall, fBig+fSmall));
		fBig = 1e2f; // 1*10^2
		fSmall = 1e-2f; // 1*10^-2
		System.out.println(String.format("fBig = %f ; fSmall = %f ; Sum: %f", fBig, fSmall, fBig+fSmall));
		fBig = 1e4f;
		fSmall = 1e-4f;
		System.out.println(String.format("fBig = %f ; fSmall = %f ; Sum: %f", fBig, fSmall, fBig+fSmall));

		System.out.println();

		
		double dBig = 1e4f;
		double dSmall = 1e-4f;
		System.out.println(String.format("dBig = %f ; dSmall = %f ; Sum: %f", dBig, dSmall, dBig+dSmall));
		dBig = 1e6f;
		dSmall = 1e-6f;
		System.out.println(String.format("dBig = %f ; dSmall = %f ; Sum: %f", dBig, dSmall, dBig+dSmall));
		dBig = 1e8f;
		dSmall = 1e-8f;
		System.out.println(String.format("dBig = %f ; dSmall = %f ; Sum: %f", dBig, dSmall, dBig+dSmall));

	}
}