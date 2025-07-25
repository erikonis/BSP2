package lu.uni.programming1.lab3.exercise8;

public class VariableExtracted {
    public static void main(String[] args) {
		String platform = "macOS Sierra";
		String browser = "Safari";
		double zoomLevel = 1.5;

		boolean platformcheck = platform.toUpperCase().indexOf("MAC") > -1;
        boolean browsercheck = browser.equals("Safari");
        boolean zoomcheck = zoomLevel >= 1.5;
        if (platformcheck && browsercheck && zoomcheck) {
			// do something ...
			
		}
	}
}
