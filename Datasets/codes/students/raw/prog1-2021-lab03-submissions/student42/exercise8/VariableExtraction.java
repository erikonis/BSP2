package lu.uni.programming1.lab3.exercise8;

public class VariableExtraction {

	public static void main(String[] args) {
		String platform = "macOS Sierra";
		String browser = "Safari";
		double zoomLevel = 1.5;

		if (platform.toUpperCase().indexOf("MAC") > -1 && browser.equals("Safari") && zoomLevel >= 1.5) {
			// do something ...
		}
	}
}