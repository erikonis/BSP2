package lu.uni.programming1.lab3.exercise8;

public class VariableExtraction {

	public static void main(String[] args) {
		String platform = "macOS Sierra";
		String browser = "Safari";
		double zoomLevel = 1.5;

		boolean b = platform.toUpperCase().indexOf("MAC") > -1;
		boolean equals = browser.equals("Safari");
		boolean c = zoomLevel >= 1.5;

		if (b && equals && c) {
			System.out.println("Sara is a good programmer!");
		}
	}
}