package lu.uni.programming1.lab3.exercise8;

public class VariableExtracted {

	public static void main(String[] args) {
		String platform = "macOS Sierra";
		String browser = "Safari";
		double zoomLevel = 1.5;

		boolean isMAC = platform.toUpperCase().indexOf("MAC") > -1;
		boolean isSafari = browser.equals("Safari");
		boolean isZoomLeverRight = zoomLevel >= 1.5;
		if (isMAC && isSafari && isZoomLeverRight) {
			// do something ...
		}
	}
}