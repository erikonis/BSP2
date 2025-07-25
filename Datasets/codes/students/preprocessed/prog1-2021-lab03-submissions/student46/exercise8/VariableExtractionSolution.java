public class VariableExtractionSolution {

	public static void main(String[] args) {
		String platform = "macOS Sierra";
		String browser = "Safari";
		double zoomLevel = 1.5;

		boolean macOSPlatform = platform.toUpperCase().indexOf("MAC") > -1;
		boolean safariBrowser = browser.equals("Safari");
		boolean zoomingIn = zoomLevel >= 1.5;

		if (macOSPlatform && safariBrowser && zoomingIn) {
			// do something ...
		}
	}
}